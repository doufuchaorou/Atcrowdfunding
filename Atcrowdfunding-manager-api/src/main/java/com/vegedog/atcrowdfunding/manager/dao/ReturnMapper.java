package com.vegedog.atcrowdfunding.manager.dao;

import com.vegedog.atcrowdfunding.bean.Return;

public interface ReturnMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Return record);

    int updateByPrimaryKey(Return record);
}