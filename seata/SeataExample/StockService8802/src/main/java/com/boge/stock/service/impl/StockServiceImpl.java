package com.boge.stock.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boge.stock.dao.StockDao;
import com.boge.stock.entity.StockEntity;
import com.boge.stock.service.StockService;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl extends ServiceImpl<StockDao, StockEntity> implements StockService {
}
