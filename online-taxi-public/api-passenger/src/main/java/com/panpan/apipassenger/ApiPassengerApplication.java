package com.panpan.apipassenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author panpan
 * @create 2024-09-27-上午 11:22
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ApiPassengerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiPassengerApplication.class);
    }
}
