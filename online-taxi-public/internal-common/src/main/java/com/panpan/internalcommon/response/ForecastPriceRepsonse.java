package com.panpan.internalcommon.response;

import lombok.Data;

/**
 * @author panpan
 * @create 2024-10-10-下午 02:12
 */
@Data
public class ForecastPriceRepsonse {

    private double price;

    private String cityCode;

    private String vehicleType;

    private String fareType;

    private Integer fareVersion;
}
