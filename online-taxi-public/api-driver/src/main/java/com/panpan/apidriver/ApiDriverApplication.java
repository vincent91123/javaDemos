package com.panpan.apidriver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ApiDriverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiDriverApplication.class, args);
    }

    @GetMapping("/test")
    public  String testDriver(){
        return "testDriver";
    }
}
