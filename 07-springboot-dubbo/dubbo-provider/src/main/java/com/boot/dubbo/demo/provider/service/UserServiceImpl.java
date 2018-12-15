package com.boot.dubbo.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.api.UserService;
import com.demo.domain.UserInfo;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Override
    public UserInfo login(UserInfo user) {
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount("登陆账号为 : " + user.getAccount());
        userInfo.setPassword("登陆密码为 : " + user.getPassword());
        return userInfo;
    }
}
