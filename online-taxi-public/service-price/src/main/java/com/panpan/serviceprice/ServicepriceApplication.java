package com.panpan.serviceprice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.panpan.serviceprice.mapper")
public class ServicepriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicepriceApplication.class, args);
    }

}
