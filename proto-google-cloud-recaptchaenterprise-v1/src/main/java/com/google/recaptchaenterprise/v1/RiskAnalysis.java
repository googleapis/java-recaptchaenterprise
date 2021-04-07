// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

/**
 * <pre>
 * Risk analysis result for an event.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.RiskAnalysis}
 */
public final class RiskAnalysis extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.RiskAnalysis)
    RiskAnalysisOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RiskAnalysis.newBuilder() to construct.
  private RiskAnalysis(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RiskAnalysis() {
    reasons_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RiskAnalysis();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RiskAnalysis(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 13: {

            score_ = input.readFloat();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              reasons_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            reasons_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                reasons_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              reasons_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        reasons_ = java.util.Collections.unmodifiableList(reasons_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_RiskAnalysis_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_RiskAnalysis_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.RiskAnalysis.class, com.google.recaptchaenterprise.v1.RiskAnalysis.Builder.class);
  }

  /**
   * <pre>
   * LINT.IfChange(classification_reason)
   * Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason}
   */
  public enum ClassificationReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default unspecified type.
     * </pre>
     *
     * <code>CLASSIFICATION_REASON_UNSPECIFIED = 0;</code>
     */
    CLASSIFICATION_REASON_UNSPECIFIED(0),
    /**
     * <pre>
     * Interactions matched the behavior of an automated agent.
     * </pre>
     *
     * <code>AUTOMATION = 1;</code>
     */
    AUTOMATION(1),
    /**
     * <pre>
     * The event originated from an illegitimate environment.
     * </pre>
     *
     * <code>UNEXPECTED_ENVIRONMENT = 2;</code>
     */
    UNEXPECTED_ENVIRONMENT(2),
    /**
     * <pre>
     * Traffic volume from the event source is higher than normal.
     * </pre>
     *
     * <code>TOO_MUCH_TRAFFIC = 3;</code>
     */
    TOO_MUCH_TRAFFIC(3),
    /**
     * <pre>
     * Interactions with the site were significantly different than expected
     * patterns.
     * </pre>
     *
     * <code>UNEXPECTED_USAGE_PATTERNS = 4;</code>
     */
    UNEXPECTED_USAGE_PATTERNS(4),
    /**
     * <pre>
     * Too little traffic has been received from this site thus far to generate
     * quality risk analysis.
     * </pre>
     *
     * <code>LOW_CONFIDENCE_SCORE = 5;</code>
     */
    LOW_CONFIDENCE_SCORE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default unspecified type.
     * </pre>
     *
     * <code>CLASSIFICATION_REASON_UNSPECIFIED = 0;</code>
     */
    public static final int CLASSIFICATION_REASON_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Interactions matched the behavior of an automated agent.
     * </pre>
     *
     * <code>AUTOMATION = 1;</code>
     */
    public static final int AUTOMATION_VALUE = 1;
    /**
     * <pre>
     * The event originated from an illegitimate environment.
     * </pre>
     *
     * <code>UNEXPECTED_ENVIRONMENT = 2;</code>
     */
    public static final int UNEXPECTED_ENVIRONMENT_VALUE = 2;
    /**
     * <pre>
     * Traffic volume from the event source is higher than normal.
     * </pre>
     *
     * <code>TOO_MUCH_TRAFFIC = 3;</code>
     */
    public static final int TOO_MUCH_TRAFFIC_VALUE = 3;
    /**
     * <pre>
     * Interactions with the site were significantly different than expected
     * patterns.
     * </pre>
     *
     * <code>UNEXPECTED_USAGE_PATTERNS = 4;</code>
     */
    public static final int UNEXPECTED_USAGE_PATTERNS_VALUE = 4;
    /**
     * <pre>
     * Too little traffic has been received from this site thus far to generate
     * quality risk analysis.
     * </pre>
     *
     * <code>LOW_CONFIDENCE_SCORE = 5;</code>
     */
    public static final int LOW_CONFIDENCE_SCORE_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ClassificationReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ClassificationReason forNumber(int value) {
      switch (value) {
        case 0: return CLASSIFICATION_REASON_UNSPECIFIED;
        case 1: return AUTOMATION;
        case 2: return UNEXPECTED_ENVIRONMENT;
        case 3: return TOO_MUCH_TRAFFIC;
        case 4: return UNEXPECTED_USAGE_PATTERNS;
        case 5: return LOW_CONFIDENCE_SCORE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ClassificationReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ClassificationReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ClassificationReason>() {
            public ClassificationReason findValueByNumber(int number) {
              return ClassificationReason.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.recaptchaenterprise.v1.RiskAnalysis.getDescriptor().getEnumTypes().get(0);
    }

    private static final ClassificationReason[] VALUES = values();

    public static ClassificationReason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ClassificationReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason)
  }

  public static final int SCORE_FIELD_NUMBER = 1;
  private float score_;
  /**
   * <pre>
   * Legitimate event score from 0.0 to 1.0.
   * (1.0 means very likely legitimate traffic while 0.0 means very likely
   * non-legitimate traffic).
   * </pre>
   *
   * <code>float score = 1;</code>
   * @return The score.
   */
  @java.lang.Override
  public float getScore() {
    return score_;
  }

  public static final int REASONS_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> reasons_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason> reasons_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason>() {
            public com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason result = com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason.valueOf(from);
              return result == null ? com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
   * @return A list containing the reasons.
   */
  @java.lang.Override
  public java.util.List<com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason> getReasonsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason>(reasons_, reasons_converter_);
  }
  /**
   * <pre>
   * Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
   * @return The count of reasons.
   */
  @java.lang.Override
  public int getReasonsCount() {
    return reasons_.size();
  }
  /**
   * <pre>
   * Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
   * @param index The index of the element to return.
   * @return The reasons at the given index.
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason getReasons(int index) {
    return reasons_converter_.convert(reasons_.get(index));
  }
  /**
   * <pre>
   * Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
   * @return A list containing the enum numeric values on the wire for reasons.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getReasonsValueList() {
    return reasons_;
  }
  /**
   * <pre>
   * Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of reasons at the given index.
   */
  @java.lang.Override
  public int getReasonsValue(int index) {
    return reasons_.get(index);
  }
  private int reasonsMemoizedSerializedSize;

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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (score_ != 0F) {
      output.writeFloat(1, score_);
    }
    if (getReasonsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(reasonsMemoizedSerializedSize);
    }
    for (int i = 0; i < reasons_.size(); i++) {
      output.writeEnumNoTag(reasons_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, score_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < reasons_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(reasons_.get(i));
      }
      size += dataSize;
      if (!getReasonsList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }reasonsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.RiskAnalysis)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.RiskAnalysis other = (com.google.recaptchaenterprise.v1.RiskAnalysis) obj;

    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(
            other.getScore())) return false;
    if (!reasons_.equals(other.reasons_)) return false;
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
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScore());
    if (getReasonsCount() > 0) {
      hash = (37 * hash) + REASONS_FIELD_NUMBER;
      hash = (53 * hash) + reasons_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.RiskAnalysis parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.recaptchaenterprise.v1.RiskAnalysis parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.RiskAnalysis parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.recaptchaenterprise.v1.RiskAnalysis parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.RiskAnalysis parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.recaptchaenterprise.v1.RiskAnalysis parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.RiskAnalysis parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.recaptchaenterprise.v1.RiskAnalysis parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.RiskAnalysis parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.recaptchaenterprise.v1.RiskAnalysis parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.RiskAnalysis parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.recaptchaenterprise.v1.RiskAnalysis parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.recaptchaenterprise.v1.RiskAnalysis prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Risk analysis result for an event.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.RiskAnalysis}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.RiskAnalysis)
      com.google.recaptchaenterprise.v1.RiskAnalysisOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_RiskAnalysis_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_RiskAnalysis_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.RiskAnalysis.class, com.google.recaptchaenterprise.v1.RiskAnalysis.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.RiskAnalysis.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      score_ = 0F;

      reasons_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_RiskAnalysis_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.RiskAnalysis getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.RiskAnalysis.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.RiskAnalysis build() {
      com.google.recaptchaenterprise.v1.RiskAnalysis result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.RiskAnalysis buildPartial() {
      com.google.recaptchaenterprise.v1.RiskAnalysis result = new com.google.recaptchaenterprise.v1.RiskAnalysis(this);
      int from_bitField0_ = bitField0_;
      result.score_ = score_;
      if (((bitField0_ & 0x00000001) != 0)) {
        reasons_ = java.util.Collections.unmodifiableList(reasons_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.reasons_ = reasons_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.recaptchaenterprise.v1.RiskAnalysis) {
        return mergeFrom((com.google.recaptchaenterprise.v1.RiskAnalysis)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.RiskAnalysis other) {
      if (other == com.google.recaptchaenterprise.v1.RiskAnalysis.getDefaultInstance()) return this;
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      if (!other.reasons_.isEmpty()) {
        if (reasons_.isEmpty()) {
          reasons_ = other.reasons_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureReasonsIsMutable();
          reasons_.addAll(other.reasons_);
        }
        onChanged();
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
      com.google.recaptchaenterprise.v1.RiskAnalysis parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.recaptchaenterprise.v1.RiskAnalysis) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private float score_ ;
    /**
     * <pre>
     * Legitimate event score from 0.0 to 1.0.
     * (1.0 means very likely legitimate traffic while 0.0 means very likely
     * non-legitimate traffic).
     * </pre>
     *
     * <code>float score = 1;</code>
     * @return The score.
     */
    @java.lang.Override
    public float getScore() {
      return score_;
    }
    /**
     * <pre>
     * Legitimate event score from 0.0 to 1.0.
     * (1.0 means very likely legitimate traffic while 0.0 means very likely
     * non-legitimate traffic).
     * </pre>
     *
     * <code>float score = 1;</code>
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(float value) {
      
      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Legitimate event score from 0.0 to 1.0.
     * (1.0 means very likely legitimate traffic while 0.0 means very likely
     * non-legitimate traffic).
     * </pre>
     *
     * <code>float score = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      
      score_ = 0F;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> reasons_ =
      java.util.Collections.emptyList();
    private void ensureReasonsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        reasons_ = new java.util.ArrayList<java.lang.Integer>(reasons_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Reasons contributing to the risk analysis verdict.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
     * @return A list containing the reasons.
     */
    public java.util.List<com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason> getReasonsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason>(reasons_, reasons_converter_);
    }
    /**
     * <pre>
     * Reasons contributing to the risk analysis verdict.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
     * @return The count of reasons.
     */
    public int getReasonsCount() {
      return reasons_.size();
    }
    /**
     * <pre>
     * Reasons contributing to the risk analysis verdict.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
     * @param index The index of the element to return.
     * @return The reasons at the given index.
     */
    public com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason getReasons(int index) {
      return reasons_converter_.convert(reasons_.get(index));
    }
    /**
     * <pre>
     * Reasons contributing to the risk analysis verdict.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
     * @param index The index to set the value at.
     * @param value The reasons to set.
     * @return This builder for chaining.
     */
    public Builder setReasons(
        int index, com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureReasonsIsMutable();
      reasons_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reasons contributing to the risk analysis verdict.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
     * @param value The reasons to add.
     * @return This builder for chaining.
     */
    public Builder addReasons(com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureReasonsIsMutable();
      reasons_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reasons contributing to the risk analysis verdict.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
     * @param values The reasons to add.
     * @return This builder for chaining.
     */
    public Builder addAllReasons(
        java.lang.Iterable<? extends com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason> values) {
      ensureReasonsIsMutable();
      for (com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason value : values) {
        reasons_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reasons contributing to the risk analysis verdict.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReasons() {
      reasons_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reasons contributing to the risk analysis verdict.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
     * @return A list containing the enum numeric values on the wire for reasons.
     */
    public java.util.List<java.lang.Integer>
    getReasonsValueList() {
      return java.util.Collections.unmodifiableList(reasons_);
    }
    /**
     * <pre>
     * Reasons contributing to the risk analysis verdict.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of reasons at the given index.
     */
    public int getReasonsValue(int index) {
      return reasons_.get(index);
    }
    /**
     * <pre>
     * Reasons contributing to the risk analysis verdict.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of reasons at the given index.
     * @return This builder for chaining.
     */
    public Builder setReasonsValue(
        int index, int value) {
      ensureReasonsIsMutable();
      reasons_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reasons contributing to the risk analysis verdict.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
     * @param value The enum numeric value on the wire for reasons to add.
     * @return This builder for chaining.
     */
    public Builder addReasonsValue(int value) {
      ensureReasonsIsMutable();
      reasons_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reasons contributing to the risk analysis verdict.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2;</code>
     * @param values The enum numeric values on the wire for reasons to add.
     * @return This builder for chaining.
     */
    public Builder addAllReasonsValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureReasonsIsMutable();
      for (int value : values) {
        reasons_.add(value);
      }
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.RiskAnalysis)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.RiskAnalysis)
  private static final com.google.recaptchaenterprise.v1.RiskAnalysis DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.RiskAnalysis();
  }

  public static com.google.recaptchaenterprise.v1.RiskAnalysis getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RiskAnalysis>
      PARSER = new com.google.protobuf.AbstractParser<RiskAnalysis>() {
    @java.lang.Override
    public RiskAnalysis parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RiskAnalysis(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RiskAnalysis> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RiskAnalysis> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.RiskAnalysis getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

