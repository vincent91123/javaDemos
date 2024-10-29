package com.boge.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("stock-service")
public interface StockService {
    @GetMapping("/query")
    public String query();

    @GetMapping("/decrement")
    public void decrement();
}
