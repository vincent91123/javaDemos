package com.panpan.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.panpan.mybatisplus.entity.User;
import com.panpan.mybatisplus.mapper.UserMapper;
import com.panpan.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author panpan
 * @create 2024-10-23-上午 11:49
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
