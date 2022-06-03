/*
 * Copyright 2022 Google LLC
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

import java.io.IOException;
import org.json.JSONObject;
import recaptcha.CreateAssessment.AssessmentResponse;

public class Recaptcha {

  public static JSONObject execute(String projectId, JSONObject jsonObject) {
    double sampleThresholdScore = 0.50;
    String verdict = "";

    String recaptchaSiteKey = jsonObject.getJSONObject("recaptcha_cred").getString("sitekey");
    String recaptchaAction = jsonObject.getJSONObject("recaptcha_cred").getString("action");
    String recaptchaToken = jsonObject.getJSONObject("recaptcha_cred").getString("token");

    try {
      AssessmentResponse response = new CreateAssessment().createAssessment(projectId, recaptchaSiteKey, recaptchaToken, recaptchaAction);

      if (response == null) {
        JSONObject root = new JSONObject();
        root.put("error_msg", "Something happened! Please try again");
        root.put("success", "false");
        return root;
      }

      if (response.recaptchaScore < sampleThresholdScore) {
        verdict = "human";
      }else {
        verdict = "Not a human";
      }

      JSONObject result = new JSONObject();
      result.put("score", response.recaptchaScore);
      result.put("verdict", verdict);

      JSONObject root = new JSONObject();
      root.put("data", result);
      root.put("success", "true");
      return root;

    } catch (IOException e) {
      JSONObject root = new JSONObject();
      root.put("error_msg", "Something happened! Please try again");
      root.put("success", "false");
      return root;
    }

  }

}
