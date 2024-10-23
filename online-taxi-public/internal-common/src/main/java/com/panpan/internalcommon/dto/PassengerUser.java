package com.panpan.internalcommon.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author panpan
 * @create 2024-10-08-上午 08:42
 */
@Data
public class PassengerUser{
    private Long id;

    private LocalDateTime  gmtCreate;

    private LocalDateTime  gmtModified;

    private String passengerPhone;

    private String passengerName;

    private byte passengerGender;

    private byte status;

    private String profilePhoto;






}
