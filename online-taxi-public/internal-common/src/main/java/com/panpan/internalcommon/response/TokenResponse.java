package com.panpan.internalcommon.response;

import lombok.Data;

@Data
public class TokenResponse {

    private String accessToken;

    private String refreshToken;
}
