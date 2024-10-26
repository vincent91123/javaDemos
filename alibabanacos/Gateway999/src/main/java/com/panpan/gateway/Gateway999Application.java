package com.panpan.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Gateway999Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway999Application.class, args);
    }

}
