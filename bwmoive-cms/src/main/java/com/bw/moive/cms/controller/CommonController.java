package com.bw.moive.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.moive.util.ImageUtil;
import com.bw.moive.util.ResourceLoader;


@Controller
@RequestMapping(value="/common/")
public class CommonController {

	@RequestMapping(value="loadImage")
	@ResponseBody
	public String loadImage(String url){
		String savePath = ResourceLoader.loadResource("file.path");
		String basePath = ImageUtil.download(url , savePath);
		return basePath;
	}
	
}
