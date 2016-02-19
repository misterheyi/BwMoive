package com.bw.moive.dao.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.bw.moive.dao.entity.Link;

@Repository
public interface LinkMapper {

	public abstract Integer insertLink(@Param("link") Link link) throws SQLException;
	
	public abstract List<Link> selectLinkByVId(@Param("vId") Integer vId) throws SQLException;
		
}
