package com.panpan.thymleaf.service;

import com.panpan.thymleaf.entity.SysUser;
import com.panpan.thymleaf.entity.User;

import java.util.List;

/**
 * @author panpan
 * @create 2024-10-22-上午 09:59
 */
public interface ISysUserService {

    public List<SysUser> query(SysUser user);

    SysUser queryById(Integer userId);

    void updateById(SysUser user);

    void save(SysUser user);

    void deleteById(Integer userId);
}
