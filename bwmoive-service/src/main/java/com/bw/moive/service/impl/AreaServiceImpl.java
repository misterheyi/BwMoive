package com.bw.moive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.moive.dao.entity.Area;
import com.bw.moive.dao.mapper.AreaMapper;
import com.bw.moive.service.IAreaService;

@Service
public class AreaServiceImpl implements IAreaService{

	@Autowired
	private AreaMapper areaMapper;

	@Override
	public List<Area> selectAllArea() {
		try {
			return areaMapper.selectAllArea();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ArrayList<Area>(); 
	}
	
	
}
