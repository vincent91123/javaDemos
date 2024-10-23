package com.panpan.thymleaf.service;

import com.panpan.thymleaf.entity.SysUser;
import com.panpan.thymleaf.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author panpan
 * @create 2024-10-21-下午 03:36
 */

public interface IUserService {

    public List<SysUser> query(SysUser user);
    public List<User> queryList();
}
