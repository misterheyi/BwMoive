package com.bw.moive.cms.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.moive.dao.entity.Data;
import com.bw.moive.service.IDataService;

@Controller
@RequestMapping("/data/")
public class DataController {

	@Autowired
	private IDataService dataServie;
	
	@RequestMapping(value="toDataUI")
	public String toMoiveUI(Model model){
		model.addAllAttributes(this.dataServie.initParam());
		return "data";
	}
	
	@RequestMapping(value="loadingData",method={RequestMethod.POST})
	@ResponseBody
	public Map<String, Object> loadingData(String source){
		return dataServie.loadData(source);
	}
	
	@RequestMapping(value="saveBasicInfo",method={RequestMethod.POST})
	@ResponseBody
	public Map<String,Object> saveBasicInfo(@ModelAttribute("data")Data data){
		return this.dataServie.insertData(data);
	}
	
	
	
	
}
