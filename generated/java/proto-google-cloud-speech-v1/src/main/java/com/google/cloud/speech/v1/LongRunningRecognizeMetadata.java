// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

/**
 * <pre>
 * Describes the progress of a long-running `LongRunningRecognize` call. It is
 * included in the `metadata` field of the `Operation` returned by the
 * `GetOperation` call of the `google::longrunning::Operations` service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1.LongRunningRecognizeMetadata}
 */
public  final class LongRunningRecognizeMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1.LongRunningRecognizeMetadata)
    LongRunningRecognizeMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LongRunningRecognizeMetadata.newBuilder() to construct.
  private LongRunningRecognizeMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LongRunningRecognizeMetadata() {
    progressPercent_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LongRunningRecognizeMetadata(
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
          case 8: {

            progressPercent_ = input.readInt32();
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (startTime_ != null) {
              subBuilder = startTime_.toBuilder();
            }
            startTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(startTime_);
              startTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (lastUpdateTime_ != null) {
              subBuilder = lastUpdateTime_.toBuilder();
            }
            lastUpdateTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lastUpdateTime_);
              lastUpdateTime_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1.LongRunningRecognizeMetadata.class, com.google.cloud.speech.v1.LongRunningRecognizeMetadata.Builder.class);
  }

  public static final int PROGRESS_PERCENT_FIELD_NUMBER = 1;
  private int progressPercent_;
  /**
   * <pre>
   * Approximate percentage of audio processed thus far. Guaranteed to be 100
   * when the audio is fully processed and the results are available.
   * </pre>
   *
   * <code>int32 progress_percent = 1;</code>
   */
  public int getProgressPercent() {
    return progressPercent_;
  }

  public static final int START_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp startTime_;
  /**
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   */
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   */
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return getStartTime();
  }

  public static final int LAST_UPDATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp lastUpdateTime_;
  /**
   * <pre>
   * Time of the most recent processing update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
   */
  public boolean hasLastUpdateTime() {
    return lastUpdateTime_ != null;
  }
  /**
   * <pre>
   * Time of the most recent processing update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
   */
  public com.google.protobuf.Timestamp getLastUpdateTime() {
    return lastUpdateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdateTime_;
  }
  /**
   * <pre>
   * Time of the most recent processing update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getLastUpdateTimeOrBuilder() {
    return getLastUpdateTime();
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
    if (progressPercent_ != 0) {
      output.writeInt32(1, progressPercent_);
    }
    if (startTime_ != null) {
      output.writeMessage(2, getStartTime());
    }
    if (lastUpdateTime_ != null) {
      output.writeMessage(3, getLastUpdateTime());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (progressPercent_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, progressPercent_);
    }
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStartTime());
    }
    if (lastUpdateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLastUpdateTime());
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
    if (!(obj instanceof com.google.cloud.speech.v1.LongRunningRecognizeMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1.LongRunningRecognizeMetadata other = (com.google.cloud.speech.v1.LongRunningRecognizeMetadata) obj;

    boolean result = true;
    result = result && (getProgressPercent()
        == other.getProgressPercent());
    result = result && (hasStartTime() == other.hasStartTime());
    if (hasStartTime()) {
      result = result && getStartTime()
          .equals(other.getStartTime());
    }
    result = result && (hasLastUpdateTime() == other.hasLastUpdateTime());
    if (hasLastUpdateTime()) {
      result = result && getLastUpdateTime()
          .equals(other.getLastUpdateTime());
    }
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
    hash = (37 * hash) + PROGRESS_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getProgressPercent();
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasLastUpdateTime()) {
      hash = (37 * hash) + LAST_UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastUpdateTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v1.LongRunningRecognizeMetadata prototype) {
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
   * Describes the progress of a long-running `LongRunningRecognize` call. It is
   * included in the `metadata` field of the `Operation` returned by the
   * `GetOperation` call of the `google::longrunning::Operations` service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1.LongRunningRecognizeMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1.LongRunningRecognizeMetadata)
      com.google.cloud.speech.v1.LongRunningRecognizeMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1.LongRunningRecognizeMetadata.class, com.google.cloud.speech.v1.LongRunningRecognizeMetadata.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1.LongRunningRecognizeMetadata.newBuilder()
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
      progressPercent_ = 0;

      if (startTimeBuilder_ == null) {
        startTime_ = null;
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }
      if (lastUpdateTimeBuilder_ == null) {
        lastUpdateTime_ = null;
      } else {
        lastUpdateTime_ = null;
        lastUpdateTimeBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor;
    }

    public com.google.cloud.speech.v1.LongRunningRecognizeMetadata getDefaultInstanceForType() {
      return com.google.cloud.speech.v1.LongRunningRecognizeMetadata.getDefaultInstance();
    }

    public com.google.cloud.speech.v1.LongRunningRecognizeMetadata build() {
      com.google.cloud.speech.v1.LongRunningRecognizeMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.speech.v1.LongRunningRecognizeMetadata buildPartial() {
      com.google.cloud.speech.v1.LongRunningRecognizeMetadata result = new com.google.cloud.speech.v1.LongRunningRecognizeMetadata(this);
      result.progressPercent_ = progressPercent_;
      if (startTimeBuilder_ == null) {
        result.startTime_ = startTime_;
      } else {
        result.startTime_ = startTimeBuilder_.build();
      }
      if (lastUpdateTimeBuilder_ == null) {
        result.lastUpdateTime_ = lastUpdateTime_;
      } else {
        result.lastUpdateTime_ = lastUpdateTimeBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.speech.v1.LongRunningRecognizeMetadata) {
        return mergeFrom((com.google.cloud.speech.v1.LongRunningRecognizeMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1.LongRunningRecognizeMetadata other) {
      if (other == com.google.cloud.speech.v1.LongRunningRecognizeMetadata.getDefaultInstance()) return this;
      if (other.getProgressPercent() != 0) {
        setProgressPercent(other.getProgressPercent());
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasLastUpdateTime()) {
        mergeLastUpdateTime(other.getLastUpdateTime());
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
      com.google.cloud.speech.v1.LongRunningRecognizeMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.speech.v1.LongRunningRecognizeMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int progressPercent_ ;
    /**
     * <pre>
     * Approximate percentage of audio processed thus far. Guaranteed to be 100
     * when the audio is fully processed and the results are available.
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     */
    public int getProgressPercent() {
      return progressPercent_;
    }
    /**
     * <pre>
     * Approximate percentage of audio processed thus far. Guaranteed to be 100
     * when the audio is fully processed and the results are available.
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     */
    public Builder setProgressPercent(int value) {
      
      progressPercent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Approximate percentage of audio processed thus far. Guaranteed to be 100
     * when the audio is fully processed and the results are available.
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     */
    public Builder clearProgressPercent() {
      
      progressPercent_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp startTime_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startTimeBuilder_;
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public boolean hasStartTime() {
      return startTimeBuilder_ != null || startTime_ != null;
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
        onChanged();
      } else {
        startTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder setStartTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
        onChanged();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (startTime_ != null) {
          startTime_ =
            com.google.protobuf.Timestamp.newBuilder(startTime_).mergeFrom(value).buildPartial();
        } else {
          startTime_ = value;
        }
        onChanged();
      } else {
        startTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder clearStartTime() {
      if (startTimeBuilder_ == null) {
        startTime_ = null;
        onChanged();
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
      
      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStartTime(),
                getParentForChildren(),
                isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Timestamp lastUpdateTime_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> lastUpdateTimeBuilder_;
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public boolean hasLastUpdateTime() {
      return lastUpdateTimeBuilder_ != null || lastUpdateTime_ != null;
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public com.google.protobuf.Timestamp getLastUpdateTime() {
      if (lastUpdateTimeBuilder_ == null) {
        return lastUpdateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdateTime_;
      } else {
        return lastUpdateTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public Builder setLastUpdateTime(com.google.protobuf.Timestamp value) {
      if (lastUpdateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastUpdateTime_ = value;
        onChanged();
      } else {
        lastUpdateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public Builder setLastUpdateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastUpdateTimeBuilder_ == null) {
        lastUpdateTime_ = builderForValue.build();
        onChanged();
      } else {
        lastUpdateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public Builder mergeLastUpdateTime(com.google.protobuf.Timestamp value) {
      if (lastUpdateTimeBuilder_ == null) {
        if (lastUpdateTime_ != null) {
          lastUpdateTime_ =
            com.google.protobuf.Timestamp.newBuilder(lastUpdateTime_).mergeFrom(value).buildPartial();
        } else {
          lastUpdateTime_ = value;
        }
        onChanged();
      } else {
        lastUpdateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public Builder clearLastUpdateTime() {
      if (lastUpdateTimeBuilder_ == null) {
        lastUpdateTime_ = null;
        onChanged();
      } else {
        lastUpdateTime_ = null;
        lastUpdateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getLastUpdateTimeBuilder() {
      
      onChanged();
      return getLastUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLastUpdateTimeOrBuilder() {
      if (lastUpdateTimeBuilder_ != null) {
        return lastUpdateTimeBuilder_.getMessageOrBuilder();
      } else {
        return lastUpdateTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdateTime_;
      }
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getLastUpdateTimeFieldBuilder() {
      if (lastUpdateTimeBuilder_ == null) {
        lastUpdateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getLastUpdateTime(),
                getParentForChildren(),
                isClean());
        lastUpdateTime_ = null;
      }
      return lastUpdateTimeBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1.LongRunningRecognizeMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1.LongRunningRecognizeMetadata)
  private static final com.google.cloud.speech.v1.LongRunningRecognizeMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1.LongRunningRecognizeMetadata();
  }

  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LongRunningRecognizeMetadata>
      PARSER = new com.google.protobuf.AbstractParser<LongRunningRecognizeMetadata>() {
    public LongRunningRecognizeMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LongRunningRecognizeMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LongRunningRecognizeMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LongRunningRecognizeMetadata> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.speech.v1.LongRunningRecognizeMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

