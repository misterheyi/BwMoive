package com.bw.moive.service.impl;

import java.util.Map;

import com.bw.moive.service.IDataService;
import com.bw.moive.spider.BaiKeSpider;

public class DataServiceImpl implements IDataService{

	@Override
	public Map<String, Object> loadData(String url) {
		Map<String,Object> map = BaiKeSpider.loadBasicInfo(url)
		return null;
	}

}
