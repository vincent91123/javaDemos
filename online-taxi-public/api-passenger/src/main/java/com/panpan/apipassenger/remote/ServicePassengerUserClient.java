package com.panpan.apipassenger.remote;

import com.panpan.internalcommon.dto.PassengerUser;
import com.panpan.internalcommon.dto.ResponseResult;
//import com.panpan.internalcommon.request.VerificationCodeDTO;
import com.panpan.servicepassengeruser.request.VerificationCodeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("service-passenger-user")
public interface ServicePassengerUserClient {

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public ResponseResult loginOrRegister(@RequestBody VerificationCodeDTO verificationCodeDTO);

    @RequestMapping(method = RequestMethod.GET, value = "/user/{phone}")
    public ResponseResult<PassengerUser> getUserByPhone(@PathVariable("phone") String phone);
}
