package com.boot.dubbo.demo.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.api.UserService;
import com.demo.domain.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/login")
    public UserInfo login(UserInfo userInfo){
        return userService.login(userInfo);
    }

}
