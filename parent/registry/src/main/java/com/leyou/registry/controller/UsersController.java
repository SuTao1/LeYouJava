package com.leyou.registry.controller;

import com.leyou.registry.result.AppResult;
import com.leyou.registry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/test/user")
    @ResponseBody
    public AppResult s(HttpSession session){
        String key = session.getAttribute("key").toString();
        System.out.println(key + "------------------------------" +
                "");
        return userService.selectAllUsers();
    }

    @GetMapping("/testss/user")
    @ResponseBody
    public AppResult ss(){
        System.out.println("被拦截的方法");
        return userService.selectAllUsers();
    }
}
