package com.panpan.feign.controller;

import com.panpan.feign.config.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panpan
 * @create 2024-10-25-上午 10:54
 */
@RestController
public class UserController {
    @Autowired
    private NacosProviderService providerService;

    @GetMapping("/helloOpenFeign")
    public String helloOpenFeign(){
        return providerService.hello();
    }
}
