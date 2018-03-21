// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Include to use an existing data crypto key wrapped by KMS.
 * Authorization requires the following IAM permissions when sending a request
 * to perform a crypto transformation using a kms-wrapped crypto key:
 * dlp.kms.encrypt
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.KmsWrappedCryptoKey}
 */
public  final class KmsWrappedCryptoKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.KmsWrappedCryptoKey)
    KmsWrappedCryptoKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KmsWrappedCryptoKey.newBuilder() to construct.
  private KmsWrappedCryptoKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KmsWrappedCryptoKey() {
    wrappedKey_ = com.google.protobuf.ByteString.EMPTY;
    cryptoKeyName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KmsWrappedCryptoKey(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            wrappedKey_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            cryptoKeyName_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_KmsWrappedCryptoKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_KmsWrappedCryptoKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.KmsWrappedCryptoKey.class, com.google.privacy.dlp.v2.KmsWrappedCryptoKey.Builder.class);
  }

  public static final int WRAPPED_KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString wrappedKey_;
  /**
   * <pre>
   * The wrapped data crypto key. [required]
   * </pre>
   *
   * <code>bytes wrapped_key = 1;</code>
   */
  public com.google.protobuf.ByteString getWrappedKey() {
    return wrappedKey_;
  }

  public static final int CRYPTO_KEY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object cryptoKeyName_;
  /**
   * <pre>
   * The resource name of the KMS CryptoKey to use for unwrapping. [required]
   * </pre>
   *
   * <code>string crypto_key_name = 2;</code>
   */
  public java.lang.String getCryptoKeyName() {
    java.lang.Object ref = cryptoKeyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cryptoKeyName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the KMS CryptoKey to use for unwrapping. [required]
   * </pre>
   *
   * <code>string crypto_key_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCryptoKeyNameBytes() {
    java.lang.Object ref = cryptoKeyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cryptoKeyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!wrappedKey_.isEmpty()) {
      output.writeBytes(1, wrappedKey_);
    }
    if (!getCryptoKeyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cryptoKeyName_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!wrappedKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, wrappedKey_);
    }
    if (!getCryptoKeyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cryptoKeyName_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.KmsWrappedCryptoKey)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.KmsWrappedCryptoKey other = (com.google.privacy.dlp.v2.KmsWrappedCryptoKey) obj;

    boolean result = true;
    result = result && getWrappedKey()
        .equals(other.getWrappedKey());
    result = result && getCryptoKeyName()
        .equals(other.getCryptoKeyName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + WRAPPED_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getWrappedKey().hashCode();
    hash = (37 * hash) + CRYPTO_KEY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getCryptoKeyName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.privacy.dlp.v2.KmsWrappedCryptoKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Include to use an existing data crypto key wrapped by KMS.
   * Authorization requires the following IAM permissions when sending a request
   * to perform a crypto transformation using a kms-wrapped crypto key:
   * dlp.kms.encrypt
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.KmsWrappedCryptoKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.KmsWrappedCryptoKey)
      com.google.privacy.dlp.v2.KmsWrappedCryptoKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_KmsWrappedCryptoKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_KmsWrappedCryptoKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.KmsWrappedCryptoKey.class, com.google.privacy.dlp.v2.KmsWrappedCryptoKey.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.KmsWrappedCryptoKey.newBuilder()
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
    public Builder clear() {
      super.clear();
      wrappedKey_ = com.google.protobuf.ByteString.EMPTY;

      cryptoKeyName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_KmsWrappedCryptoKey_descriptor;
    }

    public com.google.privacy.dlp.v2.KmsWrappedCryptoKey getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.KmsWrappedCryptoKey.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2.KmsWrappedCryptoKey build() {
      com.google.privacy.dlp.v2.KmsWrappedCryptoKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2.KmsWrappedCryptoKey buildPartial() {
      com.google.privacy.dlp.v2.KmsWrappedCryptoKey result = new com.google.privacy.dlp.v2.KmsWrappedCryptoKey(this);
      result.wrappedKey_ = wrappedKey_;
      result.cryptoKeyName_ = cryptoKeyName_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2.KmsWrappedCryptoKey) {
        return mergeFrom((com.google.privacy.dlp.v2.KmsWrappedCryptoKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.KmsWrappedCryptoKey other) {
      if (other == com.google.privacy.dlp.v2.KmsWrappedCryptoKey.getDefaultInstance()) return this;
      if (other.getWrappedKey() != com.google.protobuf.ByteString.EMPTY) {
        setWrappedKey(other.getWrappedKey());
      }
      if (!other.getCryptoKeyName().isEmpty()) {
        cryptoKeyName_ = other.cryptoKeyName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.privacy.dlp.v2.KmsWrappedCryptoKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.KmsWrappedCryptoKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString wrappedKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The wrapped data crypto key. [required]
     * </pre>
     *
     * <code>bytes wrapped_key = 1;</code>
     */
    public com.google.protobuf.ByteString getWrappedKey() {
      return wrappedKey_;
    }
    /**
     * <pre>
     * The wrapped data crypto key. [required]
     * </pre>
     *
     * <code>bytes wrapped_key = 1;</code>
     */
    public Builder setWrappedKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      wrappedKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The wrapped data crypto key. [required]
     * </pre>
     *
     * <code>bytes wrapped_key = 1;</code>
     */
    public Builder clearWrappedKey() {
      
      wrappedKey_ = getDefaultInstance().getWrappedKey();
      onChanged();
      return this;
    }

    private java.lang.Object cryptoKeyName_ = "";
    /**
     * <pre>
     * The resource name of the KMS CryptoKey to use for unwrapping. [required]
     * </pre>
     *
     * <code>string crypto_key_name = 2;</code>
     */
    public java.lang.String getCryptoKeyName() {
      java.lang.Object ref = cryptoKeyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cryptoKeyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the KMS CryptoKey to use for unwrapping. [required]
     * </pre>
     *
     * <code>string crypto_key_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCryptoKeyNameBytes() {
      java.lang.Object ref = cryptoKeyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cryptoKeyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the KMS CryptoKey to use for unwrapping. [required]
     * </pre>
     *
     * <code>string crypto_key_name = 2;</code>
     */
    public Builder setCryptoKeyName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cryptoKeyName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the KMS CryptoKey to use for unwrapping. [required]
     * </pre>
     *
     * <code>string crypto_key_name = 2;</code>
     */
    public Builder clearCryptoKeyName() {
      
      cryptoKeyName_ = getDefaultInstance().getCryptoKeyName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the KMS CryptoKey to use for unwrapping. [required]
     * </pre>
     *
     * <code>string crypto_key_name = 2;</code>
     */
    public Builder setCryptoKeyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cryptoKeyName_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.KmsWrappedCryptoKey)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.KmsWrappedCryptoKey)
  private static final com.google.privacy.dlp.v2.KmsWrappedCryptoKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.KmsWrappedCryptoKey();
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KmsWrappedCryptoKey>
      PARSER = new com.google.protobuf.AbstractParser<KmsWrappedCryptoKey>() {
    public KmsWrappedCryptoKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KmsWrappedCryptoKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KmsWrappedCryptoKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KmsWrappedCryptoKey> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2.KmsWrappedCryptoKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

