package com.panpan.apipassenger.controller;

import com.panpan.apipassenger.service.VerificationCodeService;
import com.panpan.servicepassengeruser.request.VerificationCodeDTO;
import com.panpan.internalcommon.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author panpan
 * @create 2024-09-27-上午 11:32
 */
@RestController
public class VerificationCodeController {

    @Autowired
    private VerificationCodeService verificationCodeService;

    @PostMapping("/verification-code")
    public ResponseResult verificationCode(@RequestBody VerificationCodeDTO verificationCodeDTO){

        String passengerPhone = verificationCodeDTO.getPassengerPhone();
        return verificationCodeService.generatorCode(passengerPhone);

    }

    @PostMapping("/verification-code-check")
    public ResponseResult checkVerificationCode(@RequestBody VerificationCodeDTO verificationCodeDTO){

        String passengerPhone = verificationCodeDTO.getPassengerPhone();
        String verificationCode = verificationCodeDTO.getVerificationCode();

        System.out.println("手机号"+passengerPhone+",验证码："+verificationCode);

        return verificationCodeService.checkCode(passengerPhone,verificationCode);
    }



}
