package com.bw.moive.cms.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.moive.service.IAreaService;
import com.bw.moive.service.ITypeService;

@Controller
@RequestMapping("/data/")
public class DataController {

	@Autowired
	private ITypeService typeService;
	
	@Autowired
	private IAreaService areaService;
	
	@RequestMapping(value="toDataCollectionUI")
	public String toMoiveUI(Model model){
		//model.addAttribute("typeList", typeService.selectAllType());
		//model.addAttribute("areaList", areaService.selectAllArea());
		return "data";
	}
	
	@RequestMapping(value="loadingData",method={RequestMethod.POST})
	@ResponseBody
	public Map<String, Object> loadingData(String source){
		return null;
	}
	
}
