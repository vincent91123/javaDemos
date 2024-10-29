package com.boge.stock.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boge.stock.entity.StockEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDao extends BaseMapper<StockEntity> {
}
