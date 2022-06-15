/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.recaptchaenterprise.v1.samples;

// [START recaptchaenterprise_v1_generated_recaptchaenterpriseserviceclient_annotateassessment_sync]
import com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient;
import com.google.protobuf.ByteString;
import com.google.recaptchaenterprise.v1.AnnotateAssessmentRequest;
import com.google.recaptchaenterprise.v1.AnnotateAssessmentResponse;
import com.google.recaptchaenterprise.v1.AssessmentName;
import java.util.ArrayList;

public class SyncAnnotateAssessment {

  public static void main(String[] args) throws Exception {
    syncAnnotateAssessment();
  }

  public static void syncAnnotateAssessment() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
        RecaptchaEnterpriseServiceClient.create()) {
      AnnotateAssessmentRequest request =
          AnnotateAssessmentRequest.newBuilder()
              .setName(AssessmentName.of("[PROJECT]", "[ASSESSMENT]").toString())
              .addAllReasons(new ArrayList<AnnotateAssessmentRequest.Reason>())
              .setHashedAccountId(ByteString.EMPTY)
              .build();
      AnnotateAssessmentResponse response =
          recaptchaEnterpriseServiceClient.annotateAssessment(request);
    }
  }
}
// [END recaptchaenterprise_v1_generated_recaptchaenterpriseserviceclient_annotateassessment_sync]
