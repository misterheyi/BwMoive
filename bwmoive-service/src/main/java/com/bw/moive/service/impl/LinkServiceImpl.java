package com.bw.moive.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.moive.dao.entity.Link;
import com.bw.moive.dao.mapper.LinkMapper;
import com.bw.moive.service.ILinkService;
import com.bw.moive.util.HanderState;

@Service
public class LinkServiceImpl implements ILinkService{

	@Autowired
	private LinkMapper linkMapper;
	
	@Override
	public Map<String, Object> insertLink(Link link) {
		Map<String,Object> obj = new HashMap<String,Object>();
		try {
			this.linkMapper.insertLink(link);
			obj.put("state", HanderState.SUCCESS);
		} catch (SQLException e) {
			obj.put("state", HanderState.SUCCESS);
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Map<String, Object> selectLinkByVId(Integer vId) {
		Map<String,Object> obj = new HashMap<String,Object>();
		try {
			List<Link> link = this.linkMapper.selectLinkByVId(vId);
			obj.put("links", link);
			obj.put("state", HanderState.SUCCESS);
		} catch (SQLException e) {
			obj.put("state", HanderState.ERROR);
			e.printStackTrace();
		}
		return obj;
	}

	
	
}
