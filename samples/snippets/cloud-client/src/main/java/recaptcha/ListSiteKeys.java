package recaptcha;

import com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient;
import com.google.recaptchaenterprise.v1.Key;
import com.google.recaptchaenterprise.v1.ListKeysRequest;
import com.google.recaptchaenterprise.v1.ProjectName;
import java.io.IOException;

public class ListSiteKeys {

  public static void main(String[] args) throws IOException {
    String projectID = "project-id";

    listSiteKeys(projectID);
  }

  /**
   * List all keys present under the given project ID.
   *
   * @param projectID: GCloud Project ID.
   */
  public static void listSiteKeys(String projectID) throws IOException {
    try (RecaptchaEnterpriseServiceClient client = RecaptchaEnterpriseServiceClient.create()) {
      // Set the project id to list the keys present in it.
      ListKeysRequest listKeysRequest = ListKeysRequest.newBuilder()
          .setParent(ProjectName.of(projectID).toString())
          .build();

      System.out.println("Listing reCAPTCHA site keys: ");
      for (Key key : client.listKeys(listKeysRequest).iterateAll()) {
        System.out.println(key.getName());
      }

    }
  }
}
