package com.panpan.serviceverificationcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panpan
 * @create 2024-09-27-下午 04:05
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "service-verificationCode";
    }
}
