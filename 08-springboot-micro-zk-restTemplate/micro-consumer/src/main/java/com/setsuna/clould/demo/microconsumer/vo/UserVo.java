package com.setsuna.clould.demo.microconsumer.vo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserVo {

    private Integer userId;
    @JsonAlias("userName") // 配置json字段映射
    private String personName;
    private int userAge;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date userBirth;

}
