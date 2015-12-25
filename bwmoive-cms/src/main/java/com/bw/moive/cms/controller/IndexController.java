package com.bw.moive.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.moive.dao.entity.User;
import com.bw.moive.service.IUserService;

@Controller
public class IndexController {

	
	@Autowired
	public IUserService userService;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/json")
	@ResponseBody
	public List<User> jsonIndex(){
		return this.userService.login();
	}
}
