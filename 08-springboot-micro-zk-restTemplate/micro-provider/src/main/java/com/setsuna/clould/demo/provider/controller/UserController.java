package com.setsuna.clould.demo.provider.controller;

import com.setsuna.clould.demo.provider.domain.UserInfo;
import com.setsuna.clould.demo.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public UserInfo getUser(@PathVariable("id") Integer userId){
        return userService.getUserById(userId);
    }

}
