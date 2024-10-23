package com.panpan.thymleaf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author panpan
 * @create 2024-10-22-上午 10:38
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 关联自定义的认证service 还有绑定密码加密器
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/login.html","/css/**","/js/**","/img/**","/fonts/**","/docs/**")
                .permitAll()
                .antMatchers("/**")
                .hasAnyRole("ADMIN")
                .anyRequest()
                .authenticated()
                // 登录
                .and()
                .formLogin()
                .loginPage("/login.html")
                .loginProcessingUrl("/loginUrl") // 登录表单提交的认证地址
                .defaultSuccessUrl("/home.html")
                .permitAll()
                .and()
                .logout()
                .and()
                .csrf().disable()
                // 针对 布局内嵌禁用放开
                .headers().frameOptions().disable()
        ;
    }

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("123456"));
    }
}
