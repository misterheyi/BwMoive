package com.bw.moive.service;

import java.util.List;

import com.bw.moive.dao.entity.Area;

public interface IAreaService {

	public abstract List<Area> selectAllArea();
	
	public abstract List<Area> selectAreaByChannelId(Integer cId);
	
}
