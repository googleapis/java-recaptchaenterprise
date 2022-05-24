// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface CreateAssessmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.CreateAssessmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the project in which the assessment will be created,
   * in the format "projects/{project}".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the project in which the assessment will be created,
   * in the format "projects/{project}".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The assessment details.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the assessment field is set.
   */
  boolean hasAssessment();
  /**
   * <pre>
   * Required. The assessment details.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The assessment.
   */
  com.google.recaptchaenterprise.v1.Assessment getAssessment();
  /**
   * <pre>
   * Required. The assessment details.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.recaptchaenterprise.v1.AssessmentOrBuilder getAssessmentOrBuilder();
}
