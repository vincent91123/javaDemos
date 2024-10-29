package com.boge.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_order")
public class OrderEntity {

    private static final long serialVersionUID = 1L;


    @TableId
    private Integer id;

    private Integer productId;

    private Integer count;
}
