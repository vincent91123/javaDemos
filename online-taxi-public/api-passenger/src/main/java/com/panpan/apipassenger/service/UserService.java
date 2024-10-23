package com.panpan.apipassenger.service;


import com.panpan.apipassenger.remote.ServicePassengerUserClient;
import com.panpan.internalcommon.dto.PassengerUser;
import com.panpan.internalcommon.dto.ResponseResult;
import com.panpan.internalcommon.dto.TokenResult;
import com.panpan.internalcommon.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    ServicePassengerUserClient servicePassengerUserClient;

    public ResponseResult getUserByAccessToken(String accessToken) {
        log.info("accessToken:" + accessToken);
        // 解析accessToken，拿到手机号
        TokenResult tokenResult = JwtUtils.checkToken(accessToken);
        String phone = tokenResult.getPhone();
        log.info("手机号：" + phone);

        // 根据手机号查询用户信息
        ResponseResult<PassengerUser> userByPhone = servicePassengerUserClient.getUserByPhone(phone);

        return ResponseResult.success(userByPhone.getData());
    }
}