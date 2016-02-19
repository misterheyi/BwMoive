 package com.bw.moive.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.moive.dao.entity.Type;
import com.bw.moive.service.ITypeService;

@Controller
@RequestMapping("/type/")
public class TypeController {

	
	@Autowired
	public ITypeService typeService;
	
	@RequestMapping(value="selectType",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<Type> selectType(Integer cId){
		return this.typeService.selectTypeByChannelId(cId);
	}
	
}
