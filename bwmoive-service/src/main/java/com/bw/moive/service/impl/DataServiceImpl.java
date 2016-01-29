package com.bw.moive.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.moive.dao.entity.Data;
import com.bw.moive.dao.mapper.AreaMapper;
import com.bw.moive.dao.mapper.DataMapper;
import com.bw.moive.dao.mapper.TypeMapper;
import com.bw.moive.service.IDataService;
import com.bw.moive.util.BaiKeSpider;
import com.bw.moive.util.HanderState;

@Service("dataService")
public class DataServiceImpl implements IDataService{

	@Autowired
	private AreaMapper areaMapper;
	@Autowired
	private TypeMapper typeMapper;
	@Autowired
	private DataMapper dataMapper;
	
	@Override
	public Map<String, Object> loadData(String url) {
		Map<String,Object> map = BaiKeSpider.loadBasicInfo(url);
		return map;
	}

	@Override
	public Map<String, Object> initParam() {
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			map.put("areaList", this.areaMapper.selectAllArea());
			map.put("typeTreeList", this.typeMapper.selectTypeTree());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	@Override
	public Map<String, Object> insertData(Data data) {
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Date date = new Date();
			data.setvCreateTime(date);
			data.setvUpdateTime(date);
			data.setvHit(0);
			data.setvHitTime(date);
			data.setvScoreNum(0);
			data.setvState(0);
			data.setvDigg(0);
			data.setvRank(0);
			data.setvDayHit(0);
			data.setvDayTime(date);
			data.setvWeekHit(0);
			data.setvWeekTime(date);
			data.setvMonthHit(0);
			data.setvMonthTime(date);
			this.dataMapper.insertData(data);
			map.put("state", HanderState.getState(HanderState.SUCCESS));
		} catch (Exception e) {
			map.put("state", HanderState.getState(HanderState.ERROR));
			e.printStackTrace();
		}
		return map;
	}

}
