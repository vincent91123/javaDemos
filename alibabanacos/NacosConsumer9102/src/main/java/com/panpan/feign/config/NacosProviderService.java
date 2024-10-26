package com.panpan.feign.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author panpan
 * @create 2024-10-25-上午 10:52
 */
@FeignClient("nacos-provider")
public interface NacosProviderService {

    @GetMapping("/hello")
    public String hello();
}
