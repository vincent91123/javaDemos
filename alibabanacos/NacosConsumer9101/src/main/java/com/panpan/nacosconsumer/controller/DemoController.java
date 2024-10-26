package com.panpan.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panpan
 * @create 2024-10-25-上午 09:44
 */
@RestController
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/panpan")
    public String getServerPort(){
        return "Hello Nacos Discovery"+serverPort;
    }
}
