package com.demo.grpc.gnss;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: Gnss.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GnssServiceGrpc {

  private GnssServiceGrpc() {}

  public static final String SERVICE_NAME = "GnssService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.demo.grpc.gnss.GeodeticCoordHDtoGrpc,
      com.demo.grpc.gnss.SpatialCoordDtoGrpc> getGeo2cartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Geo2cart",
      requestType = com.demo.grpc.gnss.GeodeticCoordHDtoGrpc.class,
      responseType = com.demo.grpc.gnss.SpatialCoordDtoGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demo.grpc.gnss.GeodeticCoordHDtoGrpc,
      com.demo.grpc.gnss.SpatialCoordDtoGrpc> getGeo2cartMethod() {
    io.grpc.MethodDescriptor<com.demo.grpc.gnss.GeodeticCoordHDtoGrpc, com.demo.grpc.gnss.SpatialCoordDtoGrpc> getGeo2cartMethod;
    if ((getGeo2cartMethod = GnssServiceGrpc.getGeo2cartMethod) == null) {
      synchronized (GnssServiceGrpc.class) {
        if ((getGeo2cartMethod = GnssServiceGrpc.getGeo2cartMethod) == null) {
          GnssServiceGrpc.getGeo2cartMethod = getGeo2cartMethod =
              io.grpc.MethodDescriptor.<com.demo.grpc.gnss.GeodeticCoordHDtoGrpc, com.demo.grpc.gnss.SpatialCoordDtoGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Geo2cart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.grpc.gnss.GeodeticCoordHDtoGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.grpc.gnss.SpatialCoordDtoGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new GnssServiceMethodDescriptorSupplier("Geo2cart"))
              .build();
        }
      }
    }
    return getGeo2cartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GnssServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GnssServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GnssServiceStub>() {
        @java.lang.Override
        public GnssServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GnssServiceStub(channel, callOptions);
        }
      };
    return GnssServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GnssServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GnssServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GnssServiceBlockingStub>() {
        @java.lang.Override
        public GnssServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GnssServiceBlockingStub(channel, callOptions);
        }
      };
    return GnssServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GnssServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GnssServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GnssServiceFutureStub>() {
        @java.lang.Override
        public GnssServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GnssServiceFutureStub(channel, callOptions);
        }
      };
    return GnssServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GnssServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * gnss数据解析
     * </pre>
     */
    public void geo2cart(com.demo.grpc.gnss.GeodeticCoordHDtoGrpc request,
        io.grpc.stub.StreamObserver<com.demo.grpc.gnss.SpatialCoordDtoGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGeo2cartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGeo2cartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.demo.grpc.gnss.GeodeticCoordHDtoGrpc,
                com.demo.grpc.gnss.SpatialCoordDtoGrpc>(
                  this, METHODID_GEO2CART)))
          .build();
    }
  }

  /**
   */
  public static final class GnssServiceStub extends io.grpc.stub.AbstractAsyncStub<GnssServiceStub> {
    private GnssServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GnssServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GnssServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * gnss数据解析
     * </pre>
     */
    public void geo2cart(com.demo.grpc.gnss.GeodeticCoordHDtoGrpc request,
        io.grpc.stub.StreamObserver<com.demo.grpc.gnss.SpatialCoordDtoGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGeo2cartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GnssServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GnssServiceBlockingStub> {
    private GnssServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GnssServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GnssServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * gnss数据解析
     * </pre>
     */
    public com.demo.grpc.gnss.SpatialCoordDtoGrpc geo2cart(com.demo.grpc.gnss.GeodeticCoordHDtoGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGeo2cartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GnssServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GnssServiceFutureStub> {
    private GnssServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GnssServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GnssServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * gnss数据解析
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demo.grpc.gnss.SpatialCoordDtoGrpc> geo2cart(
        com.demo.grpc.gnss.GeodeticCoordHDtoGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGeo2cartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GEO2CART = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GnssServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GnssServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GEO2CART:
          serviceImpl.geo2cart((com.demo.grpc.gnss.GeodeticCoordHDtoGrpc) request,
              (io.grpc.stub.StreamObserver<com.demo.grpc.gnss.SpatialCoordDtoGrpc>) responseObserver);
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

  private static abstract class GnssServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GnssServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.demo.grpc.gnss.GnssProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GnssService");
    }
  }

  private static final class GnssServiceFileDescriptorSupplier
      extends GnssServiceBaseDescriptorSupplier {
    GnssServiceFileDescriptorSupplier() {}
  }

  private static final class GnssServiceMethodDescriptorSupplier
      extends GnssServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GnssServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GnssServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GnssServiceFileDescriptorSupplier())
              .addMethod(getGeo2cartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
