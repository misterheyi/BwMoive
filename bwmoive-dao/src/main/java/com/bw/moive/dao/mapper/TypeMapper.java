package com.bw.moive.dao.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.bw.moive.dao.entity.Type;

@Repository
public interface TypeMapper{

	public abstract List<Type> selectAllType() throws SQLException;
	
	public abstract List<Type> selectTypeByChannelId(@Param("cId")Integer cId) throws SQLException;
	
}
