package com.springcloud.eureka.client.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id) {
        return "Product " + id + " info!!!!!! From port : " + serverPort;
    }
}