/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.oslogin.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/oslogin/v1/oslogin.proto")
public final class OsLoginServiceGrpc {

  private OsLoginServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.oslogin.v1.OsLoginService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.oslogin.v1.DeletePosixAccountRequest, com.google.protobuf.Empty>
      getDeletePosixAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePosixAccount",
      requestType = com.google.cloud.oslogin.v1.DeletePosixAccountRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.oslogin.v1.DeletePosixAccountRequest, com.google.protobuf.Empty>
      getDeletePosixAccountMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.oslogin.v1.DeletePosixAccountRequest, com.google.protobuf.Empty>
        getDeletePosixAccountMethod;
    if ((getDeletePosixAccountMethod = OsLoginServiceGrpc.getDeletePosixAccountMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getDeletePosixAccountMethod = OsLoginServiceGrpc.getDeletePosixAccountMethod)
            == null) {
          OsLoginServiceGrpc.getDeletePosixAccountMethod =
              getDeletePosixAccountMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.oslogin.v1.DeletePosixAccountRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePosixAccount"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.oslogin.v1.DeletePosixAccountRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new OsLoginServiceMethodDescriptorSupplier("DeletePosixAccount"))
                      .build();
        }
      }
    }
    return getDeletePosixAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest, com.google.protobuf.Empty>
      getDeleteSshPublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSshPublicKey",
      requestType = com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest, com.google.protobuf.Empty>
      getDeleteSshPublicKeyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest, com.google.protobuf.Empty>
        getDeleteSshPublicKeyMethod;
    if ((getDeleteSshPublicKeyMethod = OsLoginServiceGrpc.getDeleteSshPublicKeyMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getDeleteSshPublicKeyMethod = OsLoginServiceGrpc.getDeleteSshPublicKeyMethod)
            == null) {
          OsLoginServiceGrpc.getDeleteSshPublicKeyMethod =
              getDeleteSshPublicKeyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSshPublicKey"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new OsLoginServiceMethodDescriptorSupplier("DeleteSshPublicKey"))
                      .build();
        }
      }
    }
    return getDeleteSshPublicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.oslogin.v1.GetLoginProfileRequest,
          com.google.cloud.oslogin.v1.LoginProfile>
      getGetLoginProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLoginProfile",
      requestType = com.google.cloud.oslogin.v1.GetLoginProfileRequest.class,
      responseType = com.google.cloud.oslogin.v1.LoginProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.oslogin.v1.GetLoginProfileRequest,
          com.google.cloud.oslogin.v1.LoginProfile>
      getGetLoginProfileMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.oslogin.v1.GetLoginProfileRequest,
            com.google.cloud.oslogin.v1.LoginProfile>
        getGetLoginProfileMethod;
    if ((getGetLoginProfileMethod = OsLoginServiceGrpc.getGetLoginProfileMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getGetLoginProfileMethod = OsLoginServiceGrpc.getGetLoginProfileMethod) == null) {
          OsLoginServiceGrpc.getGetLoginProfileMethod =
              getGetLoginProfileMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.oslogin.v1.GetLoginProfileRequest,
                          com.google.cloud.oslogin.v1.LoginProfile>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLoginProfile"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.oslogin.v1.GetLoginProfileRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.oslogin.v1.LoginProfile.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new OsLoginServiceMethodDescriptorSupplier("GetLoginProfile"))
                      .build();
        }
      }
    }
    return getGetLoginProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,
          com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
      getGetSshPublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSshPublicKey",
      requestType = com.google.cloud.oslogin.v1.GetSshPublicKeyRequest.class,
      responseType = com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,
          com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
      getGetSshPublicKeyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
        getGetSshPublicKeyMethod;
    if ((getGetSshPublicKeyMethod = OsLoginServiceGrpc.getGetSshPublicKeyMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getGetSshPublicKeyMethod = OsLoginServiceGrpc.getGetSshPublicKeyMethod) == null) {
          OsLoginServiceGrpc.getGetSshPublicKeyMethod =
              getGetSshPublicKeyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,
                          com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSshPublicKey"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.oslogin.v1.GetSshPublicKeyRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new OsLoginServiceMethodDescriptorSupplier("GetSshPublicKey"))
                      .build();
        }
      }
    }
    return getGetSshPublicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,
          com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>
      getImportSshPublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportSshPublicKey",
      requestType = com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.class,
      responseType = com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,
          com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>
      getImportSshPublicKeyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,
            com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>
        getImportSshPublicKeyMethod;
    if ((getImportSshPublicKeyMethod = OsLoginServiceGrpc.getImportSshPublicKeyMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getImportSshPublicKeyMethod = OsLoginServiceGrpc.getImportSshPublicKeyMethod)
            == null) {
          OsLoginServiceGrpc.getImportSshPublicKeyMethod =
              getImportSshPublicKeyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,
                          com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportSshPublicKey"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new OsLoginServiceMethodDescriptorSupplier("ImportSshPublicKey"))
                      .build();
        }
      }
    }
    return getImportSshPublicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,
          com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
      getUpdateSshPublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSshPublicKey",
      requestType = com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.class,
      responseType = com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,
          com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
      getUpdateSshPublicKeyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
        getUpdateSshPublicKeyMethod;
    if ((getUpdateSshPublicKeyMethod = OsLoginServiceGrpc.getUpdateSshPublicKeyMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getUpdateSshPublicKeyMethod = OsLoginServiceGrpc.getUpdateSshPublicKeyMethod)
            == null) {
          OsLoginServiceGrpc.getUpdateSshPublicKeyMethod =
              getUpdateSshPublicKeyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,
                          com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSshPublicKey"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new OsLoginServiceMethodDescriptorSupplier("UpdateSshPublicKey"))
                      .build();
        }
      }
    }
    return getUpdateSshPublicKeyMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static OsLoginServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OsLoginServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<OsLoginServiceStub>() {
          @java.lang.Override
          public OsLoginServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new OsLoginServiceStub(channel, callOptions);
          }
        };
    return OsLoginServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OsLoginServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OsLoginServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<OsLoginServiceBlockingStub>() {
          @java.lang.Override
          public OsLoginServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new OsLoginServiceBlockingStub(channel, callOptions);
          }
        };
    return OsLoginServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static OsLoginServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OsLoginServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<OsLoginServiceFutureStub>() {
          @java.lang.Override
          public OsLoginServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new OsLoginServiceFutureStub(channel, callOptions);
          }
        };
    return OsLoginServiceFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class OsLoginServiceImplBase implements io.grpc.BindableService {

    /** */
    public void deletePosixAccount(
        com.google.cloud.oslogin.v1.DeletePosixAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePosixAccountMethod(), responseObserver);
    }

    /** */
    public void deleteSshPublicKey(
        com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSshPublicKeyMethod(), responseObserver);
    }

    /** */
    public void getLoginProfile(
        com.google.cloud.oslogin.v1.GetLoginProfileRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.v1.LoginProfile> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLoginProfileMethod(), responseObserver);
    }

    /** */
    public void getSshPublicKey(
        com.google.cloud.oslogin.v1.GetSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetSshPublicKeyMethod(), responseObserver);
    }

    /** */
    public void importSshPublicKey(
        com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getImportSshPublicKeyMethod(), responseObserver);
    }

    /** */
    public void updateSshPublicKey(
        com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
            responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSshPublicKeyMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getDeletePosixAccountMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.oslogin.v1.DeletePosixAccountRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_POSIX_ACCOUNT)))
          .addMethod(
              getDeleteSshPublicKeyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_SSH_PUBLIC_KEY)))
          .addMethod(
              getGetLoginProfileMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.oslogin.v1.GetLoginProfileRequest,
                      com.google.cloud.oslogin.v1.LoginProfile>(this, METHODID_GET_LOGIN_PROFILE)))
          .addMethod(
              getGetSshPublicKeyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,
                      com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>(
                      this, METHODID_GET_SSH_PUBLIC_KEY)))
          .addMethod(
              getImportSshPublicKeyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,
                      com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>(
                      this, METHODID_IMPORT_SSH_PUBLIC_KEY)))
          .addMethod(
              getUpdateSshPublicKeyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,
                      com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>(
                      this, METHODID_UPDATE_SSH_PUBLIC_KEY)))
          .build();
    }
  }

  /** */
  public static final class OsLoginServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OsLoginServiceStub> {
    private OsLoginServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OsLoginServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OsLoginServiceStub(channel, callOptions);
    }

    /** */
    public void deletePosixAccount(
        com.google.cloud.oslogin.v1.DeletePosixAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePosixAccountMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteSshPublicKey(
        com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSshPublicKeyMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getLoginProfile(
        com.google.cloud.oslogin.v1.GetLoginProfileRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.v1.LoginProfile> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLoginProfileMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getSshPublicKey(
        com.google.cloud.oslogin.v1.GetSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSshPublicKeyMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void importSshPublicKey(
        com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportSshPublicKeyMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateSshPublicKey(
        com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSshPublicKeyMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class OsLoginServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OsLoginServiceBlockingStub> {
    private OsLoginServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OsLoginServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OsLoginServiceBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.protobuf.Empty deletePosixAccount(
        com.google.cloud.oslogin.v1.DeletePosixAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePosixAccountMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty deleteSshPublicKey(
        com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSshPublicKeyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.oslogin.v1.LoginProfile getLoginProfile(
        com.google.cloud.oslogin.v1.GetLoginProfileRequest request) {
      return blockingUnaryCall(getChannel(), getGetLoginProfileMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey(
        com.google.cloud.oslogin.v1.GetSshPublicKeyRequest request) {
      return blockingUnaryCall(getChannel(), getGetSshPublicKeyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse importSshPublicKey(
        com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getImportSshPublicKeyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey updateSshPublicKey(
        com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSshPublicKeyMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class OsLoginServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OsLoginServiceFutureStub> {
    private OsLoginServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OsLoginServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OsLoginServiceFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deletePosixAccount(com.google.cloud.oslogin.v1.DeletePosixAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePosixAccountMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteSshPublicKey(com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSshPublicKeyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.oslogin.v1.LoginProfile>
        getLoginProfile(com.google.cloud.oslogin.v1.GetLoginProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLoginProfileMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
        getSshPublicKey(com.google.cloud.oslogin.v1.GetSshPublicKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSshPublicKeyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>
        importSshPublicKey(com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getImportSshPublicKeyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
        updateSshPublicKey(com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSshPublicKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_POSIX_ACCOUNT = 0;
  private static final int METHODID_DELETE_SSH_PUBLIC_KEY = 1;
  private static final int METHODID_GET_LOGIN_PROFILE = 2;
  private static final int METHODID_GET_SSH_PUBLIC_KEY = 3;
  private static final int METHODID_IMPORT_SSH_PUBLIC_KEY = 4;
  private static final int METHODID_UPDATE_SSH_PUBLIC_KEY = 5;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OsLoginServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OsLoginServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_POSIX_ACCOUNT:
          serviceImpl.deletePosixAccount(
              (com.google.cloud.oslogin.v1.DeletePosixAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_SSH_PUBLIC_KEY:
          serviceImpl.deleteSshPublicKey(
              (com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_LOGIN_PROFILE:
          serviceImpl.getLoginProfile(
              (com.google.cloud.oslogin.v1.GetLoginProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.oslogin.v1.LoginProfile>)
                  responseObserver);
          break;
        case METHODID_GET_SSH_PUBLIC_KEY:
          serviceImpl.getSshPublicKey(
              (com.google.cloud.oslogin.v1.GetSshPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>)
                  responseObserver);
          break;
        case METHODID_IMPORT_SSH_PUBLIC_KEY:
          serviceImpl.importSshPublicKey(
              (com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>)
                  responseObserver);
          break;
        case METHODID_UPDATE_SSH_PUBLIC_KEY:
          serviceImpl.updateSshPublicKey(
              (com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class OsLoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OsLoginServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.oslogin.v1.OsLoginProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OsLoginService");
    }
  }

  private static final class OsLoginServiceFileDescriptorSupplier
      extends OsLoginServiceBaseDescriptorSupplier {
    OsLoginServiceFileDescriptorSupplier() {}
  }

  private static final class OsLoginServiceMethodDescriptorSupplier
      extends OsLoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OsLoginServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OsLoginServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new OsLoginServiceFileDescriptorSupplier())
                      .addMethod(getDeletePosixAccountMethod())
                      .addMethod(getDeleteSshPublicKeyMethod())
                      .addMethod(getGetLoginProfileMethod())
                      .addMethod(getGetSshPublicKeyMethod())
                      .addMethod(getImportSshPublicKeyMethod())
                      .addMethod(getUpdateSshPublicKeyMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
