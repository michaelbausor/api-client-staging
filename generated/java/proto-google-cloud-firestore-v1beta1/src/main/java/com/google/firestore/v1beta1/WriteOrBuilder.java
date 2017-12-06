// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/write.proto

package com.google.firestore.v1beta1;

public interface WriteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1beta1.Write)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A document to write.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Document update = 1;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * A document to write.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Document update = 1;</code>
   */
  com.google.firestore.v1beta1.Document getUpdate();
  /**
   * <pre>
   * A document to write.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Document update = 1;</code>
   */
  com.google.firestore.v1beta1.DocumentOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * A document name to delete. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string delete = 2;</code>
   */
  java.lang.String getDelete();
  /**
   * <pre>
   * A document name to delete. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string delete = 2;</code>
   */
  com.google.protobuf.ByteString
      getDeleteBytes();

  /**
   * <pre>
   * Applies a tranformation to a document.
   * At most one `transform` per document is allowed in a given request.
   * An `update` cannot follow a `transform` on the same document in a given
   * request.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentTransform transform = 6;</code>
   */
  boolean hasTransform();
  /**
   * <pre>
   * Applies a tranformation to a document.
   * At most one `transform` per document is allowed in a given request.
   * An `update` cannot follow a `transform` on the same document in a given
   * request.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentTransform transform = 6;</code>
   */
  com.google.firestore.v1beta1.DocumentTransform getTransform();
  /**
   * <pre>
   * Applies a tranformation to a document.
   * At most one `transform` per document is allowed in a given request.
   * An `update` cannot follow a `transform` on the same document in a given
   * request.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentTransform transform = 6;</code>
   */
  com.google.firestore.v1beta1.DocumentTransformOrBuilder getTransformOrBuilder();

  /**
   * <pre>
   * The fields to update in this write.
   * This field can be set only when the operation is `update`.
   * None of the field paths in the mask may contain a reserved name.
   * If the document exists on the server and has fields not referenced in the
   * mask, they are left unchanged.
   * Fields referenced in the mask, but not present in the input document, are
   * deleted from the document on the server.
   * The field paths in this mask must not contain a reserved field name.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentMask update_mask = 3;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The fields to update in this write.
   * This field can be set only when the operation is `update`.
   * None of the field paths in the mask may contain a reserved name.
   * If the document exists on the server and has fields not referenced in the
   * mask, they are left unchanged.
   * Fields referenced in the mask, but not present in the input document, are
   * deleted from the document on the server.
   * The field paths in this mask must not contain a reserved field name.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentMask update_mask = 3;</code>
   */
  com.google.firestore.v1beta1.DocumentMask getUpdateMask();
  /**
   * <pre>
   * The fields to update in this write.
   * This field can be set only when the operation is `update`.
   * None of the field paths in the mask may contain a reserved name.
   * If the document exists on the server and has fields not referenced in the
   * mask, they are left unchanged.
   * Fields referenced in the mask, but not present in the input document, are
   * deleted from the document on the server.
   * The field paths in this mask must not contain a reserved field name.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentMask update_mask = 3;</code>
   */
  com.google.firestore.v1beta1.DocumentMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * An optional precondition on the document.
   * The write will fail if this is set and not met by the target document.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Precondition current_document = 4;</code>
   */
  boolean hasCurrentDocument();
  /**
   * <pre>
   * An optional precondition on the document.
   * The write will fail if this is set and not met by the target document.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Precondition current_document = 4;</code>
   */
  com.google.firestore.v1beta1.Precondition getCurrentDocument();
  /**
   * <pre>
   * An optional precondition on the document.
   * The write will fail if this is set and not met by the target document.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Precondition current_document = 4;</code>
   */
  com.google.firestore.v1beta1.PreconditionOrBuilder getCurrentDocumentOrBuilder();

  public com.google.firestore.v1beta1.Write.OperationCase getOperationCase();
}
