package com.panpan.servicemap.controller;

import com.panpan.internalcommon.dto.ResponseResult;
import com.panpan.internalcommon.request.ForecastPriceDTO;
import com.panpan.servicemap.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/direction")
public class DriectionController {

    @Autowired
    private DirectionService directionService;

    @GetMapping("/driving")
    public ResponseResult  driving(@RequestBody ForecastPriceDTO forecastPriceDTO){

//        调用第三方地图接口

        String depLongitude = forecastPriceDTO.getDepLongitude();
        String depLatitude = forecastPriceDTO.getDepLatitude();
        String destLongitude = forecastPriceDTO.getDestLongitude();
        String destLatitude = forecastPriceDTO.getDestLatitude();

        return directionService.driving(depLongitude,depLatitude,destLongitude,destLatitude);
    }
}
