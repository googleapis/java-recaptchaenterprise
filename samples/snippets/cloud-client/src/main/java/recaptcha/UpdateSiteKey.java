package recaptcha;

import com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient;
import com.google.protobuf.FieldMask;
import com.google.recaptchaenterprise.v1.GetKeyRequest;
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
    String recaptchaSiteKeyName = "recaptcha-site-key-name";

    updateSiteKey(projectID, recaptchaSiteKeyName);
  }

  /**
   * Update the properties of the given site key present under the project id.
   *
   * @param projectID: GCloud Project ID.
   * @param recaptchaSiteKeyName: Specify the site key to be updated.
   */
  public static void updateSiteKey(String projectID, String recaptchaSiteKeyName) throws IOException {
    try (RecaptchaEnterpriseServiceClient client = RecaptchaEnterpriseServiceClient.create()) {

      // Set the name and the new settings for the key.
      UpdateKeyRequest updateKeyRequest = UpdateKeyRequest.newBuilder()
          .setKey(Key.newBuilder()
              .setName(KeyName.of(projectID, recaptchaSiteKeyName).toString())
              .setWebSettings(WebKeySettings.newBuilder()
                  .setIntegrationType(IntegrationType.CHECKBOX)
                  .setChallengeSecurityPreference(ChallengeSecurityPreference.BALANCE).build())
              .build())
          .setUpdateMask(FieldMask.newBuilder().build())
          .build();

      client.updateKey(updateKeyRequest);

      // Check if the key has been updated.
      GetKeyRequest getKeyRequest = GetKeyRequest.newBuilder()
          .setName(KeyName.of(projectID, recaptchaSiteKeyName).toString()).build();
      Key response = client.getKey(getKeyRequest);

      if (response.getWebSettings().getIntegrationType() != IntegrationType.CHECKBOX) {
        System.out.println("Error! reCAPTCHA Site key property hasn't been updated. Please try again !");
        return;
      }

      System.out.println("reCAPTCHA Site key successfully updated ! ");
    }
  }

}
