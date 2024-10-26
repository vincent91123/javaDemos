package com.panpan.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author panpan
 * @create 2024-10-25-上午 10:12
 */

@RestController
public class UserController {
    @Value("${service-url.nacos-user-service}")
    private String serviceUrl;

    @Autowired
    private RestTemplate  restTemplate;

    @GetMapping("/consumer")
    public String consumer(){
        System.out.println("---------------hell0,consumer接口执行了---------------- ");
        return restTemplate.getForObject(serviceUrl+"/hello",String.class);
    }
}
