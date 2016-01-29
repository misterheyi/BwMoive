package com.bw.moive.dao.mapper;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Param;

import com.bw.moive.dao.entity.Data;

public interface DataMapper {

	public abstract Integer insertData(@Param("data")Data data) throws SQLException;
	
}
