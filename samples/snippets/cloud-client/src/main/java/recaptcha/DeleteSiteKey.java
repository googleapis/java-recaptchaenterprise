package recaptcha;

import com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient;
import com.google.recaptchaenterprise.v1.DeleteKeyRequest;
import com.google.recaptchaenterprise.v1.KeyName;
import java.io.IOException;

public class DeleteSiteKey {

  public static void main(String[] args) throws IOException {
    String projectID = "project-id";
    String recaptchaSiteKeyName = "recaptcha-site-key-name";

    deleteSiteKey(projectID, recaptchaSiteKeyName);
  }

  /**
   * Delete the given reCAPTCHA site key present under the project ID.
   *
   * @param projectID: GCloud Project ID.
   * @param recaptchaSiteKeyName: Specify the key ID to be deleted.
   */
  public static void deleteSiteKey(String projectID, String recaptchaSiteKeyName) throws IOException {

    try (RecaptchaEnterpriseServiceClient client = RecaptchaEnterpriseServiceClient.create()) {

      // Set the project ID and reCAPTCHA site key.
      DeleteKeyRequest deleteKeyRequest = DeleteKeyRequest.newBuilder()
          .setName(KeyName.of(projectID, recaptchaSiteKeyName).toString())
          .build();

      client.deleteKey(deleteKeyRequest);
      System.out.println("reCAPTCHA Site key deleted successfully ! ");
    }
  }

}
