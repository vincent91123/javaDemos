package com.panpan.thymleaf.service.impl;

import com.panpan.thymleaf.entity.SysUser;
import com.panpan.thymleaf.entity.SysUserExample;
import com.panpan.thymleaf.mapper.SysUserMapper;
import com.panpan.thymleaf.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author panpan
 * @create 2024-10-22-上午 10:03
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper mapper;

    /**
     * 根据用户条件查询用户信息
     * @param user
     * @return
     */
    @Override
    public List<SysUser> query(SysUser user) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        if(user != null){
            if(!user.getUsername().isEmpty()){
                // 根据账号查询信息
                criteria.andUsernameEqualTo(user.getUsername());
            }
        }

        List<SysUser> sysUsers = mapper.selectByExample(example);
        return sysUsers;
    }

    @Override
    public SysUser queryById(Integer userId) {

        return mapper.selectByPrimaryKey(userId.longValue());
    }

    @Override
    public void updateById(SysUser user) {
        mapper.updateByPrimaryKeySelective(user);

    }

    @Override
    public void save(SysUser user) {
        String password = user.getPassword();
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(password));
        user.setCreateTime(new Date());
        mapper.insertSelective(user);
    }

    @Override
    public void deleteById(Integer userId) {
        mapper.deleteByPrimaryKey(userId.longValue());
    }
}
