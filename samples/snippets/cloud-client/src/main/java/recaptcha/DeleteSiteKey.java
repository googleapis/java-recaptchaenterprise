package recaptcha;

// [START recaptcha_enterprise_delete_site_key]

import com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient;
import com.google.recaptchaenterprise.v1.DeleteKeyRequest;
import com.google.recaptchaenterprise.v1.KeyName;
import java.io.IOException;

public class DeleteSiteKey {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectID = "your-project-id";
    String recaptchaSiteKeyName = "recaptcha-site-key-id";

    deleteSiteKey(projectID, recaptchaSiteKeyName);
  }

  /**
   * Delete the given reCAPTCHA site key present under the project ID.
   *
   * @param projectID: GCloud Project ID.
   * @param recaptchaSiteKeyName: Specify the key ID to be deleted.
   */
  public static void deleteSiteKey(String projectID, String recaptchaSiteKeyName) throws IOException {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the `client.close()` method on the client to safely
    // clean up any remaining background resources.
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
// [END recaptcha_enterprise_delete_site_key]