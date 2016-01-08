package com.bw.moive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.moive.dao.entity.Area;
import com.bw.moive.dao.entity.Type;
import com.bw.moive.dao.mapper.AreaMapper;
import com.bw.moive.dao.mapper.TypeMapper;
import com.bw.moive.service.ITypeService;

@Service
public class TypeServiceImpl implements ITypeService{

	@Autowired
	private TypeMapper typeMapper;

	@Override
	public List<Type> selectAllType() {
		try {
			return typeMapper.selectAllType();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ArrayList<Type>(); 
	}
	
	
}
