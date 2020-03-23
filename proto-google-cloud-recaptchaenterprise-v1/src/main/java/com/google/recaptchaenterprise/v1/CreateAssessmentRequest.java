/*
 * Copyright 2020 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * The create assessment request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.CreateAssessmentRequest}
 */
public final class CreateAssessmentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.CreateAssessmentRequest)
    CreateAssessmentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateAssessmentRequest.newBuilder() to construct.
  private CreateAssessmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateAssessmentRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateAssessmentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateAssessmentRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.recaptchaenterprise.v1.Assessment.Builder subBuilder = null;
              if (assessment_ != null) {
                subBuilder = assessment_.toBuilder();
              }
              assessment_ =
                  input.readMessage(
                      com.google.recaptchaenterprise.v1.Assessment.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(assessment_);
                assessment_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_CreateAssessmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_CreateAssessmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.CreateAssessmentRequest.class,
            com.google.recaptchaenterprise.v1.CreateAssessmentRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The name of the project in which the assessment will be created,
   * in the format "projects/{project}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the project in which the assessment will be created,
   * in the format "projects/{project}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSESSMENT_FIELD_NUMBER = 2;
  private com.google.recaptchaenterprise.v1.Assessment assessment_;
  /**
   *
   *
   * <pre>
   * Required. The assessment details.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the assessment field is set.
   */
  public boolean hasAssessment() {
    return assessment_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The assessment details.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The assessment.
   */
  public com.google.recaptchaenterprise.v1.Assessment getAssessment() {
    return assessment_ == null
        ? com.google.recaptchaenterprise.v1.Assessment.getDefaultInstance()
        : assessment_;
  }
  /**
   *
   *
   * <pre>
   * Required. The assessment details.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.recaptchaenterprise.v1.AssessmentOrBuilder getAssessmentOrBuilder() {
    return getAssessment();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (assessment_ != null) {
      output.writeMessage(2, getAssessment());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (assessment_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAssessment());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.recaptchaenterprise.v1.CreateAssessmentRequest)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.CreateAssessmentRequest other =
        (com.google.recaptchaenterprise.v1.CreateAssessmentRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasAssessment() != other.hasAssessment()) return false;
    if (hasAssessment()) {
      if (!getAssessment().equals(other.getAssessment())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasAssessment()) {
      hash = (37 * hash) + ASSESSMENT_FIELD_NUMBER;
      hash = (53 * hash) + getAssessment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.recaptchaenterprise.v1.CreateAssessmentRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The create assessment request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.CreateAssessmentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.CreateAssessmentRequest)
      com.google.recaptchaenterprise.v1.CreateAssessmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_CreateAssessmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_CreateAssessmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.CreateAssessmentRequest.class,
              com.google.recaptchaenterprise.v1.CreateAssessmentRequest.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.CreateAssessmentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (assessmentBuilder_ == null) {
        assessment_ = null;
      } else {
        assessment_ = null;
        assessmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_CreateAssessmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.CreateAssessmentRequest getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.CreateAssessmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.CreateAssessmentRequest build() {
      com.google.recaptchaenterprise.v1.CreateAssessmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.CreateAssessmentRequest buildPartial() {
      com.google.recaptchaenterprise.v1.CreateAssessmentRequest result =
          new com.google.recaptchaenterprise.v1.CreateAssessmentRequest(this);
      result.parent_ = parent_;
      if (assessmentBuilder_ == null) {
        result.assessment_ = assessment_;
      } else {
        result.assessment_ = assessmentBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.recaptchaenterprise.v1.CreateAssessmentRequest) {
        return mergeFrom((com.google.recaptchaenterprise.v1.CreateAssessmentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.CreateAssessmentRequest other) {
      if (other == com.google.recaptchaenterprise.v1.CreateAssessmentRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasAssessment()) {
        mergeAssessment(other.getAssessment());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.recaptchaenterprise.v1.CreateAssessmentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.recaptchaenterprise.v1.CreateAssessmentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the project in which the assessment will be created,
     * in the format "projects/{project}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project in which the assessment will be created,
     * in the format "projects/{project}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project in which the assessment will be created,
     * in the format "projects/{project}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project in which the assessment will be created,
     * in the format "projects/{project}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project in which the assessment will be created,
     * in the format "projects/{project}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.recaptchaenterprise.v1.Assessment assessment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.recaptchaenterprise.v1.Assessment,
            com.google.recaptchaenterprise.v1.Assessment.Builder,
            com.google.recaptchaenterprise.v1.AssessmentOrBuilder>
        assessmentBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The assessment details.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the assessment field is set.
     */
    public boolean hasAssessment() {
      return assessmentBuilder_ != null || assessment_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The assessment details.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The assessment.
     */
    public com.google.recaptchaenterprise.v1.Assessment getAssessment() {
      if (assessmentBuilder_ == null) {
        return assessment_ == null
            ? com.google.recaptchaenterprise.v1.Assessment.getDefaultInstance()
            : assessment_;
      } else {
        return assessmentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The assessment details.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAssessment(com.google.recaptchaenterprise.v1.Assessment value) {
      if (assessmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assessment_ = value;
        onChanged();
      } else {
        assessmentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The assessment details.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAssessment(
        com.google.recaptchaenterprise.v1.Assessment.Builder builderForValue) {
      if (assessmentBuilder_ == null) {
        assessment_ = builderForValue.build();
        onChanged();
      } else {
        assessmentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The assessment details.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAssessment(com.google.recaptchaenterprise.v1.Assessment value) {
      if (assessmentBuilder_ == null) {
        if (assessment_ != null) {
          assessment_ =
              com.google.recaptchaenterprise.v1.Assessment.newBuilder(assessment_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          assessment_ = value;
        }
        onChanged();
      } else {
        assessmentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The assessment details.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAssessment() {
      if (assessmentBuilder_ == null) {
        assessment_ = null;
        onChanged();
      } else {
        assessment_ = null;
        assessmentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The assessment details.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.recaptchaenterprise.v1.Assessment.Builder getAssessmentBuilder() {

      onChanged();
      return getAssessmentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The assessment details.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.recaptchaenterprise.v1.AssessmentOrBuilder getAssessmentOrBuilder() {
      if (assessmentBuilder_ != null) {
        return assessmentBuilder_.getMessageOrBuilder();
      } else {
        return assessment_ == null
            ? com.google.recaptchaenterprise.v1.Assessment.getDefaultInstance()
            : assessment_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The assessment details.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.Assessment assessment = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.recaptchaenterprise.v1.Assessment,
            com.google.recaptchaenterprise.v1.Assessment.Builder,
            com.google.recaptchaenterprise.v1.AssessmentOrBuilder>
        getAssessmentFieldBuilder() {
      if (assessmentBuilder_ == null) {
        assessmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.recaptchaenterprise.v1.Assessment,
                com.google.recaptchaenterprise.v1.Assessment.Builder,
                com.google.recaptchaenterprise.v1.AssessmentOrBuilder>(
                getAssessment(), getParentForChildren(), isClean());
        assessment_ = null;
      }
      return assessmentBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.CreateAssessmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.CreateAssessmentRequest)
  private static final com.google.recaptchaenterprise.v1.CreateAssessmentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.CreateAssessmentRequest();
  }

  public static com.google.recaptchaenterprise.v1.CreateAssessmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAssessmentRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateAssessmentRequest>() {
        @java.lang.Override
        public CreateAssessmentRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateAssessmentRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateAssessmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAssessmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.CreateAssessmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
