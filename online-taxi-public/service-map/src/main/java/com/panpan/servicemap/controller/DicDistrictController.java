package com.panpan.servicemap.controller;

import com.panpan.internalcommon.dto.ResponseResult;
import com.panpan.servicemap.service.DicDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DicDistrictController {

    @Autowired
    private DicDistrictService dicDistrictService;

    @GetMapping("/district")
    public ResponseResult initDicDistrict(String keywords){

        return dicDistrictService.initDicDistrict(keywords);
    }


}