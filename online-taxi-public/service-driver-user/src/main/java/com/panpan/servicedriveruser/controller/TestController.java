package com.panpan.servicedriveruser.controller;

import com.panpan.internalcommon.dto.ResponseResult;
import com.panpan.servicedriveruser.service.DriverUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panpan
 * @create 2024-09-27-上午 11:27
 */
@RestController
public class TestController {

    @Autowired
    private DriverUserService driverUserService;

    @GetMapping("/test")
    public String test(){
        return "test api passenger";
    }


    @GetMapping("/test-db")
    public ResponseResult testDb(){
        return driverUserService.testGetDriverUser();
    }



}
