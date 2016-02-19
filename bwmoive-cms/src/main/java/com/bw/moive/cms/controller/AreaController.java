 package com.bw.moive.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.moive.dao.entity.Area;
import com.bw.moive.service.IAreaService;

@Controller
@RequestMapping("/area/")
public class AreaController {

	
	@Autowired
	public IAreaService areaService;
	
	@RequestMapping(value="selectArea",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<Area> selectArea(Integer cId){
		return this.areaService.selectAreaByChannelId(cId);
	}
	
}
