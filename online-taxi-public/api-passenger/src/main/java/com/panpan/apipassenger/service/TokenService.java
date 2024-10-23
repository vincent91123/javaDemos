package com.panpan.apipassenger.service;

import com.panpan.internalcommon.constant.CommonStatusEnum;
import com.panpan.internalcommon.constant.TokenConstants;
import com.panpan.internalcommon.dto.ResponseResult;
import com.panpan.internalcommon.dto.TokenResult;
import com.panpan.internalcommon.response.TokenResponse;
import com.panpan.internalcommon.utils.JwtUtils;
import com.panpan.internalcommon.utils.RedisPrefixUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.apache.commons.lang.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author panpan
 * @create 2024-10-08-下午 03:38
 */
@Service
public class TokenService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    public ResponseResult refreshToken(String refreshTokenSrc){
        // 解析 refreshToken
        TokenResult tokenResult = JwtUtils.checkToken(refreshTokenSrc);
        if (tokenResult == null){
            return ResponseResult.fail(CommonStatusEnum.TOKEN_ERROR.getCode(),CommonStatusEnum.TOKEN_ERROR.getValue());
        }
        String phone = tokenResult.getPhone();
        String identity = tokenResult.getIdentity();

        // 去读取redis中 的refreshToken
        String refreshTokenKey = RedisPrefixUtils.generatorTokenKey(phone,identity, TokenConstants.REFRESH_TOKEN_TYPE);
        String refreshTokenRedis = stringRedisTemplate.opsForValue().get(refreshTokenKey);

        // 校验refreshToken
        if ((StringUtils.isBlank(refreshTokenRedis))  || (!refreshTokenSrc.trim().equals(refreshTokenRedis.trim()))){
            return ResponseResult.fail(CommonStatusEnum.TOKEN_ERROR.getCode(),CommonStatusEnum.TOKEN_ERROR.getValue());
        }

        // 生成双token
        String refreshToken = JwtUtils.generatorToken(phone,identity,TokenConstants.REFRESH_TOKEN_TYPE);
        String accessToken = JwtUtils.generatorToken(phone,identity,TokenConstants.ACCESS_TOKEN_TYPE);

        String accessTokenKey = RedisPrefixUtils.generatorTokenKey(phone,identity,TokenConstants.ACCESS_TOKEN_TYPE);

        /*stringRedisTemplate.opsForValue().set(accessTokenKey , accessToken , 30, TimeUnit.DAYS);
        stringRedisTemplate.opsForValue().set(refreshTokenKey , refreshToken , 31, TimeUnit.DAYS);*/
        stringRedisTemplate.opsForValue().set(accessTokenKey , accessToken , 5, TimeUnit.SECONDS);
        stringRedisTemplate.opsForValue().set(refreshTokenKey , refreshToken , 30, TimeUnit.SECONDS);

        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.setRefreshToken(refreshToken);
        tokenResponse.setAccessToken(accessToken);

        return ResponseResult.success(tokenResponse);
    }

}
