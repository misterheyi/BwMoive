 package com.bw.moive.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.moive.service.IAreaService;

@Controller
public class IndexController {

	
	@Autowired
	public IAreaService userService;
	
	@RequestMapping({"/","/index"})
	public String index(){
		return "index";
	}
	
}
