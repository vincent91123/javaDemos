package com.panpan.apipassenger.controller;

import com.panpan.internalcommon.dto.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panpan
 * @create 2024-09-27-上午 11:27
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test api passenger";
    }


    /*
    *
    * 需要有token的时候返回
    * */
    @GetMapping("/authTest")
    public ResponseResult authTest(){
        return ResponseResult.success("auth test");
    }

    /*
    * 没有token也能正常返回
    * */
    @GetMapping("/noauthTest")
    public ResponseResult noauthTest(){
        return ResponseResult.success("noauth test");
    }
}
