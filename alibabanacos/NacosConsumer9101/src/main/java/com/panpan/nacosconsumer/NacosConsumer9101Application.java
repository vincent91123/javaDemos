package com.panpan.nacosconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConsumer9101Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer9101Application.class, args);
    }


    @Autowired
    //RestTemplateBuilder
    private RestTemplateBuilder builder;
    // 使用RestTemplateBuilder来实例化RestTemplate对象，spring默认已经注入了RestTemplateBuilder实例
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
//        return builder.build();
    }
}
