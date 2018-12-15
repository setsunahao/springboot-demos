package com.setsuna.clould.demo.provider.service;

import com.setsuna.clould.demo.provider.domain.UserInfo;
import com.setsuna.clould.demo.provider.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public UserInfo getUserById(Integer userId){
        return userInfoMapper.getUser(1);
    }

}
