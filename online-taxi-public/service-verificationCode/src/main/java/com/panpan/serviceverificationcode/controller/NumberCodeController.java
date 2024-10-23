package com.panpan.serviceverificationcode.controller;

import com.panpan.apipassenger.service.VerificationCodeService;
import com.panpan.internalcommon.dto.ResponseResult;
import com.panpan.internalcommon.response.NumberCodeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author panpan
 * @create 2024-09-27-下午 04:36
 */
@RestController
public class NumberCodeController {
    @Autowired
    private VerificationCodeService verificationCodeService;

    @GetMapping("/numberCode/{size}")
    public ResponseResult numberCode(@PathVariable("size") int size){

        System.out.println("size:"+size);
        double mathRandom = (Math.random()*9 + 1) * (Math.pow(10,size-1));
        System.out.println(mathRandom);
        int resultInt = (int)mathRandom;
        System.out.println("generator src code:"+resultInt);

        // 定义返回值
        NumberCodeResponse response = new NumberCodeResponse();
        response.setNumberCode(resultInt);

        return ResponseResult.success(response);//result.toString();
    }



    

}



/*    JSONObject result=new JSONObject();
        result.put("code",1);
        result.put("message","success");
        JSONObject data=new JSONObject();
        data.put("numberCode","123456");
        result.put("data",data);    */

/*// 生成验证码
        double mathRandom = (Math.random()*9 + 1) * (Math.pow(10,size-1));
        System.out.println(mathRandom);
        int resultInt = (int)mathRandom;
        System.out.println("generator src code:"+resultInt);

        */