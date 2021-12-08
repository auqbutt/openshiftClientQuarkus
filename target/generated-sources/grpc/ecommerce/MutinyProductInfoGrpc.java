package ecommerce;

import static ecommerce.ProductInfoGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: product_info.proto")
public final class MutinyProductInfoGrpc implements io.quarkus.grpc.runtime.MutinyGrpc {
    private MutinyProductInfoGrpc() {}

    public static MutinyProductInfoStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyProductInfoStub(channel);
    }

    
    public static final class MutinyProductInfoStub extends io.grpc.stub.AbstractStub<MutinyProductInfoStub> implements io.quarkus.grpc.runtime.MutinyStub {
        private ProductInfoGrpc.ProductInfoStub delegateStub;

        private MutinyProductInfoStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = ProductInfoGrpc.newStub(channel);
        }

        private MutinyProductInfoStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = ProductInfoGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyProductInfoStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyProductInfoStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<ecommerce.ProductInfoOuterClass.ProductID> addProduct(ecommerce.ProductInfoOuterClass.Product request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::addProduct);
        }

        
        public io.smallrye.mutiny.Uni<ecommerce.ProductInfoOuterClass.Product> getProduct(ecommerce.ProductInfoOuterClass.ProductID request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::getProduct);
        }

    }

    
    public static abstract class ProductInfoImplBase implements io.grpc.BindableService {

        private String compression;
        /**
        * Set whether the server will try to use a compressed response.
        *
        * @param compression the compression, e.g {@code gzip}
        */
        public ProductInfoImplBase withCompression(String compression) {
        this.compression = compression;
        return this;
        }


        
        public io.smallrye.mutiny.Uni<ecommerce.ProductInfoOuterClass.ProductID> addProduct(ecommerce.ProductInfoOuterClass.Product request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<ecommerce.ProductInfoOuterClass.Product> getProduct(ecommerce.ProductInfoOuterClass.ProductID request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            ecommerce.ProductInfoGrpc.getAddProductMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            ecommerce.ProductInfoOuterClass.Product,
                                            ecommerce.ProductInfoOuterClass.ProductID>(
                                            this, METHODID_ADD_PRODUCT, compression)))
                    .addMethod(
                            ecommerce.ProductInfoGrpc.getGetProductMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            ecommerce.ProductInfoOuterClass.ProductID,
                                            ecommerce.ProductInfoOuterClass.Product>(
                                            this, METHODID_GET_PRODUCT, compression)))
                    .build();
        }
    }

    private static final int METHODID_ADD_PRODUCT = 0;
    private static final int METHODID_GET_PRODUCT = 1;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final ProductInfoImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(ProductInfoImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_ADD_PRODUCT:
                    io.quarkus.grpc.runtime.ServerCalls.oneToOne((ecommerce.ProductInfoOuterClass.Product) request,
                            (io.grpc.stub.StreamObserver<ecommerce.ProductInfoOuterClass.ProductID>) responseObserver,
                            compression,
                            serviceImpl::addProduct);
                    break;
                case METHODID_GET_PRODUCT:
                    io.quarkus.grpc.runtime.ServerCalls.oneToOne((ecommerce.ProductInfoOuterClass.ProductID) request,
                            (io.grpc.stub.StreamObserver<ecommerce.ProductInfoOuterClass.Product>) responseObserver,
                            compression,
                            serviceImpl::getProduct);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}