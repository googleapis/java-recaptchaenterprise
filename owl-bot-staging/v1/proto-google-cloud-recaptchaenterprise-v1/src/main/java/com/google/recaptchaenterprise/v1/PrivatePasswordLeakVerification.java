// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

/**
 * <pre>
 * Private password leak verification info.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.PrivatePasswordLeakVerification}
 */
public final class PrivatePasswordLeakVerification extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.PrivatePasswordLeakVerification)
    PrivatePasswordLeakVerificationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrivatePasswordLeakVerification.newBuilder() to construct.
  private PrivatePasswordLeakVerification(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrivatePasswordLeakVerification() {
    lookupHashPrefix_ = com.google.protobuf.ByteString.EMPTY;
    encryptedUserCredentialsHash_ = com.google.protobuf.ByteString.EMPTY;
    encryptedLeakMatchPrefixes_ = java.util.Collections.emptyList();
    reencryptedUserCredentialsHash_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrivatePasswordLeakVerification();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PrivatePasswordLeakVerification(
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
          case 10: {

            lookupHashPrefix_ = input.readBytes();
            break;
          }
          case 18: {

            encryptedUserCredentialsHash_ = input.readBytes();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              encryptedLeakMatchPrefixes_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            encryptedLeakMatchPrefixes_.add(input.readBytes());
            break;
          }
          case 34: {

            reencryptedUserCredentialsHash_ = input.readBytes();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        encryptedLeakMatchPrefixes_ = java.util.Collections.unmodifiableList(encryptedLeakMatchPrefixes_); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_PrivatePasswordLeakVerification_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_PrivatePasswordLeakVerification_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification.class, com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification.Builder.class);
  }

  public static final int LOOKUP_HASH_PREFIX_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString lookupHashPrefix_;
  /**
   * <pre>
   * Exactly 26-bit prefix of the SHA-256 hash of the canonicalized username. It
   * is used to look up password leaks associated with that hash prefix.
   * </pre>
   *
   * <code>bytes lookup_hash_prefix = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The lookupHashPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLookupHashPrefix() {
    return lookupHashPrefix_;
  }

  public static final int ENCRYPTED_USER_CREDENTIALS_HASH_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString encryptedUserCredentialsHash_;
  /**
   * <pre>
   * Encrypted Scrypt hash of the canonicalized username+password. It is
   * re-encrypted by the server and returned through
   * `reencrypted_user_credentials_hash`.
   * </pre>
   *
   * <code>bytes encrypted_user_credentials_hash = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The encryptedUserCredentialsHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEncryptedUserCredentialsHash() {
    return encryptedUserCredentialsHash_;
  }

  public static final int ENCRYPTED_LEAK_MATCH_PREFIXES_FIELD_NUMBER = 3;
  private java.util.List<com.google.protobuf.ByteString> encryptedLeakMatchPrefixes_;
  /**
   * <pre>
   * List of prefixes of the encrypted potential password leaks that matched the
   * given parameters. They should be compared with the client-side decryption
   * prefix of `reencrypted_user_credentials_hash`
   * </pre>
   *
   * <code>repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the encryptedLeakMatchPrefixes.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getEncryptedLeakMatchPrefixesList() {
    return encryptedLeakMatchPrefixes_;
  }
  /**
   * <pre>
   * List of prefixes of the encrypted potential password leaks that matched the
   * given parameters. They should be compared with the client-side decryption
   * prefix of `reencrypted_user_credentials_hash`
   * </pre>
   *
   * <code>repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of encryptedLeakMatchPrefixes.
   */
  public int getEncryptedLeakMatchPrefixesCount() {
    return encryptedLeakMatchPrefixes_.size();
  }
  /**
   * <pre>
   * List of prefixes of the encrypted potential password leaks that matched the
   * given parameters. They should be compared with the client-side decryption
   * prefix of `reencrypted_user_credentials_hash`
   * </pre>
   *
   * <code>repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The encryptedLeakMatchPrefixes at the given index.
   */
  public com.google.protobuf.ByteString getEncryptedLeakMatchPrefixes(int index) {
    return encryptedLeakMatchPrefixes_.get(index);
  }

  public static final int REENCRYPTED_USER_CREDENTIALS_HASH_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString reencryptedUserCredentialsHash_;
  /**
   * <pre>
   * Corresponds to the re-encryption of the `encrypted_user_credentials_hash`
   * field. Used to match potential password leaks within
   * `encrypted_leak_match_prefixes`.
   * </pre>
   *
   * <code>bytes reencrypted_user_credentials_hash = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The reencryptedUserCredentialsHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getReencryptedUserCredentialsHash() {
    return reencryptedUserCredentialsHash_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!lookupHashPrefix_.isEmpty()) {
      output.writeBytes(1, lookupHashPrefix_);
    }
    if (!encryptedUserCredentialsHash_.isEmpty()) {
      output.writeBytes(2, encryptedUserCredentialsHash_);
    }
    for (int i = 0; i < encryptedLeakMatchPrefixes_.size(); i++) {
      output.writeBytes(3, encryptedLeakMatchPrefixes_.get(i));
    }
    if (!reencryptedUserCredentialsHash_.isEmpty()) {
      output.writeBytes(4, reencryptedUserCredentialsHash_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!lookupHashPrefix_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, lookupHashPrefix_);
    }
    if (!encryptedUserCredentialsHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, encryptedUserCredentialsHash_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < encryptedLeakMatchPrefixes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(encryptedLeakMatchPrefixes_.get(i));
      }
      size += dataSize;
      size += 1 * getEncryptedLeakMatchPrefixesList().size();
    }
    if (!reencryptedUserCredentialsHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, reencryptedUserCredentialsHash_);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification other = (com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification) obj;

    if (!getLookupHashPrefix()
        .equals(other.getLookupHashPrefix())) return false;
    if (!getEncryptedUserCredentialsHash()
        .equals(other.getEncryptedUserCredentialsHash())) return false;
    if (!getEncryptedLeakMatchPrefixesList()
        .equals(other.getEncryptedLeakMatchPrefixesList())) return false;
    if (!getReencryptedUserCredentialsHash()
        .equals(other.getReencryptedUserCredentialsHash())) return false;
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
    hash = (37 * hash) + LOOKUP_HASH_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getLookupHashPrefix().hashCode();
    hash = (37 * hash) + ENCRYPTED_USER_CREDENTIALS_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getEncryptedUserCredentialsHash().hashCode();
    if (getEncryptedLeakMatchPrefixesCount() > 0) {
      hash = (37 * hash) + ENCRYPTED_LEAK_MATCH_PREFIXES_FIELD_NUMBER;
      hash = (53 * hash) + getEncryptedLeakMatchPrefixesList().hashCode();
    }
    hash = (37 * hash) + REENCRYPTED_USER_CREDENTIALS_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getReencryptedUserCredentialsHash().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parseFrom(
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
  public static Builder newBuilder(com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification prototype) {
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
   * Private password leak verification info.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.PrivatePasswordLeakVerification}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.PrivatePasswordLeakVerification)
      com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerificationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_PrivatePasswordLeakVerification_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_PrivatePasswordLeakVerification_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification.class, com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification.newBuilder()
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
      lookupHashPrefix_ = com.google.protobuf.ByteString.EMPTY;

      encryptedUserCredentialsHash_ = com.google.protobuf.ByteString.EMPTY;

      encryptedLeakMatchPrefixes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      reencryptedUserCredentialsHash_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_PrivatePasswordLeakVerification_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification build() {
      com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification buildPartial() {
      com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification result = new com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification(this);
      int from_bitField0_ = bitField0_;
      result.lookupHashPrefix_ = lookupHashPrefix_;
      result.encryptedUserCredentialsHash_ = encryptedUserCredentialsHash_;
      if (((bitField0_ & 0x00000001) != 0)) {
        encryptedLeakMatchPrefixes_ = java.util.Collections.unmodifiableList(encryptedLeakMatchPrefixes_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.encryptedLeakMatchPrefixes_ = encryptedLeakMatchPrefixes_;
      result.reencryptedUserCredentialsHash_ = reencryptedUserCredentialsHash_;
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
      if (other instanceof com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification) {
        return mergeFrom((com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification other) {
      if (other == com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification.getDefaultInstance()) return this;
      if (other.getLookupHashPrefix() != com.google.protobuf.ByteString.EMPTY) {
        setLookupHashPrefix(other.getLookupHashPrefix());
      }
      if (other.getEncryptedUserCredentialsHash() != com.google.protobuf.ByteString.EMPTY) {
        setEncryptedUserCredentialsHash(other.getEncryptedUserCredentialsHash());
      }
      if (!other.encryptedLeakMatchPrefixes_.isEmpty()) {
        if (encryptedLeakMatchPrefixes_.isEmpty()) {
          encryptedLeakMatchPrefixes_ = other.encryptedLeakMatchPrefixes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEncryptedLeakMatchPrefixesIsMutable();
          encryptedLeakMatchPrefixes_.addAll(other.encryptedLeakMatchPrefixes_);
        }
        onChanged();
      }
      if (other.getReencryptedUserCredentialsHash() != com.google.protobuf.ByteString.EMPTY) {
        setReencryptedUserCredentialsHash(other.getReencryptedUserCredentialsHash());
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
      com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString lookupHashPrefix_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Exactly 26-bit prefix of the SHA-256 hash of the canonicalized username. It
     * is used to look up password leaks associated with that hash prefix.
     * </pre>
     *
     * <code>bytes lookup_hash_prefix = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The lookupHashPrefix.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getLookupHashPrefix() {
      return lookupHashPrefix_;
    }
    /**
     * <pre>
     * Exactly 26-bit prefix of the SHA-256 hash of the canonicalized username. It
     * is used to look up password leaks associated with that hash prefix.
     * </pre>
     *
     * <code>bytes lookup_hash_prefix = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The lookupHashPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setLookupHashPrefix(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lookupHashPrefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Exactly 26-bit prefix of the SHA-256 hash of the canonicalized username. It
     * is used to look up password leaks associated with that hash prefix.
     * </pre>
     *
     * <code>bytes lookup_hash_prefix = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearLookupHashPrefix() {
      
      lookupHashPrefix_ = getDefaultInstance().getLookupHashPrefix();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString encryptedUserCredentialsHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Encrypted Scrypt hash of the canonicalized username+password. It is
     * re-encrypted by the server and returned through
     * `reencrypted_user_credentials_hash`.
     * </pre>
     *
     * <code>bytes encrypted_user_credentials_hash = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The encryptedUserCredentialsHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEncryptedUserCredentialsHash() {
      return encryptedUserCredentialsHash_;
    }
    /**
     * <pre>
     * Encrypted Scrypt hash of the canonicalized username+password. It is
     * re-encrypted by the server and returned through
     * `reencrypted_user_credentials_hash`.
     * </pre>
     *
     * <code>bytes encrypted_user_credentials_hash = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The encryptedUserCredentialsHash to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptedUserCredentialsHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      encryptedUserCredentialsHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Encrypted Scrypt hash of the canonicalized username+password. It is
     * re-encrypted by the server and returned through
     * `reencrypted_user_credentials_hash`.
     * </pre>
     *
     * <code>bytes encrypted_user_credentials_hash = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearEncryptedUserCredentialsHash() {
      
      encryptedUserCredentialsHash_ = getDefaultInstance().getEncryptedUserCredentialsHash();
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> encryptedLeakMatchPrefixes_ = java.util.Collections.emptyList();
    private void ensureEncryptedLeakMatchPrefixesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        encryptedLeakMatchPrefixes_ = new java.util.ArrayList<com.google.protobuf.ByteString>(encryptedLeakMatchPrefixes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * List of prefixes of the encrypted potential password leaks that matched the
     * given parameters. They should be compared with the client-side decryption
     * prefix of `reencrypted_user_credentials_hash`
     * </pre>
     *
     * <code>repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return A list containing the encryptedLeakMatchPrefixes.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getEncryptedLeakMatchPrefixesList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(encryptedLeakMatchPrefixes_) : encryptedLeakMatchPrefixes_;
    }
    /**
     * <pre>
     * List of prefixes of the encrypted potential password leaks that matched the
     * given parameters. They should be compared with the client-side decryption
     * prefix of `reencrypted_user_credentials_hash`
     * </pre>
     *
     * <code>repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The count of encryptedLeakMatchPrefixes.
     */
    public int getEncryptedLeakMatchPrefixesCount() {
      return encryptedLeakMatchPrefixes_.size();
    }
    /**
     * <pre>
     * List of prefixes of the encrypted potential password leaks that matched the
     * given parameters. They should be compared with the client-side decryption
     * prefix of `reencrypted_user_credentials_hash`
     * </pre>
     *
     * <code>repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index of the element to return.
     * @return The encryptedLeakMatchPrefixes at the given index.
     */
    public com.google.protobuf.ByteString getEncryptedLeakMatchPrefixes(int index) {
      return encryptedLeakMatchPrefixes_.get(index);
    }
    /**
     * <pre>
     * List of prefixes of the encrypted potential password leaks that matched the
     * given parameters. They should be compared with the client-side decryption
     * prefix of `reencrypted_user_credentials_hash`
     * </pre>
     *
     * <code>repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index to set the value at.
     * @param value The encryptedLeakMatchPrefixes to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptedLeakMatchPrefixes(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEncryptedLeakMatchPrefixesIsMutable();
      encryptedLeakMatchPrefixes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of prefixes of the encrypted potential password leaks that matched the
     * given parameters. They should be compared with the client-side decryption
     * prefix of `reencrypted_user_credentials_hash`
     * </pre>
     *
     * <code>repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The encryptedLeakMatchPrefixes to add.
     * @return This builder for chaining.
     */
    public Builder addEncryptedLeakMatchPrefixes(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEncryptedLeakMatchPrefixesIsMutable();
      encryptedLeakMatchPrefixes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of prefixes of the encrypted potential password leaks that matched the
     * given parameters. They should be compared with the client-side decryption
     * prefix of `reencrypted_user_credentials_hash`
     * </pre>
     *
     * <code>repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param values The encryptedLeakMatchPrefixes to add.
     * @return This builder for chaining.
     */
    public Builder addAllEncryptedLeakMatchPrefixes(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureEncryptedLeakMatchPrefixesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, encryptedLeakMatchPrefixes_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of prefixes of the encrypted potential password leaks that matched the
     * given parameters. They should be compared with the client-side decryption
     * prefix of `reencrypted_user_credentials_hash`
     * </pre>
     *
     * <code>repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearEncryptedLeakMatchPrefixes() {
      encryptedLeakMatchPrefixes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString reencryptedUserCredentialsHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Corresponds to the re-encryption of the `encrypted_user_credentials_hash`
     * field. Used to match potential password leaks within
     * `encrypted_leak_match_prefixes`.
     * </pre>
     *
     * <code>bytes reencrypted_user_credentials_hash = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The reencryptedUserCredentialsHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getReencryptedUserCredentialsHash() {
      return reencryptedUserCredentialsHash_;
    }
    /**
     * <pre>
     * Corresponds to the re-encryption of the `encrypted_user_credentials_hash`
     * field. Used to match potential password leaks within
     * `encrypted_leak_match_prefixes`.
     * </pre>
     *
     * <code>bytes reencrypted_user_credentials_hash = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The reencryptedUserCredentialsHash to set.
     * @return This builder for chaining.
     */
    public Builder setReencryptedUserCredentialsHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      reencryptedUserCredentialsHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponds to the re-encryption of the `encrypted_user_credentials_hash`
     * field. Used to match potential password leaks within
     * `encrypted_leak_match_prefixes`.
     * </pre>
     *
     * <code>bytes reencrypted_user_credentials_hash = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearReencryptedUserCredentialsHash() {
      
      reencryptedUserCredentialsHash_ = getDefaultInstance().getReencryptedUserCredentialsHash();
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


    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.PrivatePasswordLeakVerification)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.PrivatePasswordLeakVerification)
  private static final com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification();
  }

  public static com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrivatePasswordLeakVerification>
      PARSER = new com.google.protobuf.AbstractParser<PrivatePasswordLeakVerification>() {
    @java.lang.Override
    public PrivatePasswordLeakVerification parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PrivatePasswordLeakVerification(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PrivatePasswordLeakVerification> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrivatePasswordLeakVerification> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

