package com.panpan.servicedriveruser.controller;


import com.panpan.internalcommon.dto.DriverUser;
import com.panpan.internalcommon.dto.ResponseResult;
import com.panpan.servicedriveruser.service.DriverUserService;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Driver;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private DriverUserService driverUserService;

    /**
     * 新增司机
     * @param driverUser
     * @return
     */
    @PostMapping("/user")
    public ResponseResult addUser(@RequestBody DriverUser driverUser){
        log.info(JSONObject.fromObject(driverUser).toString());
        return driverUserService.addDriverUser(driverUser);
    }

    /**
     * 修改司机
     * @param driverUser
     * @return
     */
    @PutMapping("/user")
    public ResponseResult updateUser(@RequestBody DriverUser driverUser){
        log.info(JSONObject.fromObject(driverUser).toString());
        return driverUserService.updateDriverUser(driverUser);
    }


}
