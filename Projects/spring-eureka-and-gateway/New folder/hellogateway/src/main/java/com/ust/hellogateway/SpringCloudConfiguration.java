package com.ust.hellogateway;


;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfiguration {

    /*@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes().route("invoiceModule", r->r.path("/rest/services/**").uri("lb://localhost:8071")).build();
    }*/

}
