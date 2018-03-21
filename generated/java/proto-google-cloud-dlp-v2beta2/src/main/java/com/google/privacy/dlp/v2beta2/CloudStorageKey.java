// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/storage.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Record key for a finding in a Cloud Storage file.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.CloudStorageKey}
 */
public  final class CloudStorageKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.CloudStorageKey)
    CloudStorageKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloudStorageKey.newBuilder() to construct.
  private CloudStorageKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloudStorageKey() {
    filePath_ = "";
    startOffset_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CloudStorageKey(
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
            java.lang.String s = input.readStringRequireUtf8();

            filePath_ = s;
            break;
          }
          case 16: {

            startOffset_ = input.readInt64();
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
    return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_CloudStorageKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_CloudStorageKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.CloudStorageKey.class, com.google.privacy.dlp.v2beta2.CloudStorageKey.Builder.class);
  }

  public static final int FILE_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object filePath_;
  /**
   * <pre>
   * Path to the file.
   * </pre>
   *
   * <code>string file_path = 1;</code>
   */
  public java.lang.String getFilePath() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filePath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path to the file.
   * </pre>
   *
   * <code>string file_path = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFilePathBytes() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_OFFSET_FIELD_NUMBER = 2;
  private long startOffset_;
  /**
   * <pre>
   * Byte offset of the referenced data in the file.
   * </pre>
   *
   * <code>int64 start_offset = 2;</code>
   */
  public long getStartOffset() {
    return startOffset_;
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
    if (!getFilePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filePath_);
    }
    if (startOffset_ != 0L) {
      output.writeInt64(2, startOffset_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFilePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, filePath_);
    }
    if (startOffset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, startOffset_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.CloudStorageKey)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.CloudStorageKey other = (com.google.privacy.dlp.v2beta2.CloudStorageKey) obj;

    boolean result = true;
    result = result && getFilePath()
        .equals(other.getFilePath());
    result = result && (getStartOffset()
        == other.getStartOffset());
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
    hash = (37 * hash) + FILE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getFilePath().hashCode();
    hash = (37 * hash) + START_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartOffset());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.CloudStorageKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.CloudStorageKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.CloudStorageKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.CloudStorageKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.CloudStorageKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.CloudStorageKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.CloudStorageKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.CloudStorageKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.CloudStorageKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.CloudStorageKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.CloudStorageKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.CloudStorageKey parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.CloudStorageKey prototype) {
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
   * Record key for a finding in a Cloud Storage file.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.CloudStorageKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.CloudStorageKey)
      com.google.privacy.dlp.v2beta2.CloudStorageKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_CloudStorageKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_CloudStorageKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.CloudStorageKey.class, com.google.privacy.dlp.v2beta2.CloudStorageKey.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.CloudStorageKey.newBuilder()
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
      filePath_ = "";

      startOffset_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_CloudStorageKey_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.CloudStorageKey getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.CloudStorageKey.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.CloudStorageKey build() {
      com.google.privacy.dlp.v2beta2.CloudStorageKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.CloudStorageKey buildPartial() {
      com.google.privacy.dlp.v2beta2.CloudStorageKey result = new com.google.privacy.dlp.v2beta2.CloudStorageKey(this);
      result.filePath_ = filePath_;
      result.startOffset_ = startOffset_;
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
      if (other instanceof com.google.privacy.dlp.v2beta2.CloudStorageKey) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.CloudStorageKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.CloudStorageKey other) {
      if (other == com.google.privacy.dlp.v2beta2.CloudStorageKey.getDefaultInstance()) return this;
      if (!other.getFilePath().isEmpty()) {
        filePath_ = other.filePath_;
        onChanged();
      }
      if (other.getStartOffset() != 0L) {
        setStartOffset(other.getStartOffset());
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
      com.google.privacy.dlp.v2beta2.CloudStorageKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.CloudStorageKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object filePath_ = "";
    /**
     * <pre>
     * Path to the file.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     */
    public java.lang.String getFilePath() {
      java.lang.Object ref = filePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path to the file.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFilePathBytes() {
      java.lang.Object ref = filePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path to the file.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     */
    public Builder setFilePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path to the file.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     */
    public Builder clearFilePath() {
      
      filePath_ = getDefaultInstance().getFilePath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path to the file.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     */
    public Builder setFilePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filePath_ = value;
      onChanged();
      return this;
    }

    private long startOffset_ ;
    /**
     * <pre>
     * Byte offset of the referenced data in the file.
     * </pre>
     *
     * <code>int64 start_offset = 2;</code>
     */
    public long getStartOffset() {
      return startOffset_;
    }
    /**
     * <pre>
     * Byte offset of the referenced data in the file.
     * </pre>
     *
     * <code>int64 start_offset = 2;</code>
     */
    public Builder setStartOffset(long value) {
      
      startOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Byte offset of the referenced data in the file.
     * </pre>
     *
     * <code>int64 start_offset = 2;</code>
     */
    public Builder clearStartOffset() {
      
      startOffset_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.CloudStorageKey)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.CloudStorageKey)
  private static final com.google.privacy.dlp.v2beta2.CloudStorageKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.CloudStorageKey();
  }

  public static com.google.privacy.dlp.v2beta2.CloudStorageKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudStorageKey>
      PARSER = new com.google.protobuf.AbstractParser<CloudStorageKey>() {
    public CloudStorageKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CloudStorageKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CloudStorageKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudStorageKey> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.CloudStorageKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

