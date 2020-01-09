package com.vegedog.atcrowdfunding.manager.dao;

import com.vegedog.atcrowdfunding.bean.Cert;

public interface CertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cert record);

    int insertSelective(Cert record);

    Cert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cert record);

    int updateByPrimaryKey(Cert record);
}