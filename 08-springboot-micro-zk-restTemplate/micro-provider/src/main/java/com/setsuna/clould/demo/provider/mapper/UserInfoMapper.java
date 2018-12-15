package com.setsuna.clould.demo.provider.mapper;

import com.setsuna.clould.demo.provider.domain.UserInfo;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserInfoMapper {

    public UserInfo getUser(Integer userId){
        UserInfo userInfo = UserInfo.builder()
                .userAge(18)
                .userId(userId)
                .userBirth(new Date())
                .userName("张三")
                .build();
        return userInfo;
    }

}
