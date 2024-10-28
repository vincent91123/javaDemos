package com.panpan.nacosprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panpan
 * @create 2024-10-25-上午 10:16
 */
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("-----------hello,Nacos provider run-----------");
        return "hello panpan,9002";
    }
}
