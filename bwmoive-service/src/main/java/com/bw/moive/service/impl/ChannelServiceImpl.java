package com.bw.moive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.moive.dao.entity.Channel;
import com.bw.moive.dao.mapper.ChannelMapper;
import com.bw.moive.service.IChannelService;

@Service("channelService")
public class ChannelServiceImpl implements IChannelService {

	@Autowired
	private ChannelMapper channelMapper;
	
	@Override
	public List<Channel> selectChannel() {
		return this.channelMapper.selectAllChannel();
	}

}
