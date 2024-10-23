package com.panpan.thymleaf.service.impl;

/**
 * @author panpan
 * @create 2024-10-22-上午 09:58
 */
import com.panpan.thymleaf.entity.SysUser;
import com.panpan.thymleaf.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ISysUserService userService;

    /**
     * 认证逻辑的处理
     * @param username 认证的账号
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("----------开始认证--------" + username);
        UserDetails userDetails = null;
        if(!StringUtils.isEmpty(username)){
            // 做账号验证
            SysUser user = new SysUser();

            user.setUsername(username);
            List<SysUser> list = userService.query(user);
            if(list != null && list.size() == 1){
                SysUser sysUser = list.get(0);
                List<SimpleGrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
                // 说明账号是存在的
                userDetails = new User(sysUser.getUsername()
                        ,sysUser.getPassword()
                        ,true
                        ,true
                        ,true
                        ,true
                        ,authorities);
            }
        }
        return userDetails;
    }
}
