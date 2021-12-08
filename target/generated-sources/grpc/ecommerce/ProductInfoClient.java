package ecommerce;

import java.util.function.BiFunction;

import io.quarkus.grpc.runtime.MutinyClient;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: product_info.proto")
public class ProductInfoClient implements ProductInfo, MutinyClient<MutinyProductInfoGrpc.MutinyProductInfoStub> {

    private final MutinyProductInfoGrpc.MutinyProductInfoStub stub;

    public ProductInfoClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyProductInfoGrpc.MutinyProductInfoStub, MutinyProductInfoGrpc.MutinyProductInfoStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyProductInfoGrpc.newMutinyStub(channel));
    }

    private ProductInfoClient(MutinyProductInfoGrpc.MutinyProductInfoStub stub) {
       this.stub = stub;
    }

    public ProductInfoClient newInstanceWithStub(MutinyProductInfoGrpc.MutinyProductInfoStub stub) {
        return new ProductInfoClient(stub);
    }

    @Override
    public MutinyProductInfoGrpc.MutinyProductInfoStub getStub() {
       return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<ecommerce.ProductInfoOuterClass.ProductID> addProduct(ecommerce.ProductInfoOuterClass.Product request) {
       return stub.addProduct(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<ecommerce.ProductInfoOuterClass.Product> getProduct(ecommerce.ProductInfoOuterClass.ProductID request) {
       return stub.getProduct(request);
    }

}