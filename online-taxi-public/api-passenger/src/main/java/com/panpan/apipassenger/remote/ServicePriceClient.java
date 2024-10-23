package com.panpan.apipassenger.remote;


import com.panpan.internalcommon.dto.ResponseResult;
import com.panpan.internalcommon.request.ForecastPriceDTO;
import com.panpan.internalcommon.response.ForecastPriceRepsonse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-price")
public interface ServicePriceClient {

    @RequestMapping(method = RequestMethod.POST, value = "/forecast-price")
    public ResponseResult<ForecastPriceRepsonse> forecast(@RequestBody ForecastPriceDTO forecastPriceDTO);
}
