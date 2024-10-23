package com.panpan.thymleaf;


import com.panpan.thymleaf.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.panpan.thymleaf.entity.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;

@SpringBootTest
class ThymleafApplicationTests {
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        stringRedisTemplate.opsForValue().set("k1","springBoot整合测试");
        String k1 = stringRedisTemplate.opsForValue().get("k1");
        System.out.println("k1 = " + k1);
    }


    @Autowired
    private IUserService userService;


    @Test
    void ContetTest(){
        List<User> users=userService.queryList();
        System.out.println("users="+users);
    }
}
