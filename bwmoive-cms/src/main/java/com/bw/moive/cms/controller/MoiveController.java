package com.bw.moive.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.moive.service.IAreaService;
import com.bw.moive.service.ITypeService;

@Controller
@RequestMapping("/moive/")
public class MoiveController {

	@Autowired
	private ITypeService typeService;
	
	@Autowired
	private IAreaService areaService;
	
	@RequestMapping("toMoiveUI")
	public String toMoiveUI(Model model){
		model.addAttribute("typeList", typeService.selectAllType());
		model.addAttribute("areaList", areaService.selectAllArea());
		return "moive";
	}
	
}
