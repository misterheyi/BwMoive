package com.bw.moive.service;

import java.util.Map;

import com.bw.moive.dao.entity.Data;

public interface IDataService {

	//初始化跳转获取数据页面需要的数据
	public abstract Map<String,Object> initParam();
	
	//加载数据
	public Map<String,Object> loadData(String url);
	
	//插入数据
	public Map<String,Object> insertData(Data data);
	
}
