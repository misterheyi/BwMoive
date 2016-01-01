package com.bw.moive.service;

import java.util.Map;

import com.bw.moive.dao.entity.Link;

public interface ILinkService {

	/**
	 * 插入视频链接
	 * @return
	 */
	public abstract Map<String,Object> insertLink(Link link);
	
}
