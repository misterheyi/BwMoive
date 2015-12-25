package com.bw.moive.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/moive/")
public class MoiveController {

	@RequestMapping("toMoiveUI")
	public String toMoiveUI(){
		return "list_moive";
	}
	
}
