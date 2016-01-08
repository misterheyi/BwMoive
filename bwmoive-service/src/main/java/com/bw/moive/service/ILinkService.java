package com.bw.moive.service;

import java.util.Map;

import com.bw.moive.dao.entity.Link;

public interface ILinkService {

	public abstract Map<String,Object> insertLink(Link link);
	
	public abstract Map<String,Object> selectLinkById(Integer id);
	
}
