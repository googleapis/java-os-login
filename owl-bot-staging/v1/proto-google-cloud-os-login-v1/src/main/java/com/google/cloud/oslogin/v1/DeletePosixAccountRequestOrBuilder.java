// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

public interface DeletePosixAccountRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oslogin.v1.DeletePosixAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. A reference to the POSIX account to update. POSIX accounts are identified
   * by the project ID they are associated with. A reference to the POSIX
   * account is in format `users/{user}/projects/{project}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. A reference to the POSIX account to update. POSIX accounts are identified
   * by the project ID they are associated with. A reference to the POSIX
   * account is in format `users/{user}/projects/{project}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
