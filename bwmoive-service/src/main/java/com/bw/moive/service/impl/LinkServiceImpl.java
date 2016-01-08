package com.bw.moive.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.moive.dao.entity.Link;
import com.bw.moive.dao.mapper.LinkMapper;
import com.bw.moive.service.ILinkService;

@Service
public class LinkServiceImpl implements ILinkService{

	@Autowired
	private LinkMapper linkMapper;
	
	@Override
	public Map<String, Object> insertLink(Link link) {
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			this.linkMapper.insertLink(link);
			map.put("code", "000000");
		} catch (SQLException e) {
			map.put("code", "000001");
			e.printStackTrace();
		}
		return map;
	}

	@Override
	public Map<String, Object> selectLinkById(Integer id) {
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Link link = this.linkMapper.selectLinkById(id);
			map.put("code", "000000");
			map.put("obj", link);
		} catch (SQLException e) {
			map.put("code", "000001");
			e.printStackTrace();
		}
		return map;
	}

	
	
}
