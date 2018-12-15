package com.demo.api;

import com.demo.domain.UserInfo;

public interface UserService {

    // 定义用户登录的api
    UserInfo login(UserInfo user);

}
