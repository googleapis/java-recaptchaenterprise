// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface EndpointVerificationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.EndpointVerificationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Email address for which to trigger a verification request.
   * </pre>
   *
   * <code>string email_address = 1;</code>
   * @return Whether the emailAddress field is set.
   */
  boolean hasEmailAddress();
  /**
   * <pre>
   * Email address for which to trigger a verification request.
   * </pre>
   *
   * <code>string email_address = 1;</code>
   * @return The emailAddress.
   */
  java.lang.String getEmailAddress();
  /**
   * <pre>
   * Email address for which to trigger a verification request.
   * </pre>
   *
   * <code>string email_address = 1;</code>
   * @return The bytes for emailAddress.
   */
  com.google.protobuf.ByteString
      getEmailAddressBytes();

  /**
   * <pre>
   * Phone number for which to trigger a verification request. Should be given
   * in E.164 format.
   * </pre>
   *
   * <code>string phone_number = 2;</code>
   * @return Whether the phoneNumber field is set.
   */
  boolean hasPhoneNumber();
  /**
   * <pre>
   * Phone number for which to trigger a verification request. Should be given
   * in E.164 format.
   * </pre>
   *
   * <code>string phone_number = 2;</code>
   * @return The phoneNumber.
   */
  java.lang.String getPhoneNumber();
  /**
   * <pre>
   * Phone number for which to trigger a verification request. Should be given
   * in E.164 format.
   * </pre>
   *
   * <code>string phone_number = 2;</code>
   * @return The bytes for phoneNumber.
   */
  com.google.protobuf.ByteString
      getPhoneNumberBytes();

  /**
   * <pre>
   * Output only. Token to provide to the client to trigger endpoint
   * verification. It must be used within 15 minutes.
   * </pre>
   *
   * <code>string request_token = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The requestToken.
   */
  java.lang.String getRequestToken();
  /**
   * <pre>
   * Output only. Token to provide to the client to trigger endpoint
   * verification. It must be used within 15 minutes.
   * </pre>
   *
   * <code>string request_token = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for requestToken.
   */
  com.google.protobuf.ByteString
      getRequestTokenBytes();

  /**
   * <pre>
   * Output only. Timestamp of the last successful verification for the
   * endpoint, if any.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_verification_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the lastVerificationTime field is set.
   */
  boolean hasLastVerificationTime();
  /**
   * <pre>
   * Output only. Timestamp of the last successful verification for the
   * endpoint, if any.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_verification_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The lastVerificationTime.
   */
  com.google.protobuf.Timestamp getLastVerificationTime();
  /**
   * <pre>
   * Output only. Timestamp of the last successful verification for the
   * endpoint, if any.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_verification_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastVerificationTimeOrBuilder();

  public com.google.recaptchaenterprise.v1.EndpointVerificationInfo.EndpointCase getEndpointCase();
}
