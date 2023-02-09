package com.demo.grpc.manager;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: Manager.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ManagerServiceGrpc {

  private ManagerServiceGrpc() {}

  public static final String SERVICE_NAME = "ManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.demo.grpc.manager.UseDatumDtoGrpc,
      com.google.protobuf.Empty> getUseDatumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UseDatum",
      requestType = com.demo.grpc.manager.UseDatumDtoGrpc.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demo.grpc.manager.UseDatumDtoGrpc,
      com.google.protobuf.Empty> getUseDatumMethod() {
    io.grpc.MethodDescriptor<com.demo.grpc.manager.UseDatumDtoGrpc, com.google.protobuf.Empty> getUseDatumMethod;
    if ((getUseDatumMethod = ManagerServiceGrpc.getUseDatumMethod) == null) {
      synchronized (ManagerServiceGrpc.class) {
        if ((getUseDatumMethod = ManagerServiceGrpc.getUseDatumMethod) == null) {
          ManagerServiceGrpc.getUseDatumMethod = getUseDatumMethod =
              io.grpc.MethodDescriptor.<com.demo.grpc.manager.UseDatumDtoGrpc, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UseDatum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.grpc.manager.UseDatumDtoGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ManagerServiceMethodDescriptorSupplier("UseDatum"))
              .build();
        }
      }
    }
    return getUseDatumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManagerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagerServiceStub>() {
        @java.lang.Override
        public ManagerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagerServiceStub(channel, callOptions);
        }
      };
    return ManagerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagerServiceBlockingStub>() {
        @java.lang.Override
        public ManagerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagerServiceBlockingStub(channel, callOptions);
        }
      };
    return ManagerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagerServiceFutureStub>() {
        @java.lang.Override
        public ManagerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagerServiceFutureStub(channel, callOptions);
        }
      };
    return ManagerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ManagerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * gnss数据解析
     * </pre>
     */
    public void useDatum(com.demo.grpc.manager.UseDatumDtoGrpc request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUseDatumMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUseDatumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.demo.grpc.manager.UseDatumDtoGrpc,
                com.google.protobuf.Empty>(
                  this, METHODID_USE_DATUM)))
          .build();
    }
  }

  /**
   */
  public static final class ManagerServiceStub extends io.grpc.stub.AbstractAsyncStub<ManagerServiceStub> {
    private ManagerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * gnss数据解析
     * </pre>
     */
    public void useDatum(com.demo.grpc.manager.UseDatumDtoGrpc request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUseDatumMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ManagerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ManagerServiceBlockingStub> {
    private ManagerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * gnss数据解析
     * </pre>
     */
    public com.google.protobuf.Empty useDatum(com.demo.grpc.manager.UseDatumDtoGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUseDatumMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ManagerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ManagerServiceFutureStub> {
    private ManagerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * gnss数据解析
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> useDatum(
        com.demo.grpc.manager.UseDatumDtoGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUseDatumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USE_DATUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ManagerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ManagerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USE_DATUM:
          serviceImpl.useDatum((com.demo.grpc.manager.UseDatumDtoGrpc) request,
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

  private static abstract class ManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.demo.grpc.manager.ManagerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ManagerService");
    }
  }

  private static final class ManagerServiceFileDescriptorSupplier
      extends ManagerServiceBaseDescriptorSupplier {
    ManagerServiceFileDescriptorSupplier() {}
  }

  private static final class ManagerServiceMethodDescriptorSupplier
      extends ManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ManagerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManagerServiceFileDescriptorSupplier())
              .addMethod(getUseDatumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
