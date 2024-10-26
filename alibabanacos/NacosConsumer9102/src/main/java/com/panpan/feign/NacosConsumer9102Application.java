package com.panpan.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.panpan.feign.config")
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConsumer9102Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer9102Application.class, args);
    }

}
