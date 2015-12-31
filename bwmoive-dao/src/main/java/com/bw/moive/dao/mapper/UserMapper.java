package com.bw.moive.dao.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bw.moive.dao.entity.User;

@Repository
public interface UserMapper{

	public abstract List<User> queryUser();
	
	public abstract Integer count();
	
}
