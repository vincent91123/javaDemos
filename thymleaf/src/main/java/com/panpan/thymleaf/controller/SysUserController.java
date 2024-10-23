package com.panpan.thymleaf.controller;

import com.panpan.thymleaf.entity.SysUser;
import com.panpan.thymleaf.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService userService;

    @GetMapping("/query")
    public String query(Model model){
        List<SysUser> list = userService.query(null);
        model.addAttribute("list",list);
        return "user/list";
    }

    @GetMapping("/addOrUpdatePage")
    public String addOrUpdatePage(Integer userId,Model model){
        if(userId != null){
            // 更新
            SysUser user = userService.queryById(userId);
            model.addAttribute("item",user);
        }
        return "user/addOrUpdate";
    }

    @PostMapping("/save")
    public String save(SysUser user){
        if(user != null && user.getUserId() != null){
            // 更新操作
            userService.updateById(user);
        }else {
            // 添加操作
            userService.save(user);
        }

        return "redirect:/sysUser/query";
    }
    @GetMapping("/deleteById")
    public String deleteById(Integer userId){
        userService.deleteById(userId);
        return "redirect:/sysUser/query";
    }
}
