/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package account_defender;

// [START recaptcha_enterprise_account_defender_assessment]

import com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient;
import com.google.protobuf.ByteString;
import com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel;
import com.google.recaptchaenterprise.v1.Assessment;
import com.google.recaptchaenterprise.v1.CreateAssessmentRequest;
import com.google.recaptchaenterprise.v1.Event;
import com.google.recaptchaenterprise.v1.ProjectName;
import com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason;
import com.google.recaptchaenterprise.v1.TokenProperties;
import java.io.IOException;
import java.util.List;

public class AccountDefenderAssessment {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectID = "project-id";
    String recaptchaSiteKey = "recaptcha-site-key";
    String token = "recaptcha-token";
    String recaptchaAction = "recaptcha-action";
    ByteString hashedAccountId = ByteString.copyFrom(new byte[]{});

    accountDefenderAssessment(projectID, recaptchaSiteKey, token, recaptchaAction, hashedAccountId);
  }

  /**
   * This assessment detects account takeovers. Input -> Pass in the hashed account id. Result ->
   * Tells if the action represents an account takeover.
   *
   * You can optionally take actions (to trigger an MFA) based on the result.
   *
   * @param projectId: Google Cloud Project ID
   * @param recaptchaSiteKey: Site key obtained by registering a domain/app to use recaptcha
   * services.
   * @param token: The token obtained from the client on passing the recaptchaSiteKey.
   * @param recaptchaAction: Action name corresponding to the token.
   * @param hashedAccountId: HMAC SHA256 - Hashed any unique id of the user executing the action.
   */
  public static void accountDefenderAssessment(
      String projectId, String recaptchaSiteKey, String token, String recaptchaAction,
      ByteString hashedAccountId) throws IOException {
    try (RecaptchaEnterpriseServiceClient client = RecaptchaEnterpriseServiceClient.create()) {

      // Set the properties of the event to be tracked.
      Event event = Event.newBuilder()
          .setSiteKey(recaptchaSiteKey)
          .setToken(token)
          // Set the hashed account id (of the user).
          // Recommended approach: HMAC SHA256 along with salt (or secret key).
          .setHashedAccountId(hashedAccountId).build();

      // Build the assessment request.
      CreateAssessmentRequest createAssessmentRequest =
          CreateAssessmentRequest.newBuilder()
              .setParent(ProjectName.of(projectId).toString())
              .setAssessment(Assessment.newBuilder().setEvent(event).build())
              .build();

      Assessment response = client.createAssessment(createAssessmentRequest);

      // Check integrity of the response token.
      if (!checkTokenIntegrity(response.getTokenProperties(), recaptchaAction)) {
        return;
      }

      // Get the reason(s) and the reCAPTCHA risk score.
      // For more information on interpreting the assessment,
      // see: https://cloud.google.com/recaptcha-enterprise/docs/interpret-assessment
      for (ClassificationReason reason : response.getRiskAnalysis().getReasonsList()) {
        System.out.println(reason);
      }
      float recaptchaScore = response.getRiskAnalysis().getScore();
      System.out.println("The reCAPTCHA score is: " + recaptchaScore);

      // Get the Account Defender result.
      com.google.recaptchaenterprise.v1.AccountDefenderAssessment accountDefenderAssessment = response.getAccountDefenderAssessment();
      System.out.println(accountDefenderAssessment);

      // Get Account Defender label.
      List<AccountDefenderLabel> defenderResult = response.getAccountDefenderAssessment()
          .getLabelsList();
      // Based on the result, can you choose next steps.
      // If the 'defenderResult' field is empty, it indicates that account defender did not have anything to add to the score.
      // Few result labels: ACCOUNT_DEFENDER_LABEL_UNSPECIFIED, PROFILE_MATCH,
      // SUSPICIOUS_LOGIN_ACTIVITY, SUSPICIOUS_ACCOUNT_CREATION, RELATED_ACCOUNTS_NUMBER_HIGH.
      // For more info on interpreting the assessment, see: https://cloud.google.com/recaptcha-enterprise/docs/account-defender#interpret-assessment-details
      System.out.println("Account Defender Assessment Result: " + defenderResult);
    }
  }

  private static boolean checkTokenIntegrity(TokenProperties tokenProperties,
      String recaptchaAction) {
    // Check if the token is valid.
    if (!tokenProperties.getValid()) {
      System.out.println(
          "The Account Defender Assessment call failed because the token was: "
              + tokenProperties.getInvalidReason().name());
      return false;
    }

    // Check if the expected action was executed.
    if (!tokenProperties.getAction().equals(recaptchaAction)) {
      System.out.printf(
          "The action attribute in the reCAPTCHA tag '%s' does not match "
              + "the action '%s' you are expecting to score",
          tokenProperties.getAction(), recaptchaAction);
      return false;
    }
    return true;
  }
}
// [END recaptcha_enterprise_account_defender_assessment]