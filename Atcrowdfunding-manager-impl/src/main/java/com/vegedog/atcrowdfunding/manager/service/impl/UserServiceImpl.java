package com.vegedog.atcrowdfunding.manager.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vegedog.atcrowdfunding.bean.User;
import com.vegedog.atcrowdfunding.exception.LoginFailException;
import com.vegedog.atcrowdfunding.manager.dao.UserMapper;
import com.vegedog.atcrowdfunding.manager.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User queryUserLogin(Map<String, Object> paramMap) {
		
		User user = userMapper.queryUserLogin(paramMap);
		
		if (user == null) {
			throw new LoginFailException("登录失败！用户名或密码不正确！");
		}
		
		return user;
	}
}
