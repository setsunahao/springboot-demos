package com.example.tkssm.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 项目中所有Mapper类的父类
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
