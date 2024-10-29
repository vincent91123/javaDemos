package com.boge.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.boge.order.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class OrderService8801Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderService8801Application.class, args);
    }

}
