package com.bw.moive.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.moive.service.IUserService;

@Controller
public class IndexController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/index")
	public String index(ModelMap modelMap,HttpServletRequest request){
		userService.login();
		return "user";
	}
}
