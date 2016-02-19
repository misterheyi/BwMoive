 package com.bw.moive.cms.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.moive.dao.entity.Link;
import com.bw.moive.service.ILinkService;

@Controller
@RequestMapping("/link/")
public class LinkController {

	
	@Autowired
	public ILinkService linkService;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="selectLinkByVId",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<Link> selectLinkByVId(Integer vId){
		return (List<Link>) this.linkService.selectLinkByVId(vId).get("links");
	}
	
	@RequestMapping(value="saveLink",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String,Object> saveLink(Link link){
		return this.linkService.insertLink(link);
	}
	
}
