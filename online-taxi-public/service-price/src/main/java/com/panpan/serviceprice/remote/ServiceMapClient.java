package com.panpan.serviceprice.remote;

import com.panpan.internalcommon.dto.ResponseResult;
import com.panpan.internalcommon.request.ForecastPriceDTO;
import com.panpan.internalcommon.response.DirectionResponse;
import com.sun.javafx.scene.traversal.Direction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-map")
public interface ServiceMapClient {

    @RequestMapping(method = RequestMethod.GET,value = "/direction/driving")
    public ResponseResult<DirectionResponse> direction(@RequestBody ForecastPriceDTO forecastPriceDTO);
}
