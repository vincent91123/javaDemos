package com.panpan.thymleaf.service.impl;

import com.panpan.thymleaf.entity.SysUser;
import com.panpan.thymleaf.entity.User;
import com.panpan.thymleaf.mapper.UserMapper;
import com.panpan.thymleaf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author panpan
 * @create 2024-10-21-下午 03:44
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<SysUser> query(SysUser user) {
        return null;//userMapper.query();;
    }

    @Override
    public List<User> queryList() {
        return userMapper.queryList();
    }
}
