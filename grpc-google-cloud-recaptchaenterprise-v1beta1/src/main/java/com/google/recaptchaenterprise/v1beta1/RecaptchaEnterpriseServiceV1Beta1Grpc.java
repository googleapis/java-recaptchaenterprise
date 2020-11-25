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
package com.google.recaptchaenterprise.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/recaptchaenterprise/v1beta1/recaptchaenterprise.proto")
public final class RecaptchaEnterpriseServiceV1Beta1Grpc {

  private RecaptchaEnterpriseServiceV1Beta1Grpc() {}

  public static final String SERVICE_NAME =
      "google.cloud.recaptchaenterprise.v1beta1.RecaptchaEnterpriseServiceV1Beta1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest,
          com.google.recaptchaenterprise.v1beta1.Assessment>
      getCreateAssessmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAssessment",
      requestType = com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest.class,
      responseType = com.google.recaptchaenterprise.v1beta1.Assessment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest,
          com.google.recaptchaenterprise.v1beta1.Assessment>
      getCreateAssessmentMethod() {
    io.grpc.MethodDescriptor<
            com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest,
            com.google.recaptchaenterprise.v1beta1.Assessment>
        getCreateAssessmentMethod;
    if ((getCreateAssessmentMethod =
            RecaptchaEnterpriseServiceV1Beta1Grpc.getCreateAssessmentMethod)
        == null) {
      synchronized (RecaptchaEnterpriseServiceV1Beta1Grpc.class) {
        if ((getCreateAssessmentMethod =
                RecaptchaEnterpriseServiceV1Beta1Grpc.getCreateAssessmentMethod)
            == null) {
          RecaptchaEnterpriseServiceV1Beta1Grpc.getCreateAssessmentMethod =
              getCreateAssessmentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest,
                          com.google.recaptchaenterprise.v1beta1.Assessment>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAssessment"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.Assessment
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new RecaptchaEnterpriseServiceV1Beta1MethodDescriptorSupplier(
                              "CreateAssessment"))
                      .build();
        }
      }
    }
    return getCreateAssessmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest,
          com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>
      getAnnotateAssessmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnnotateAssessment",
      requestType = com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.class,
      responseType = com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest,
          com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>
      getAnnotateAssessmentMethod() {
    io.grpc.MethodDescriptor<
            com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest,
            com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>
        getAnnotateAssessmentMethod;
    if ((getAnnotateAssessmentMethod =
            RecaptchaEnterpriseServiceV1Beta1Grpc.getAnnotateAssessmentMethod)
        == null) {
      synchronized (RecaptchaEnterpriseServiceV1Beta1Grpc.class) {
        if ((getAnnotateAssessmentMethod =
                RecaptchaEnterpriseServiceV1Beta1Grpc.getAnnotateAssessmentMethod)
            == null) {
          RecaptchaEnterpriseServiceV1Beta1Grpc.getAnnotateAssessmentMethod =
              getAnnotateAssessmentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest,
                          com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnnotateAssessment"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new RecaptchaEnterpriseServiceV1Beta1MethodDescriptorSupplier(
                              "AnnotateAssessment"))
                      .build();
        }
      }
    }
    return getAnnotateAssessmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.CreateKeyRequest,
          com.google.recaptchaenterprise.v1beta1.Key>
      getCreateKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateKey",
      requestType = com.google.recaptchaenterprise.v1beta1.CreateKeyRequest.class,
      responseType = com.google.recaptchaenterprise.v1beta1.Key.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.CreateKeyRequest,
          com.google.recaptchaenterprise.v1beta1.Key>
      getCreateKeyMethod() {
    io.grpc.MethodDescriptor<
            com.google.recaptchaenterprise.v1beta1.CreateKeyRequest,
            com.google.recaptchaenterprise.v1beta1.Key>
        getCreateKeyMethod;
    if ((getCreateKeyMethod = RecaptchaEnterpriseServiceV1Beta1Grpc.getCreateKeyMethod) == null) {
      synchronized (RecaptchaEnterpriseServiceV1Beta1Grpc.class) {
        if ((getCreateKeyMethod = RecaptchaEnterpriseServiceV1Beta1Grpc.getCreateKeyMethod)
            == null) {
          RecaptchaEnterpriseServiceV1Beta1Grpc.getCreateKeyMethod =
              getCreateKeyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.recaptchaenterprise.v1beta1.CreateKeyRequest,
                          com.google.recaptchaenterprise.v1beta1.Key>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateKey"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.CreateKeyRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.Key.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new RecaptchaEnterpriseServiceV1Beta1MethodDescriptorSupplier(
                              "CreateKey"))
                      .build();
        }
      }
    }
    return getCreateKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.ListKeysRequest,
          com.google.recaptchaenterprise.v1beta1.ListKeysResponse>
      getListKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListKeys",
      requestType = com.google.recaptchaenterprise.v1beta1.ListKeysRequest.class,
      responseType = com.google.recaptchaenterprise.v1beta1.ListKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.ListKeysRequest,
          com.google.recaptchaenterprise.v1beta1.ListKeysResponse>
      getListKeysMethod() {
    io.grpc.MethodDescriptor<
            com.google.recaptchaenterprise.v1beta1.ListKeysRequest,
            com.google.recaptchaenterprise.v1beta1.ListKeysResponse>
        getListKeysMethod;
    if ((getListKeysMethod = RecaptchaEnterpriseServiceV1Beta1Grpc.getListKeysMethod) == null) {
      synchronized (RecaptchaEnterpriseServiceV1Beta1Grpc.class) {
        if ((getListKeysMethod = RecaptchaEnterpriseServiceV1Beta1Grpc.getListKeysMethod) == null) {
          RecaptchaEnterpriseServiceV1Beta1Grpc.getListKeysMethod =
              getListKeysMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.recaptchaenterprise.v1beta1.ListKeysRequest,
                          com.google.recaptchaenterprise.v1beta1.ListKeysResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListKeys"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.ListKeysRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.ListKeysResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new RecaptchaEnterpriseServiceV1Beta1MethodDescriptorSupplier("ListKeys"))
                      .build();
        }
      }
    }
    return getListKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.GetKeyRequest,
          com.google.recaptchaenterprise.v1beta1.Key>
      getGetKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKey",
      requestType = com.google.recaptchaenterprise.v1beta1.GetKeyRequest.class,
      responseType = com.google.recaptchaenterprise.v1beta1.Key.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.GetKeyRequest,
          com.google.recaptchaenterprise.v1beta1.Key>
      getGetKeyMethod() {
    io.grpc.MethodDescriptor<
            com.google.recaptchaenterprise.v1beta1.GetKeyRequest,
            com.google.recaptchaenterprise.v1beta1.Key>
        getGetKeyMethod;
    if ((getGetKeyMethod = RecaptchaEnterpriseServiceV1Beta1Grpc.getGetKeyMethod) == null) {
      synchronized (RecaptchaEnterpriseServiceV1Beta1Grpc.class) {
        if ((getGetKeyMethod = RecaptchaEnterpriseServiceV1Beta1Grpc.getGetKeyMethod) == null) {
          RecaptchaEnterpriseServiceV1Beta1Grpc.getGetKeyMethod =
              getGetKeyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.recaptchaenterprise.v1beta1.GetKeyRequest,
                          com.google.recaptchaenterprise.v1beta1.Key>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKey"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.GetKeyRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.Key.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new RecaptchaEnterpriseServiceV1Beta1MethodDescriptorSupplier("GetKey"))
                      .build();
        }
      }
    }
    return getGetKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.UpdateKeyRequest,
          com.google.recaptchaenterprise.v1beta1.Key>
      getUpdateKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateKey",
      requestType = com.google.recaptchaenterprise.v1beta1.UpdateKeyRequest.class,
      responseType = com.google.recaptchaenterprise.v1beta1.Key.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.UpdateKeyRequest,
          com.google.recaptchaenterprise.v1beta1.Key>
      getUpdateKeyMethod() {
    io.grpc.MethodDescriptor<
            com.google.recaptchaenterprise.v1beta1.UpdateKeyRequest,
            com.google.recaptchaenterprise.v1beta1.Key>
        getUpdateKeyMethod;
    if ((getUpdateKeyMethod = RecaptchaEnterpriseServiceV1Beta1Grpc.getUpdateKeyMethod) == null) {
      synchronized (RecaptchaEnterpriseServiceV1Beta1Grpc.class) {
        if ((getUpdateKeyMethod = RecaptchaEnterpriseServiceV1Beta1Grpc.getUpdateKeyMethod)
            == null) {
          RecaptchaEnterpriseServiceV1Beta1Grpc.getUpdateKeyMethod =
              getUpdateKeyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.recaptchaenterprise.v1beta1.UpdateKeyRequest,
                          com.google.recaptchaenterprise.v1beta1.Key>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateKey"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.UpdateKeyRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.Key.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new RecaptchaEnterpriseServiceV1Beta1MethodDescriptorSupplier(
                              "UpdateKey"))
                      .build();
        }
      }
    }
    return getUpdateKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.DeleteKeyRequest, com.google.protobuf.Empty>
      getDeleteKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteKey",
      requestType = com.google.recaptchaenterprise.v1beta1.DeleteKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.recaptchaenterprise.v1beta1.DeleteKeyRequest, com.google.protobuf.Empty>
      getDeleteKeyMethod() {
    io.grpc.MethodDescriptor<
            com.google.recaptchaenterprise.v1beta1.DeleteKeyRequest, com.google.protobuf.Empty>
        getDeleteKeyMethod;
    if ((getDeleteKeyMethod = RecaptchaEnterpriseServiceV1Beta1Grpc.getDeleteKeyMethod) == null) {
      synchronized (RecaptchaEnterpriseServiceV1Beta1Grpc.class) {
        if ((getDeleteKeyMethod = RecaptchaEnterpriseServiceV1Beta1Grpc.getDeleteKeyMethod)
            == null) {
          RecaptchaEnterpriseServiceV1Beta1Grpc.getDeleteKeyMethod =
              getDeleteKeyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.recaptchaenterprise.v1beta1.DeleteKeyRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteKey"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.recaptchaenterprise.v1beta1.DeleteKeyRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new RecaptchaEnterpriseServiceV1Beta1MethodDescriptorSupplier(
                              "DeleteKey"))
                      .build();
        }
      }
    }
    return getDeleteKeyMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static RecaptchaEnterpriseServiceV1Beta1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecaptchaEnterpriseServiceV1Beta1Stub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<RecaptchaEnterpriseServiceV1Beta1Stub>() {
          @java.lang.Override
          public RecaptchaEnterpriseServiceV1Beta1Stub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new RecaptchaEnterpriseServiceV1Beta1Stub(channel, callOptions);
          }
        };
    return RecaptchaEnterpriseServiceV1Beta1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecaptchaEnterpriseServiceV1Beta1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecaptchaEnterpriseServiceV1Beta1BlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<RecaptchaEnterpriseServiceV1Beta1BlockingStub>() {
          @java.lang.Override
          public RecaptchaEnterpriseServiceV1Beta1BlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new RecaptchaEnterpriseServiceV1Beta1BlockingStub(channel, callOptions);
          }
        };
    return RecaptchaEnterpriseServiceV1Beta1BlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static RecaptchaEnterpriseServiceV1Beta1FutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecaptchaEnterpriseServiceV1Beta1FutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<RecaptchaEnterpriseServiceV1Beta1FutureStub>() {
          @java.lang.Override
          public RecaptchaEnterpriseServiceV1Beta1FutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new RecaptchaEnterpriseServiceV1Beta1FutureStub(channel, callOptions);
          }
        };
    return RecaptchaEnterpriseServiceV1Beta1FutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class RecaptchaEnterpriseServiceV1Beta1ImplBase
      implements io.grpc.BindableService {

    /** */
    public void createAssessment(
        com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest request,
        io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.Assessment>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAssessmentMethod(), responseObserver);
    }

    /** */
    public void annotateAssessment(
        com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest request,
        io.grpc.stub.StreamObserver<
                com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getAnnotateAssessmentMethod(), responseObserver);
    }

    /** */
    public void createKey(
        com.google.recaptchaenterprise.v1beta1.CreateKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.Key> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateKeyMethod(), responseObserver);
    }

    /** */
    public void listKeys(
        com.google.recaptchaenterprise.v1beta1.ListKeysRequest request,
        io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.ListKeysResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListKeysMethod(), responseObserver);
    }

    /** */
    public void getKey(
        com.google.recaptchaenterprise.v1beta1.GetKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.Key> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKeyMethod(), responseObserver);
    }

    /** */
    public void updateKey(
        com.google.recaptchaenterprise.v1beta1.UpdateKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.Key> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateKeyMethod(), responseObserver);
    }

    /** */
    public void deleteKey(
        com.google.recaptchaenterprise.v1beta1.DeleteKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteKeyMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateAssessmentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest,
                      com.google.recaptchaenterprise.v1beta1.Assessment>(
                      this, METHODID_CREATE_ASSESSMENT)))
          .addMethod(
              getAnnotateAssessmentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest,
                      com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>(
                      this, METHODID_ANNOTATE_ASSESSMENT)))
          .addMethod(
              getCreateKeyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.recaptchaenterprise.v1beta1.CreateKeyRequest,
                      com.google.recaptchaenterprise.v1beta1.Key>(this, METHODID_CREATE_KEY)))
          .addMethod(
              getListKeysMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.recaptchaenterprise.v1beta1.ListKeysRequest,
                      com.google.recaptchaenterprise.v1beta1.ListKeysResponse>(
                      this, METHODID_LIST_KEYS)))
          .addMethod(
              getGetKeyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.recaptchaenterprise.v1beta1.GetKeyRequest,
                      com.google.recaptchaenterprise.v1beta1.Key>(this, METHODID_GET_KEY)))
          .addMethod(
              getUpdateKeyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.recaptchaenterprise.v1beta1.UpdateKeyRequest,
                      com.google.recaptchaenterprise.v1beta1.Key>(this, METHODID_UPDATE_KEY)))
          .addMethod(
              getDeleteKeyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.recaptchaenterprise.v1beta1.DeleteKeyRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_KEY)))
          .build();
    }
  }

  /** */
  public static final class RecaptchaEnterpriseServiceV1Beta1Stub
      extends io.grpc.stub.AbstractAsyncStub<RecaptchaEnterpriseServiceV1Beta1Stub> {
    private RecaptchaEnterpriseServiceV1Beta1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecaptchaEnterpriseServiceV1Beta1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecaptchaEnterpriseServiceV1Beta1Stub(channel, callOptions);
    }

    /** */
    public void createAssessment(
        com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest request,
        io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.Assessment>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAssessmentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void annotateAssessment(
        com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest request,
        io.grpc.stub.StreamObserver<
                com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAnnotateAssessmentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createKey(
        com.google.recaptchaenterprise.v1beta1.CreateKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.Key> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void listKeys(
        com.google.recaptchaenterprise.v1beta1.ListKeysRequest request,
        io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.ListKeysResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void getKey(
        com.google.recaptchaenterprise.v1beta1.GetKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.Key> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void updateKey(
        com.google.recaptchaenterprise.v1beta1.UpdateKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.Key> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void deleteKey(
        com.google.recaptchaenterprise.v1beta1.DeleteKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /** */
  public static final class RecaptchaEnterpriseServiceV1Beta1BlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RecaptchaEnterpriseServiceV1Beta1BlockingStub> {
    private RecaptchaEnterpriseServiceV1Beta1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecaptchaEnterpriseServiceV1Beta1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecaptchaEnterpriseServiceV1Beta1BlockingStub(channel, callOptions);
    }

    /** */
    public com.google.recaptchaenterprise.v1beta1.Assessment createAssessment(
        com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAssessmentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse annotateAssessment(
        com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getAnnotateAssessmentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.recaptchaenterprise.v1beta1.Key createKey(
        com.google.recaptchaenterprise.v1beta1.CreateKeyRequest request) {
      return blockingUnaryCall(getChannel(), getCreateKeyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.recaptchaenterprise.v1beta1.ListKeysResponse listKeys(
        com.google.recaptchaenterprise.v1beta1.ListKeysRequest request) {
      return blockingUnaryCall(getChannel(), getListKeysMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.recaptchaenterprise.v1beta1.Key getKey(
        com.google.recaptchaenterprise.v1beta1.GetKeyRequest request) {
      return blockingUnaryCall(getChannel(), getGetKeyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.recaptchaenterprise.v1beta1.Key updateKey(
        com.google.recaptchaenterprise.v1beta1.UpdateKeyRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateKeyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty deleteKey(
        com.google.recaptchaenterprise.v1beta1.DeleteKeyRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteKeyMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class RecaptchaEnterpriseServiceV1Beta1FutureStub
      extends io.grpc.stub.AbstractFutureStub<RecaptchaEnterpriseServiceV1Beta1FutureStub> {
    private RecaptchaEnterpriseServiceV1Beta1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecaptchaEnterpriseServiceV1Beta1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecaptchaEnterpriseServiceV1Beta1FutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.recaptchaenterprise.v1beta1.Assessment>
        createAssessment(com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAssessmentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>
        annotateAssessment(
            com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAnnotateAssessmentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.recaptchaenterprise.v1beta1.Key>
        createKey(com.google.recaptchaenterprise.v1beta1.CreateKeyRequest request) {
      return futureUnaryCall(getChannel().newCall(getCreateKeyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.recaptchaenterprise.v1beta1.ListKeysResponse>
        listKeys(com.google.recaptchaenterprise.v1beta1.ListKeysRequest request) {
      return futureUnaryCall(getChannel().newCall(getListKeysMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.recaptchaenterprise.v1beta1.Key>
        getKey(com.google.recaptchaenterprise.v1beta1.GetKeyRequest request) {
      return futureUnaryCall(getChannel().newCall(getGetKeyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.recaptchaenterprise.v1beta1.Key>
        updateKey(com.google.recaptchaenterprise.v1beta1.UpdateKeyRequest request) {
      return futureUnaryCall(getChannel().newCall(getUpdateKeyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteKey(
        com.google.recaptchaenterprise.v1beta1.DeleteKeyRequest request) {
      return futureUnaryCall(getChannel().newCall(getDeleteKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ASSESSMENT = 0;
  private static final int METHODID_ANNOTATE_ASSESSMENT = 1;
  private static final int METHODID_CREATE_KEY = 2;
  private static final int METHODID_LIST_KEYS = 3;
  private static final int METHODID_GET_KEY = 4;
  private static final int METHODID_UPDATE_KEY = 5;
  private static final int METHODID_DELETE_KEY = 6;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecaptchaEnterpriseServiceV1Beta1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecaptchaEnterpriseServiceV1Beta1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ASSESSMENT:
          serviceImpl.createAssessment(
              (com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.Assessment>)
                  responseObserver);
          break;
        case METHODID_ANNOTATE_ASSESSMENT:
          serviceImpl.annotateAssessment(
              (com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>)
                  responseObserver);
          break;
        case METHODID_CREATE_KEY:
          serviceImpl.createKey(
              (com.google.recaptchaenterprise.v1beta1.CreateKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.Key>)
                  responseObserver);
          break;
        case METHODID_LIST_KEYS:
          serviceImpl.listKeys(
              (com.google.recaptchaenterprise.v1beta1.ListKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.ListKeysResponse>)
                  responseObserver);
          break;
        case METHODID_GET_KEY:
          serviceImpl.getKey(
              (com.google.recaptchaenterprise.v1beta1.GetKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.Key>)
                  responseObserver);
          break;
        case METHODID_UPDATE_KEY:
          serviceImpl.updateKey(
              (com.google.recaptchaenterprise.v1beta1.UpdateKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.recaptchaenterprise.v1beta1.Key>)
                  responseObserver);
          break;
        case METHODID_DELETE_KEY:
          serviceImpl.deleteKey(
              (com.google.recaptchaenterprise.v1beta1.DeleteKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private abstract static class RecaptchaEnterpriseServiceV1Beta1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecaptchaEnterpriseServiceV1Beta1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecaptchaEnterpriseServiceV1Beta1");
    }
  }

  private static final class RecaptchaEnterpriseServiceV1Beta1FileDescriptorSupplier
      extends RecaptchaEnterpriseServiceV1Beta1BaseDescriptorSupplier {
    RecaptchaEnterpriseServiceV1Beta1FileDescriptorSupplier() {}
  }

  private static final class RecaptchaEnterpriseServiceV1Beta1MethodDescriptorSupplier
      extends RecaptchaEnterpriseServiceV1Beta1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecaptchaEnterpriseServiceV1Beta1MethodDescriptorSupplier(String methodName) {
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
      synchronized (RecaptchaEnterpriseServiceV1Beta1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(
                          new RecaptchaEnterpriseServiceV1Beta1FileDescriptorSupplier())
                      .addMethod(getCreateAssessmentMethod())
                      .addMethod(getAnnotateAssessmentMethod())
                      .addMethod(getCreateKeyMethod())
                      .addMethod(getListKeysMethod())
                      .addMethod(getGetKeyMethod())
                      .addMethod(getUpdateKeyMethod())
                      .addMethod(getDeleteKeyMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
