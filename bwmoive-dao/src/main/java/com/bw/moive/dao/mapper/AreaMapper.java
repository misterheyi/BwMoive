package com.bw.moive.dao.mapper;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bw.moive.dao.entity.Area;

@Repository
public interface AreaMapper{

	public abstract List<Area> selectAllArea() throws SQLException;
	
	
}
