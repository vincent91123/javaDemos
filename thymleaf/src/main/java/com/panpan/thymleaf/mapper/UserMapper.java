package com.panpan.thymleaf.mapper;

import com.panpan.thymleaf.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author panpan
 * @create 2024-10-21-下午 03:00
 */
@Mapper
public interface UserMapper {

    public List<User> queryList();
}
