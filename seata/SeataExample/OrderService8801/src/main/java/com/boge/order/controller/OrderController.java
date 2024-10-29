package com.boge.order.controller;

import com.boge.order.entity.OrderEntity;
import com.boge.order.feign.StockService;
import com.boge.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private StockService stockService;

    @ResponseBody
    @GetMapping("/createOrder")
    public String createOrder(){
        return orderService.create();
    }
}
