package com.vegedog.atcrowdfunding.manager.dao;

import java.util.Map;

import com.vegedog.atcrowdfunding.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User queryUserLogin(Map<String, Object> paramMap);
}