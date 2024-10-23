package com.panpan.thymleaf.service;

import com.panpan.thymleaf.entity.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author panpan
 * @create 2024-10-21-下午 04:38
 */
@SpringBootTest
class IUserServiceTest {

    @Autowired
    private IUserService userService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void tearDown() {
        List<User> users=userService.queryList();
        System.out.println(users);
    }
}