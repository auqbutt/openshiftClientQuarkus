package ecommerce;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.runtime.MutinyBean;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: product_info.proto")
public class ProductInfoBean extends MutinyProductInfoGrpc.ProductInfoImplBase implements BindableService, MutinyBean {

    private final ProductInfo delegate;

    ProductInfoBean(@GrpcService ProductInfo delegate) {
       this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<ecommerce.ProductInfoOuterClass.ProductID> addProduct(ecommerce.ProductInfoOuterClass.Product request) {
       try {
         return delegate.addProduct(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<ecommerce.ProductInfoOuterClass.Product> getProduct(ecommerce.ProductInfoOuterClass.ProductID request) {
       try {
         return delegate.getProduct(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

}