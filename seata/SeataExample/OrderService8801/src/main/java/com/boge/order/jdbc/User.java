package com.boge.order.jdbc;

import lombok.Data;

@Data
public class User {

    private Integer id;

    private String userName;

    private String realName;

    private String password;

    private Integer age;

    private Integer dId;
}
