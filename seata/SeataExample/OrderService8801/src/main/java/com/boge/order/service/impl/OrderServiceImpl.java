package com.boge.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boge.order.dao.OrderDao;
import com.boge.order.entity.OrderEntity;
import com.boge.order.feign.StockService;
import com.boge.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderDao, OrderEntity> implements OrderService {

    @Autowired
    private StockService stockService;

    @GlobalTransactional
    @Override
    public String create() {
        // 扣减库存
        stockService.decrement();
        // 添加异常信息
        // int i = 10 / 0;
        // 创建订单
        OrderEntity entity = new OrderEntity();
        entity.setProductId(1001);
        entity.setCount(1);
        this.save(entity);

        return null;
    }
}
