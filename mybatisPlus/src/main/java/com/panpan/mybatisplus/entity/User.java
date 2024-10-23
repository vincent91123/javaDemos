package com.panpan.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @author panpan
 * @create 2024-10-23-上午 10:23
 */
@Data
@ToString
@TableName(value = "user")
public class User {

    @TableId(value = "id")
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableLogic(value = "0",delval = "1")
    private Integer isDeleted;
}