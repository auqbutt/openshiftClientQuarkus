package ecommerce;

import io.quarkus.grpc.GrpcClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class GreetingResourceNative {

    @GrpcClient("product")
    ProductInfoGrpc.ProductInfoBlockingStub blockingService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testHello() {

        ProductInfoOuterClass.ProductID productID = blockingService.addProduct(
                ProductInfoOuterClass.Product.newBuilder()
                        .setName("Samsung S10")
                        .setDescription("Samsung Galaxy S10 is the latest smart phone, " +
                                "launched in February 2019")
                        .setPrice(700.0f)
                        .build());

        ProductInfoOuterClass.Product product = blockingService.getProduct(productID);
        return "Product ID: " + productID.getValue() + " added successfully. Product: " + product.toString();
    }

}
