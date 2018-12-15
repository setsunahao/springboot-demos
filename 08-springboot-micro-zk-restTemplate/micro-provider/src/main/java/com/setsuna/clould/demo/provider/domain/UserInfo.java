package com.setsuna.clould.demo.provider.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class UserInfo {

    private Integer userId;
    private String userName;
    private int userAge;
    private Date userBirth;

}
