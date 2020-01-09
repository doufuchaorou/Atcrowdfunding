package com.vegedog.atcrowdfunding.manager.dao;

import com.vegedog.atcrowdfunding.bean.AccountTypeCert;

public interface AccountTypeCertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountTypeCert record);

    int insertSelective(AccountTypeCert record);

    AccountTypeCert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccountTypeCert record);

    int updateByPrimaryKey(AccountTypeCert record);
}