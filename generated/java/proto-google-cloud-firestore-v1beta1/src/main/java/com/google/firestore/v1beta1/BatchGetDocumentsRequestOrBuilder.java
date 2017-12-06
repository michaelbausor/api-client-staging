// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/firestore.proto

package com.google.firestore.v1beta1;

public interface BatchGetDocumentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1beta1.BatchGetDocumentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1;</code>
   */
  java.lang.String getDatabase();
  /**
   * <pre>
   * The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1;</code>
   */
  com.google.protobuf.ByteString
      getDatabaseBytes();

  /**
   * <pre>
   * The names of the documents to retrieve. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * The request will fail if any of the document is not a child resource of the
   * given `database`. Duplicate names will be elided.
   * </pre>
   *
   * <code>repeated string documents = 2;</code>
   */
  java.util.List<java.lang.String>
      getDocumentsList();
  /**
   * <pre>
   * The names of the documents to retrieve. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * The request will fail if any of the document is not a child resource of the
   * given `database`. Duplicate names will be elided.
   * </pre>
   *
   * <code>repeated string documents = 2;</code>
   */
  int getDocumentsCount();
  /**
   * <pre>
   * The names of the documents to retrieve. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * The request will fail if any of the document is not a child resource of the
   * given `database`. Duplicate names will be elided.
   * </pre>
   *
   * <code>repeated string documents = 2;</code>
   */
  java.lang.String getDocuments(int index);
  /**
   * <pre>
   * The names of the documents to retrieve. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * The request will fail if any of the document is not a child resource of the
   * given `database`. Duplicate names will be elided.
   * </pre>
   *
   * <code>repeated string documents = 2;</code>
   */
  com.google.protobuf.ByteString
      getDocumentsBytes(int index);

  /**
   * <pre>
   * The fields to return. If not set, returns all fields.
   * If a document has a field that is not present in this mask, that field will
   * not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentMask mask = 3;</code>
   */
  boolean hasMask();
  /**
   * <pre>
   * The fields to return. If not set, returns all fields.
   * If a document has a field that is not present in this mask, that field will
   * not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentMask mask = 3;</code>
   */
  com.google.firestore.v1beta1.DocumentMask getMask();
  /**
   * <pre>
   * The fields to return. If not set, returns all fields.
   * If a document has a field that is not present in this mask, that field will
   * not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.DocumentMask mask = 3;</code>
   */
  com.google.firestore.v1beta1.DocumentMaskOrBuilder getMaskOrBuilder();

  /**
   * <pre>
   * Reads documents in a transaction.
   * </pre>
   *
   * <code>bytes transaction = 4;</code>
   */
  com.google.protobuf.ByteString getTransaction();

  /**
   * <pre>
   * Starts a new transaction and reads the documents.
   * Defaults to a read-only transaction.
   * The new transaction ID will be returned as the first response in the
   * stream.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.TransactionOptions new_transaction = 5;</code>
   */
  boolean hasNewTransaction();
  /**
   * <pre>
   * Starts a new transaction and reads the documents.
   * Defaults to a read-only transaction.
   * The new transaction ID will be returned as the first response in the
   * stream.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.TransactionOptions new_transaction = 5;</code>
   */
  com.google.firestore.v1beta1.TransactionOptions getNewTransaction();
  /**
   * <pre>
   * Starts a new transaction and reads the documents.
   * Defaults to a read-only transaction.
   * The new transaction ID will be returned as the first response in the
   * stream.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.TransactionOptions new_transaction = 5;</code>
   */
  com.google.firestore.v1beta1.TransactionOptionsOrBuilder getNewTransactionOrBuilder();

  /**
   * <pre>
   * Reads documents as they were at the given time.
   * This may not be older than 60 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 7;</code>
   */
  boolean hasReadTime();
  /**
   * <pre>
   * Reads documents as they were at the given time.
   * This may not be older than 60 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 7;</code>
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   * <pre>
   * Reads documents as they were at the given time.
   * This may not be older than 60 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  public com.google.firestore.v1beta1.BatchGetDocumentsRequest.ConsistencySelectorCase getConsistencySelectorCase();
}
