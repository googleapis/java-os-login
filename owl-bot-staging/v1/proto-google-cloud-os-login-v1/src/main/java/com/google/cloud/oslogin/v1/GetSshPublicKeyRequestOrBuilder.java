// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

public interface GetSshPublicKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oslogin.v1.GetSshPublicKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The fingerprint of the public key to retrieve. Public keys are
   * identified by their SHA-256 fingerprint. The fingerprint of the public key
   * is in format `users/{user}/sshPublicKeys/{fingerprint}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The fingerprint of the public key to retrieve. Public keys are
   * identified by their SHA-256 fingerprint. The fingerprint of the public key
   * is in format `users/{user}/sshPublicKeys/{fingerprint}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
