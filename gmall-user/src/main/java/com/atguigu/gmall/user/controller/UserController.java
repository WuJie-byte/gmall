package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.umsMembers;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello user";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<umsMembers> getAllUser() {
        List<umsMembers> umsMembers = userService.getAllUser();
        return umsMembers;
    }
}
