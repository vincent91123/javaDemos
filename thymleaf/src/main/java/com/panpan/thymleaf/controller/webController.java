package com.panpan.thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panpan
 * @create 2024-10-22-上午 10:58
 */
@Controller
public class webController {

    @GetMapping(value ={ "/login","/login.html"})
    public String login(){
        return "login";
    }

    @GetMapping(value ={ "/home","/home.html","/"})
    public String home(){
        return "home";
    }

    @GetMapping(value ={ "/logout","/logout.html","/"})
    public String logout(){
        return "logout";
    }

    @GetMapping(value = "/{path}")
    public String basePage(@PathVariable("path")String path){
        return path;
    }
}
