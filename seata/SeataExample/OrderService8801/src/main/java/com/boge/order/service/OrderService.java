package com.boge.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boge.order.entity.OrderEntity;

public interface OrderService extends IService<OrderEntity> {
    String create();
}
