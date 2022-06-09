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

package app;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

import account_defender.AccountDefenderAssessment;
import account_defender.AnnotateAccountDefenderAssessment;
import account_defender.ListRelatedAccountGroupMemberships;
import account_defender.ListRelatedAccountGroups;
import account_defender.SearchRelatedAccountGroupMemberships;
import com.google.protobuf.ByteString;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.util.UriComponentsBuilder;
import recaptcha.AnnotateAssessment;
import recaptcha.GetMetrics;

@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SnippetsIT {

  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final String DOMAIN_NAME = "localhost";
  private static String RECAPTCHA_SITE_KEY_1 = "recaptcha-site-key1";
  private static String RECAPTCHA_SITE_KEY_2 = "recaptcha-site-key2";
  private static WebDriver browser;
  @LocalServerPort private int randomServerPort;
  private ByteArrayOutputStream stdOut;

  @Test
  public void testCreateAnnotateAssessment()
      throws JSONException, IOException, InterruptedException, NoSuchAlgorithmException,
          ExecutionException {
    // Create an assessment.
    String testURL = "http://localhost:" + randomServerPort + "/";
    JSONObject createAssessmentResult =
        createAssessment(testURL, ByteString.EMPTY, AssessmentType.ASSESSMENT);
    String assessmentName = createAssessmentResult.getString("assessmentName");
    // Verify that the assessment name has been modified post the assessment creation.
    assertThat(assessmentName).isNotEmpty();

    // Annotate the assessment.
    AnnotateAssessment.annotateAssessment(PROJECT_ID, assessmentName);
    assertThat(stdOut.toString()).contains("Annotated response sent successfully ! ");
  }

  // Check if the required environment variables are set.
  public static void requireEnvVar(String envVarName) {
    assertWithMessage(String.format("Missing environment variable '%s' ", envVarName))
        .that(System.getenv(envVarName))
        .isNotEmpty();
  }

  @BeforeClass
  public static void setUp() throws IOException, InterruptedException {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");

    // Create reCAPTCHA Site key and associate the given domain.
    RECAPTCHA_SITE_KEY_1 = recaptcha.CreateSiteKey.createSiteKey(PROJECT_ID, DOMAIN_NAME);
    RECAPTCHA_SITE_KEY_2 = recaptcha.CreateSiteKey.createSiteKey(PROJECT_ID, DOMAIN_NAME);
    TimeUnit.SECONDS.sleep(5);

    // Set Selenium Driver to Chrome.
    WebDriverManager.chromedriver().setup();
    browser = new ChromeDriver();
  }

  @AfterClass
  public static void cleanUp()
      throws IOException, ExecutionException, InterruptedException, TimeoutException {
    ByteArrayOutputStream stdOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOut));

    recaptcha.DeleteSiteKey.deleteSiteKey(PROJECT_ID, RECAPTCHA_SITE_KEY_1);
    assertThat(stdOut.toString()).contains("reCAPTCHA Site key successfully deleted !");

    browser.quit();

    stdOut.close();
    System.setOut(null);
  }

  @Before
  public void beforeEach() {
    stdOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOut));
  }

  @After
  public void afterEach() {
    stdOut = null;
    System.setOut(null);
  }

  @Test
  public void testCreateSiteKey() {
    // Test if the recaptcha site key has already been successfully created, as part of the setup.
    Assert.assertFalse(RECAPTCHA_SITE_KEY_1.isEmpty());
  }

  @Test
  public void testGetKey()
      throws IOException, ExecutionException, InterruptedException, TimeoutException {
    recaptcha.GetSiteKey.getSiteKey(PROJECT_ID, RECAPTCHA_SITE_KEY_1);
    assertThat(stdOut.toString()).contains(RECAPTCHA_SITE_KEY_1);
  }

  @Test
  public void testListSiteKeys() throws IOException {
    recaptcha.ListSiteKeys.listSiteKeys(PROJECT_ID);
    assertThat(stdOut.toString()).contains(RECAPTCHA_SITE_KEY_1);
  }

  @Test
  public void testUpdateSiteKey()
      throws IOException, InterruptedException, ExecutionException, TimeoutException {
    recaptcha.UpdateSiteKey.updateSiteKey(PROJECT_ID, RECAPTCHA_SITE_KEY_1, DOMAIN_NAME);
    assertThat(stdOut.toString()).contains("reCAPTCHA Site key successfully updated !");
  }

  @Test
  public void testDeleteSiteKey()
      throws IOException, ExecutionException, InterruptedException, TimeoutException {
    recaptcha.DeleteSiteKey.deleteSiteKey(PROJECT_ID, RECAPTCHA_SITE_KEY_2);
    assertThat(stdOut.toString()).contains("reCAPTCHA Site key successfully deleted !");
  }

  @Test
  public void testCreateAnnotateAccountDefender()
      throws JSONException, IOException, InterruptedException, NoSuchAlgorithmException,
          ExecutionException {

    String testURL = "http://localhost:" + randomServerPort + "/";
    // Create a random SHA-256 Hashed account id.
    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    byte[] hashBytes =
        digest.digest(
            ("default-" + UUID.randomUUID().toString().split("-")[0])
                .getBytes(StandardCharsets.UTF_8));
    ByteString hashedAccountId = ByteString.copyFrom(hashBytes);

    // Create the assessment.
    JSONObject createAssessmentResult =
        createAssessment(testURL, hashedAccountId, AssessmentType.ACCOUNT_DEFENDER);
    String assessmentName = createAssessmentResult.getString("assessmentName");
    // Verify that the assessment name has been modified post the assessment creation.
    assertThat(assessmentName).isNotEmpty();

    // Annotate the assessment.
    AnnotateAccountDefenderAssessment.annotateAssessment(
        PROJECT_ID, assessmentName, hashedAccountId);
    assertThat(stdOut.toString()).contains("Annotated response sent successfully ! ");

    // NOTE: The below assert statements have no significant effect,
    // since reCAPTCHA doesn't generate response.
    // To generate response, reCAPTCHA needs a threshold number of unique userIdentifier points
    // to cluster results.
    // Hence, re-running the test 'n' times is currently out of scope.

    // List related account groups in the project.
    ListRelatedAccountGroups.listRelatedAccountGroups(PROJECT_ID);
    assertThat(stdOut.toString()).contains("Listing related account groups..");

    // List related account group memberships.
    ListRelatedAccountGroupMemberships.listRelatedAccountGroupMemberships(PROJECT_ID, "legitimate");
    assertThat(stdOut.toString()).contains("Finished listing related account group memberships.");

    // Search related group memberships for a hashed account id.
    SearchRelatedAccountGroupMemberships.searchRelatedAccountGroupMemberships(
        PROJECT_ID, hashedAccountId);
    assertThat(stdOut.toString())
        .contains(
            String.format(
                "Finished searching related account group memberships for %s", hashedAccountId));
  }

  @Test
  public void testGetMetrics() throws IOException {
    GetMetrics.getMetrics(PROJECT_ID, RECAPTCHA_SITE_KEY_1);
    assertThat(stdOut.toString())
        .contains("Retrieved the bucket count for score based key: " + RECAPTCHA_SITE_KEY_1);
  }

  @Test
  public void testPasswordLeakAssessment()
      throws JSONException, IOException, ExecutionException, InterruptedException {
    String testURL = "http://localhost:" + randomServerPort + "/";
    createAssessment(testURL, ByteString.EMPTY, AssessmentType.PASSWORD_LEAK);
    assertThat(stdOut.toString()).contains("Is Credential leaked: ");
  }

  public JSONObject createAssessment(
      String testURL, ByteString hashedAccountId, AssessmentType assessmentType)
      throws IOException, JSONException, InterruptedException, ExecutionException {

    // Setup the automated browser test and retrieve the token and action.
    JSONObject tokenActionPair = initiateBrowserTest(testURL);

    // Send the token for analysis. The analysis score ranges from 0.0 to 1.0
    switch (assessmentType) {
      case ACCOUNT_DEFENDER:
        {
          AccountDefenderAssessment.accountDefenderAssessment(
              PROJECT_ID,
              RECAPTCHA_SITE_KEY_1,
              tokenActionPair.getString("token"),
              tokenActionPair.getString("action"),
              hashedAccountId);
          break;
        }
      case ASSESSMENT:
        {
          recaptcha.CreateAssessment.createAssessment(
              PROJECT_ID,
              RECAPTCHA_SITE_KEY_1,
              tokenActionPair.getString("token"),
              tokenActionPair.getString("action"));
          break;
        }
      case PASSWORD_LEAK:
        {
          passwordleak.CreatePasswordLeakAssessment.checkPasswordLeak(
              PROJECT_ID,
              RECAPTCHA_SITE_KEY_1,
              tokenActionPair.getString("token"),
              tokenActionPair.getString("action"));
          break;
        }
    }

    // Assert the response.
    String response = stdOut.toString();
    assertThat(response).contains("Assessment name: ");
    assertThat(response).contains("The reCAPTCHA score is: ");
    if (!hashedAccountId.isEmpty()) {
      assertThat(response).contains("Account Defender Assessment Result: ");
    }

    // Retrieve the results.
    float recaptchaScore = 0;
    String assessmentName = "";
    for (String line : response.split("\n")) {
      if (line.contains("The reCAPTCHA score is: ")) {
        recaptchaScore = Float.parseFloat(substr(line));
      } else if (line.contains("Assessment name: ")) {
        assessmentName = substr(line);
      }
    }

    // Set the score.
    browser.findElement(By.cssSelector("#assessment")).sendKeys(String.valueOf(recaptchaScore));
    return new JSONObject()
        .put("recaptchaScore", recaptchaScore)
        .put("assessmentName", assessmentName);
  }

  enum AssessmentType {
    ASSESSMENT,
    ACCOUNT_DEFENDER,
    PASSWORD_LEAK;

    AssessmentType() {}
  }

  public JSONObject initiateBrowserTest(String testURL)
      throws IOException, JSONException, InterruptedException {
    // Construct the URL to call for validating the assessment.
    URI url =
        UriComponentsBuilder.fromUriString(testURL)
            .queryParam("recaptchaSiteKey", RECAPTCHA_SITE_KEY_1)
            .build()
            .encode()
            .toUri();

    browser.get(url.toURL().toString());

    // Wait until the page is loaded.
    JavascriptExecutor js = (JavascriptExecutor) browser;
    new WebDriverWait(browser, Duration.ofSeconds(10))
        .until(webDriver -> js.executeScript("return document.readyState").equals("complete"));

    // Pass the values to be entered.
    browser.findElement(By.id("username")).sendKeys("username");
    browser.findElement(By.id("password")).sendKeys("password");

    // On clicking the button, the request params will be sent to reCAPTCHA.
    browser.findElement(By.id("recaptchabutton")).click();

    TimeUnit.SECONDS.sleep(1);

    // Retrieve the reCAPTCHA token response.
    WebElement element = browser.findElement(By.cssSelector("#assessment"));
    String token = element.getAttribute("data-token");
    String action = element.getAttribute("data-action");

    return new JSONObject().put("token", token).put("action", action);
  }

  public String substr(String line) {
    return line.substring((line.lastIndexOf(":") + 1)).trim();
  }
}
