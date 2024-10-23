package com.panpan.apiboss.service;

import com.panpan.apiboss.remote.ServiceDriverUserClient;
import com.panpan.internalcommon.dto.DriverUser;
import com.panpan.internalcommon.dto.ResponseResult;
import com.panpan.servicedriveruser.mapper.DriverUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DriverUserService {

    @Autowired
    private ServiceDriverUserClient serviceDriverUserClient;


    public ResponseResult addDriverUser(DriverUser driverUser){
        return serviceDriverUserClient.addDriverUser(driverUser);
    }


    public ResponseResult updateDriverUser(DriverUser driverUser){

        return serviceDriverUserClient.updateDriverUser(driverUser);
    }
}
