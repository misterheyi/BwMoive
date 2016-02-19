package com.bw.moive.dao.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.moive.dao.dto.DataSearchDTO;
import com.bw.moive.dao.entity.Data;

public interface DataMapper {

	public abstract Integer insertData(@Param("data")Data data) throws SQLException;
	
	public abstract List<Data> selectData(@Param("param")DataSearchDTO param) throws SQLException;
	
}
