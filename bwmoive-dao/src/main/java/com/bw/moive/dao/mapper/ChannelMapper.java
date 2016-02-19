package com.bw.moive.dao.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bw.moive.dao.entity.Channel;

@Repository
public interface ChannelMapper {

	public abstract List<Channel> selectAllChannel();
	
}
