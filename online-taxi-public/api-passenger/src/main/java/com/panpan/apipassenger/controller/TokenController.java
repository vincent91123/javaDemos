package com.panpan.apipassenger.controller;

import com.panpan.apipassenger.service.TokenService;
import com.panpan.internalcommon.dto.ResponseResult;
import com.panpan.internalcommon.response.TokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panpan
 * @create 2024-10-08-下午 03:29
 */
@RestController
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @PostMapping("/token-refresh")
    public ResponseResult refreshToken(@RequestBody TokenResponse tokenResponse){

        String refreshTokenSrc = tokenResponse.getRefreshToken();
        System.out.println("原来的 refreshToken："+refreshTokenSrc);

        return tokenService.refreshToken(refreshTokenSrc);

    }

}
