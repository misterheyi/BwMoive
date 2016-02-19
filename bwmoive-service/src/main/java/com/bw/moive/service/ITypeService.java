package com.bw.moive.service;

import java.util.List;

import com.bw.moive.dao.entity.Type;

public interface ITypeService {

	public abstract List<Type> selectAllType();
	
	
	public abstract List<Type> selectTypeByChannelId(Integer cId);
}
