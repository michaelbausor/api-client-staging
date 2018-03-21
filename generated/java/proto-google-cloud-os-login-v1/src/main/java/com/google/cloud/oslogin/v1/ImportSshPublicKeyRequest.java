// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

/**
 * <pre>
 * A request message for importing an SSH public key.
 * </pre>
 *
 * Protobuf type {@code google.cloud.oslogin.v1.ImportSshPublicKeyRequest}
 */
public  final class ImportSshPublicKeyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.oslogin.v1.ImportSshPublicKeyRequest)
    ImportSshPublicKeyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportSshPublicKeyRequest.newBuilder() to construct.
  private ImportSshPublicKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportSshPublicKeyRequest() {
    parent_ = "";
    projectId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImportSshPublicKeyRequest(
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

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder subBuilder = null;
            if (sshPublicKey_ != null) {
              subBuilder = sshPublicKey_.toBuilder();
            }
            sshPublicKey_ = input.readMessage(com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sshPublicKey_);
              sshPublicKey_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            projectId_ = s;
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
    return com.google.cloud.oslogin.v1.OsLoginProto.internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.oslogin.v1.OsLoginProto.internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.class, com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The unique ID for the user in format `users/{user}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique ID for the user in format `users/{user}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSH_PUBLIC_KEY_FIELD_NUMBER = 2;
  private com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey sshPublicKey_;
  /**
   * <pre>
   * The SSH public key and expiration time.
   * </pre>
   *
   * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2;</code>
   */
  public boolean hasSshPublicKey() {
    return sshPublicKey_ != null;
  }
  /**
   * <pre>
   * The SSH public key and expiration time.
   * </pre>
   *
   * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2;</code>
   */
  public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey() {
    return sshPublicKey_ == null ? com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance() : sshPublicKey_;
  }
  /**
   * <pre>
   * The SSH public key and expiration time.
   * </pre>
   *
   * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2;</code>
   */
  public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder getSshPublicKeyOrBuilder() {
    return getSshPublicKey();
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * The project ID of the Google Cloud Platform project.
   * </pre>
   *
   * <code>string project_id = 3;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The project ID of the Google Cloud Platform project.
   * </pre>
   *
   * <code>string project_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (sshPublicKey_ != null) {
      output.writeMessage(2, getSshPublicKey());
    }
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, projectId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (sshPublicKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSshPublicKey());
    }
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, projectId_);
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
    if (!(obj instanceof com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest other = (com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasSshPublicKey() == other.hasSshPublicKey());
    if (hasSshPublicKey()) {
      result = result && getSshPublicKey()
          .equals(other.getSshPublicKey());
    }
    result = result && getProjectId()
        .equals(other.getProjectId());
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSshPublicKey()) {
      hash = (37 * hash) + SSH_PUBLIC_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getSshPublicKey().hashCode();
    }
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest prototype) {
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
   * A request message for importing an SSH public key.
   * </pre>
   *
   * Protobuf type {@code google.cloud.oslogin.v1.ImportSshPublicKeyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.oslogin.v1.ImportSshPublicKeyRequest)
      com.google.cloud.oslogin.v1.ImportSshPublicKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.oslogin.v1.OsLoginProto.internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.oslogin.v1.OsLoginProto.internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.class, com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.Builder.class);
    }

    // Construct using com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.newBuilder()
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
      parent_ = "";

      if (sshPublicKeyBuilder_ == null) {
        sshPublicKey_ = null;
      } else {
        sshPublicKey_ = null;
        sshPublicKeyBuilder_ = null;
      }
      projectId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.oslogin.v1.OsLoginProto.internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor;
    }

    public com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest getDefaultInstanceForType() {
      return com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.getDefaultInstance();
    }

    public com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest build() {
      com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest buildPartial() {
      com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest result = new com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest(this);
      result.parent_ = parent_;
      if (sshPublicKeyBuilder_ == null) {
        result.sshPublicKey_ = sshPublicKey_;
      } else {
        result.sshPublicKey_ = sshPublicKeyBuilder_.build();
      }
      result.projectId_ = projectId_;
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
      if (other instanceof com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest) {
        return mergeFrom((com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest other) {
      if (other == com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasSshPublicKey()) {
        mergeSshPublicKey(other.getSshPublicKey());
      }
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
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
      com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest) e.getUnfinishedMessage();
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
     * <pre>
     * The unique ID for the user in format `users/{user}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique ID for the user in format `users/{user}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique ID for the user in format `users/{user}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique ID for the user in format `users/{user}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique ID for the user in format `users/{user}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey sshPublicKey_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder> sshPublicKeyBuilder_;
    /**
     * <pre>
     * The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2;</code>
     */
    public boolean hasSshPublicKey() {
      return sshPublicKeyBuilder_ != null || sshPublicKey_ != null;
    }
    /**
     * <pre>
     * The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2;</code>
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey() {
      if (sshPublicKeyBuilder_ == null) {
        return sshPublicKey_ == null ? com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance() : sshPublicKey_;
      } else {
        return sshPublicKeyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2;</code>
     */
    public Builder setSshPublicKey(com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey value) {
      if (sshPublicKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sshPublicKey_ = value;
        onChanged();
      } else {
        sshPublicKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2;</code>
     */
    public Builder setSshPublicKey(
        com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder builderForValue) {
      if (sshPublicKeyBuilder_ == null) {
        sshPublicKey_ = builderForValue.build();
        onChanged();
      } else {
        sshPublicKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2;</code>
     */
    public Builder mergeSshPublicKey(com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey value) {
      if (sshPublicKeyBuilder_ == null) {
        if (sshPublicKey_ != null) {
          sshPublicKey_ =
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.newBuilder(sshPublicKey_).mergeFrom(value).buildPartial();
        } else {
          sshPublicKey_ = value;
        }
        onChanged();
      } else {
        sshPublicKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2;</code>
     */
    public Builder clearSshPublicKey() {
      if (sshPublicKeyBuilder_ == null) {
        sshPublicKey_ = null;
        onChanged();
      } else {
        sshPublicKey_ = null;
        sshPublicKeyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2;</code>
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder getSshPublicKeyBuilder() {
      
      onChanged();
      return getSshPublicKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2;</code>
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder getSshPublicKeyOrBuilder() {
      if (sshPublicKeyBuilder_ != null) {
        return sshPublicKeyBuilder_.getMessageOrBuilder();
      } else {
        return sshPublicKey_ == null ?
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance() : sshPublicKey_;
      }
    }
    /**
     * <pre>
     * The SSH public key and expiration time.
     * </pre>
     *
     * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder> 
        getSshPublicKeyFieldBuilder() {
      if (sshPublicKeyBuilder_ == null) {
        sshPublicKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder>(
                getSshPublicKey(),
                getParentForChildren(),
                isClean());
        sshPublicKey_ = null;
      }
      return sshPublicKeyBuilder_;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The project ID of the Google Cloud Platform project.
     * </pre>
     *
     * <code>string project_id = 3;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The project ID of the Google Cloud Platform project.
     * </pre>
     *
     * <code>string project_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The project ID of the Google Cloud Platform project.
     * </pre>
     *
     * <code>string project_id = 3;</code>
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project ID of the Google Cloud Platform project.
     * </pre>
     *
     * <code>string project_id = 3;</code>
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project ID of the Google Cloud Platform project.
     * </pre>
     *
     * <code>string project_id = 3;</code>
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.oslogin.v1.ImportSshPublicKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.oslogin.v1.ImportSshPublicKeyRequest)
  private static final com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest();
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportSshPublicKeyRequest>
      PARSER = new com.google.protobuf.AbstractParser<ImportSshPublicKeyRequest>() {
    public ImportSshPublicKeyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImportSshPublicKeyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImportSshPublicKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportSshPublicKeyRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

