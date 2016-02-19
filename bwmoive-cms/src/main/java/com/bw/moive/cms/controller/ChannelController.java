 package com.bw.moive.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.moive.dao.entity.Channel;
import com.bw.moive.service.IChannelService;

@Controller
@RequestMapping("/channel/")
public class ChannelController {

	
	@Autowired
	public IChannelService channelService;
	
	@RequestMapping(value="selectChannel",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<Channel> selectChannel(){
		return this.channelService.selectChannel();
	}
	
}
