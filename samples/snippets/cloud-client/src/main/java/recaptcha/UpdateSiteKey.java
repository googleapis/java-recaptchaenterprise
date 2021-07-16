package recaptcha;

import com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient;
import com.google.protobuf.FieldMask;
import com.google.recaptchaenterprise.v1.Key;
import com.google.recaptchaenterprise.v1.KeyName;
import com.google.recaptchaenterprise.v1.UpdateKeyRequest;
import com.google.recaptchaenterprise.v1.WebKeySettings;
import com.google.recaptchaenterprise.v1.WebKeySettings.ChallengeSecurityPreference;
import com.google.recaptchaenterprise.v1.WebKeySettings.IntegrationType;
import java.io.IOException;

public class UpdateSiteKey {

  public static void main(String[] args) throws IOException {
    String projectID = "project-id";
    String recaptchaSiteKey = "recaptcha-site-key";

    updateSiteKey(projectID, recaptchaSiteKey);
  }

  /**
   * Update the properties of the given site key present under the project id.
   *
   * @param projectID: GCloud Project ID.
   * @param recaptchaSiteKey: Specify the site key to be updated.
   */
  public static void updateSiteKey(String projectID, String recaptchaSiteKey) throws IOException {
    try (RecaptchaEnterpriseServiceClient client = RecaptchaEnterpriseServiceClient.create()) {

      // Set the name and the new settings for the key.
      UpdateKeyRequest updateKeyRequest = UpdateKeyRequest.newBuilder()
          .setKey(Key.newBuilder()
              .setName(KeyName.of(projectID, recaptchaSiteKey).toString())
              .setWebSettings(WebKeySettings.newBuilder()
                  .setIntegrationType(IntegrationType.CHECKBOX)
                  .setChallengeSecurityPreference(ChallengeSecurityPreference.BALANCE).build())
              .build())
          .setUpdateMask(FieldMask.newBuilder().build())
          .build();

      Key response = client.updateKey(updateKeyRequest);

      // Check if the key has been updated.
      if (response.getWebSettings().getIntegrationType() != IntegrationType.CHECKBOX) {
        System.out.println("Error! reCAPTCHA Site key hasn't been updated. Please try again !");
        return;
      }

      System.out.println("reCAPTCHA Site key successfully updated ! ");
    }
  }

}
