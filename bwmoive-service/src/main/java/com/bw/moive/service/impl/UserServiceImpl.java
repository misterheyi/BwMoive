package com.bw.moive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.moive.dao.entity.User;
import com.bw.moive.dao.mapper.UserMapper;
import com.bw.moive.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserMapper userMapper;
	
	public List<User> login(){
		return this.userMapper.queryUser();
	}
	
}
