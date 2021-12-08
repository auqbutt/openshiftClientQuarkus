package ecommerce;

import io.quarkus.grpc.runtime.MutinyService;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: product_info.proto")
public interface ProductInfo extends MutinyService {

    
    io.smallrye.mutiny.Uni<ecommerce.ProductInfoOuterClass.ProductID> addProduct(ecommerce.ProductInfoOuterClass.Product request);
    
    io.smallrye.mutiny.Uni<ecommerce.ProductInfoOuterClass.Product> getProduct(ecommerce.ProductInfoOuterClass.ProductID request);
    
    
    

}