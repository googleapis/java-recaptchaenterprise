/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.recaptchaenterprise.v1beta1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class AssessmentName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/assessments/{assessment}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String assessment;

  public String getProject() {
    return project;
  }

  public String getAssessment() {
    return assessment;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private AssessmentName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    assessment = Preconditions.checkNotNull(builder.getAssessment());
  }

  public static AssessmentName of(String project, String assessment) {
    return newBuilder().setProject(project).setAssessment(assessment).build();
  }

  public static String format(String project, String assessment) {
    return newBuilder().setProject(project).setAssessment(assessment).build().toString();
  }

  public static AssessmentName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "AssessmentName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("assessment"));
  }

  public static List<AssessmentName> parseList(List<String> formattedStrings) {
    List<AssessmentName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AssessmentName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (AssessmentName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("assessment", assessment);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "assessment", assessment);
  }

  /** Builder for AssessmentName. */
  public static class Builder {

    private String project;
    private String assessment;

    public String getProject() {
      return project;
    }

    public String getAssessment() {
      return assessment;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setAssessment(String assessment) {
      this.assessment = assessment;
      return this;
    }

    private Builder() {}

    private Builder(AssessmentName assessmentName) {
      project = assessmentName.project;
      assessment = assessmentName.assessment;
    }

    public AssessmentName build() {
      return new AssessmentName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AssessmentName) {
      AssessmentName that = (AssessmentName) o;
      return (this.project.equals(that.project)) && (this.assessment.equals(that.assessment));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= assessment.hashCode();
    return h;
  }
}
