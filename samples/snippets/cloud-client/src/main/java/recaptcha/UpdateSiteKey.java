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

package recaptcha;

// [START recaptcha_enterprise_update_site_key]

import com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient;
import com.google.protobuf.FieldMask;
import com.google.protobuf.ProtocolStringList;
import com.google.recaptchaenterprise.v1.GetKeyRequest;
import com.google.recaptchaenterprise.v1.Key;
import com.google.recaptchaenterprise.v1.KeyName;
import com.google.recaptchaenterprise.v1.UpdateKeyRequest;
import com.google.recaptchaenterprise.v1.WebKeySettings;
import com.google.recaptchaenterprise.v1.WebKeySettings.ChallengeSecurityPreference;
import com.google.recaptchaenterprise.v1.WebKeySettings.IntegrationType;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class UpdateSiteKey {

  public static void main(String[] args) throws IOException, InterruptedException {
    // TODO(developer): Replace these variables before running the sample.
    String projectID = "your-project-id";
    String recaptchaSiteKeyID = "recaptcha-site-key-id";

    updateSiteKey(projectID, recaptchaSiteKeyID);
  }

  /**
   * Update the properties of the given site key present under the project id.
   *
   * @param projectID: GCloud Project ID.
   * @param recaptchaSiteKeyID: Specify the site key to be updated.
   */
  public static void updateSiteKey(String projectID, String recaptchaSiteKeyID)
      throws IOException, InterruptedException {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the `client.close()` method on the client to safely
    // clean up any remaining background resources.
    try (RecaptchaEnterpriseServiceClient client = RecaptchaEnterpriseServiceClient.create()) {

      // Set the name and the new settings for the key.
      UpdateKeyRequest updateKeyRequest = UpdateKeyRequest.newBuilder()
          .setKey(Key.newBuilder()
              .setName(KeyName.of(projectID, recaptchaSiteKeyID).toString())
              .setWebSettings(WebKeySettings.newBuilder()
                  .addAllowedDomains("exampledomain.com").build())
              .build())
          .setUpdateMask(FieldMask.newBuilder().build())
          .build();

      client.updateKey(updateKeyRequest);

      TimeUnit.SECONDS.sleep(5);

      // Check if the key has been updated.
      GetKeyRequest getKeyRequest = GetKeyRequest.newBuilder()
          .setName(KeyName.of(projectID, recaptchaSiteKeyID).toString()).build();
      Key response = client.getKey(getKeyRequest);

      // Get the allowed domains list.
      ProtocolStringList allowedDomainsList = response.getWebSettings().getAllowedDomainsList();
      if (!allowedDomainsList.stream().anyMatch(x -> x.equalsIgnoreCase("exampledomain.com"))) {
        System.out.println("Error! reCAPTCHA Site key property hasn't been updated. Please try again !");
        return;
      }

      System.out.println("reCAPTCHA Site key successfully updated !");
    }
  }

}
// [END recaptcha_enterprise_update_site_key]