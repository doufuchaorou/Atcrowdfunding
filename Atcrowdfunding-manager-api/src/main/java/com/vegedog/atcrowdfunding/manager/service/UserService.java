package com.vegedog.atcrowdfunding.manager.service;

import java.util.Map;

import com.vegedog.atcrowdfunding.bean.User;

public interface UserService {

	User queryUserLogin(Map<String, Object> paramMap);

}
