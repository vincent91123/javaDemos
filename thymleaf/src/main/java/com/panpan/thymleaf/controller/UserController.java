package com.panpan.thymleaf.controller;

import com.panpan.thymleaf.entity.User;
import com.panpan.thymleaf.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author panpan
 * @create 2024-10-21-下午 01:37
 */
@RestController
@Slf4j
public class UserController {

    @GetMapping("/user/query")
    public String query(Model model, Map map){
        model.addAttribute("msg1","panpan");
        map.put("msg2",18);
        log.info("info1{}888","这个是info信息。。。");
        log.debug("debug1{}888","这个是debug信息。。。");
        log.error("error1{}888","这个是error信息。。。");
        return "user";
    }


    @Autowired
    private IUserService userService;

    @GetMapping("/user/list")
    public List<User> list(){
        return userService.queryList();
    }
}
