package com.bw.moive.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.moive.dao.entity.Link;

public interface LinkMapper {

	/**
	 * 插入下载链接
	 */
	public abstract Integer insertLink(@Param("link") Link link);
	
	/**
	 * 更新下载链接
	 */
	public abstract Integer updateLinkById(@Param("link") Link link);
	
	/**
	 * 通过ID查询下载链接
	 * @param id
	 * @return
	 */
	public abstract Link getLinkById(@Param("id") String id);
	
	/**
	 * 通过电影ID查询下载地址
	 */
	public abstract List<Link> getLinkByMid(@Param("mId") String mId);
	
}
