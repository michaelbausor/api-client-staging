// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

/**
 * <pre>
 * Represents a sentence in the input document.
 * </pre>
 *
 * Protobuf type {@code google.cloud.language.v1beta2.Sentence}
 */
public  final class Sentence extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.language.v1beta2.Sentence)
    SentenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Sentence.newBuilder() to construct.
  private Sentence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Sentence() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Sentence(
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
            com.google.cloud.language.v1beta2.TextSpan.Builder subBuilder = null;
            if (text_ != null) {
              subBuilder = text_.toBuilder();
            }
            text_ = input.readMessage(com.google.cloud.language.v1beta2.TextSpan.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(text_);
              text_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.cloud.language.v1beta2.Sentiment.Builder subBuilder = null;
            if (sentiment_ != null) {
              subBuilder = sentiment_.toBuilder();
            }
            sentiment_ = input.readMessage(com.google.cloud.language.v1beta2.Sentiment.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sentiment_);
              sentiment_ = subBuilder.buildPartial();
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
    return com.google.cloud.language.v1beta2.LanguageServiceProto.internal_static_google_cloud_language_v1beta2_Sentence_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.language.v1beta2.LanguageServiceProto.internal_static_google_cloud_language_v1beta2_Sentence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.language.v1beta2.Sentence.class, com.google.cloud.language.v1beta2.Sentence.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  private com.google.cloud.language.v1beta2.TextSpan text_;
  /**
   * <pre>
   * The sentence text.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.TextSpan text = 1;</code>
   */
  public boolean hasText() {
    return text_ != null;
  }
  /**
   * <pre>
   * The sentence text.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.TextSpan text = 1;</code>
   */
  public com.google.cloud.language.v1beta2.TextSpan getText() {
    return text_ == null ? com.google.cloud.language.v1beta2.TextSpan.getDefaultInstance() : text_;
  }
  /**
   * <pre>
   * The sentence text.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.TextSpan text = 1;</code>
   */
  public com.google.cloud.language.v1beta2.TextSpanOrBuilder getTextOrBuilder() {
    return getText();
  }

  public static final int SENTIMENT_FIELD_NUMBER = 2;
  private com.google.cloud.language.v1beta2.Sentiment sentiment_;
  /**
   * <pre>
   * For calls to [AnalyzeSentiment][] or if
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_document_sentiment] is set to
   * true, this field will contain the sentiment for the sentence.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 2;</code>
   */
  public boolean hasSentiment() {
    return sentiment_ != null;
  }
  /**
   * <pre>
   * For calls to [AnalyzeSentiment][] or if
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_document_sentiment] is set to
   * true, this field will contain the sentiment for the sentence.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 2;</code>
   */
  public com.google.cloud.language.v1beta2.Sentiment getSentiment() {
    return sentiment_ == null ? com.google.cloud.language.v1beta2.Sentiment.getDefaultInstance() : sentiment_;
  }
  /**
   * <pre>
   * For calls to [AnalyzeSentiment][] or if
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_document_sentiment] is set to
   * true, this field will contain the sentiment for the sentence.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 2;</code>
   */
  public com.google.cloud.language.v1beta2.SentimentOrBuilder getSentimentOrBuilder() {
    return getSentiment();
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
    if (text_ != null) {
      output.writeMessage(1, getText());
    }
    if (sentiment_ != null) {
      output.writeMessage(2, getSentiment());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (text_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getText());
    }
    if (sentiment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSentiment());
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
    if (!(obj instanceof com.google.cloud.language.v1beta2.Sentence)) {
      return super.equals(obj);
    }
    com.google.cloud.language.v1beta2.Sentence other = (com.google.cloud.language.v1beta2.Sentence) obj;

    boolean result = true;
    result = result && (hasText() == other.hasText());
    if (hasText()) {
      result = result && getText()
          .equals(other.getText());
    }
    result = result && (hasSentiment() == other.hasSentiment());
    if (hasSentiment()) {
      result = result && getSentiment()
          .equals(other.getSentiment());
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
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    if (hasSentiment()) {
      hash = (37 * hash) + SENTIMENT_FIELD_NUMBER;
      hash = (53 * hash) + getSentiment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.language.v1beta2.Sentence parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1beta2.Sentence parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1beta2.Sentence parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1beta2.Sentence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1beta2.Sentence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1beta2.Sentence parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1beta2.Sentence parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1beta2.Sentence parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.language.v1beta2.Sentence parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1beta2.Sentence parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.language.v1beta2.Sentence parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1beta2.Sentence parseFrom(
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
  public static Builder newBuilder(com.google.cloud.language.v1beta2.Sentence prototype) {
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
   * Represents a sentence in the input document.
   * </pre>
   *
   * Protobuf type {@code google.cloud.language.v1beta2.Sentence}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.language.v1beta2.Sentence)
      com.google.cloud.language.v1beta2.SentenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto.internal_static_google_cloud_language_v1beta2_Sentence_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto.internal_static_google_cloud_language_v1beta2_Sentence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.language.v1beta2.Sentence.class, com.google.cloud.language.v1beta2.Sentence.Builder.class);
    }

    // Construct using com.google.cloud.language.v1beta2.Sentence.newBuilder()
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
      if (textBuilder_ == null) {
        text_ = null;
      } else {
        text_ = null;
        textBuilder_ = null;
      }
      if (sentimentBuilder_ == null) {
        sentiment_ = null;
      } else {
        sentiment_ = null;
        sentimentBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto.internal_static_google_cloud_language_v1beta2_Sentence_descriptor;
    }

    public com.google.cloud.language.v1beta2.Sentence getDefaultInstanceForType() {
      return com.google.cloud.language.v1beta2.Sentence.getDefaultInstance();
    }

    public com.google.cloud.language.v1beta2.Sentence build() {
      com.google.cloud.language.v1beta2.Sentence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.language.v1beta2.Sentence buildPartial() {
      com.google.cloud.language.v1beta2.Sentence result = new com.google.cloud.language.v1beta2.Sentence(this);
      if (textBuilder_ == null) {
        result.text_ = text_;
      } else {
        result.text_ = textBuilder_.build();
      }
      if (sentimentBuilder_ == null) {
        result.sentiment_ = sentiment_;
      } else {
        result.sentiment_ = sentimentBuilder_.build();
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
      if (other instanceof com.google.cloud.language.v1beta2.Sentence) {
        return mergeFrom((com.google.cloud.language.v1beta2.Sentence)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.language.v1beta2.Sentence other) {
      if (other == com.google.cloud.language.v1beta2.Sentence.getDefaultInstance()) return this;
      if (other.hasText()) {
        mergeText(other.getText());
      }
      if (other.hasSentiment()) {
        mergeSentiment(other.getSentiment());
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
      com.google.cloud.language.v1beta2.Sentence parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.language.v1beta2.Sentence) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.language.v1beta2.TextSpan text_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1beta2.TextSpan, com.google.cloud.language.v1beta2.TextSpan.Builder, com.google.cloud.language.v1beta2.TextSpanOrBuilder> textBuilder_;
    /**
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.TextSpan text = 1;</code>
     */
    public boolean hasText() {
      return textBuilder_ != null || text_ != null;
    }
    /**
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.TextSpan text = 1;</code>
     */
    public com.google.cloud.language.v1beta2.TextSpan getText() {
      if (textBuilder_ == null) {
        return text_ == null ? com.google.cloud.language.v1beta2.TextSpan.getDefaultInstance() : text_;
      } else {
        return textBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.TextSpan text = 1;</code>
     */
    public Builder setText(com.google.cloud.language.v1beta2.TextSpan value) {
      if (textBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        text_ = value;
        onChanged();
      } else {
        textBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.TextSpan text = 1;</code>
     */
    public Builder setText(
        com.google.cloud.language.v1beta2.TextSpan.Builder builderForValue) {
      if (textBuilder_ == null) {
        text_ = builderForValue.build();
        onChanged();
      } else {
        textBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.TextSpan text = 1;</code>
     */
    public Builder mergeText(com.google.cloud.language.v1beta2.TextSpan value) {
      if (textBuilder_ == null) {
        if (text_ != null) {
          text_ =
            com.google.cloud.language.v1beta2.TextSpan.newBuilder(text_).mergeFrom(value).buildPartial();
        } else {
          text_ = value;
        }
        onChanged();
      } else {
        textBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.TextSpan text = 1;</code>
     */
    public Builder clearText() {
      if (textBuilder_ == null) {
        text_ = null;
        onChanged();
      } else {
        text_ = null;
        textBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.TextSpan text = 1;</code>
     */
    public com.google.cloud.language.v1beta2.TextSpan.Builder getTextBuilder() {
      
      onChanged();
      return getTextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.TextSpan text = 1;</code>
     */
    public com.google.cloud.language.v1beta2.TextSpanOrBuilder getTextOrBuilder() {
      if (textBuilder_ != null) {
        return textBuilder_.getMessageOrBuilder();
      } else {
        return text_ == null ?
            com.google.cloud.language.v1beta2.TextSpan.getDefaultInstance() : text_;
      }
    }
    /**
     * <pre>
     * The sentence text.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.TextSpan text = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1beta2.TextSpan, com.google.cloud.language.v1beta2.TextSpan.Builder, com.google.cloud.language.v1beta2.TextSpanOrBuilder> 
        getTextFieldBuilder() {
      if (textBuilder_ == null) {
        textBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1beta2.TextSpan, com.google.cloud.language.v1beta2.TextSpan.Builder, com.google.cloud.language.v1beta2.TextSpanOrBuilder>(
                getText(),
                getParentForChildren(),
                isClean());
        text_ = null;
      }
      return textBuilder_;
    }

    private com.google.cloud.language.v1beta2.Sentiment sentiment_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1beta2.Sentiment, com.google.cloud.language.v1beta2.Sentiment.Builder, com.google.cloud.language.v1beta2.SentimentOrBuilder> sentimentBuilder_;
    /**
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 2;</code>
     */
    public boolean hasSentiment() {
      return sentimentBuilder_ != null || sentiment_ != null;
    }
    /**
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 2;</code>
     */
    public com.google.cloud.language.v1beta2.Sentiment getSentiment() {
      if (sentimentBuilder_ == null) {
        return sentiment_ == null ? com.google.cloud.language.v1beta2.Sentiment.getDefaultInstance() : sentiment_;
      } else {
        return sentimentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 2;</code>
     */
    public Builder setSentiment(com.google.cloud.language.v1beta2.Sentiment value) {
      if (sentimentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sentiment_ = value;
        onChanged();
      } else {
        sentimentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 2;</code>
     */
    public Builder setSentiment(
        com.google.cloud.language.v1beta2.Sentiment.Builder builderForValue) {
      if (sentimentBuilder_ == null) {
        sentiment_ = builderForValue.build();
        onChanged();
      } else {
        sentimentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 2;</code>
     */
    public Builder mergeSentiment(com.google.cloud.language.v1beta2.Sentiment value) {
      if (sentimentBuilder_ == null) {
        if (sentiment_ != null) {
          sentiment_ =
            com.google.cloud.language.v1beta2.Sentiment.newBuilder(sentiment_).mergeFrom(value).buildPartial();
        } else {
          sentiment_ = value;
        }
        onChanged();
      } else {
        sentimentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 2;</code>
     */
    public Builder clearSentiment() {
      if (sentimentBuilder_ == null) {
        sentiment_ = null;
        onChanged();
      } else {
        sentiment_ = null;
        sentimentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 2;</code>
     */
    public com.google.cloud.language.v1beta2.Sentiment.Builder getSentimentBuilder() {
      
      onChanged();
      return getSentimentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 2;</code>
     */
    public com.google.cloud.language.v1beta2.SentimentOrBuilder getSentimentOrBuilder() {
      if (sentimentBuilder_ != null) {
        return sentimentBuilder_.getMessageOrBuilder();
      } else {
        return sentiment_ == null ?
            com.google.cloud.language.v1beta2.Sentiment.getDefaultInstance() : sentiment_;
      }
    }
    /**
     * <pre>
     * For calls to [AnalyzeSentiment][] or if
     * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_document_sentiment] is set to
     * true, this field will contain the sentiment for the sentence.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1beta2.Sentiment, com.google.cloud.language.v1beta2.Sentiment.Builder, com.google.cloud.language.v1beta2.SentimentOrBuilder> 
        getSentimentFieldBuilder() {
      if (sentimentBuilder_ == null) {
        sentimentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1beta2.Sentiment, com.google.cloud.language.v1beta2.Sentiment.Builder, com.google.cloud.language.v1beta2.SentimentOrBuilder>(
                getSentiment(),
                getParentForChildren(),
                isClean());
        sentiment_ = null;
      }
      return sentimentBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.language.v1beta2.Sentence)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.language.v1beta2.Sentence)
  private static final com.google.cloud.language.v1beta2.Sentence DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.language.v1beta2.Sentence();
  }

  public static com.google.cloud.language.v1beta2.Sentence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Sentence>
      PARSER = new com.google.protobuf.AbstractParser<Sentence>() {
    public Sentence parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Sentence(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Sentence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Sentence> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.language.v1beta2.Sentence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

