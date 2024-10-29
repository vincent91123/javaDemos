package com.boge.stock.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_stock")
public class StockEntity {

    private static final long serialVersionUID = 1L;


    @TableId
    private Integer id;

    private Integer productId;

    private Integer count;

    private Integer money;
}
