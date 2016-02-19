package com.bw.moive.util;

import java.util.HashMap;
import java.util.Map;

public class BasicInfos {
	
	private static Map<String,String> map = new HashMap<String,String>();
	
	static{
		map.put("中文名", "vName");
		map.put("外文名", "vEnName");
		map.put("出品时间", "vPublishyear");
		map.put("出品公司", "vPublishCompany");
		map.put("发行公司", "vShowBox");
		map.put("制片地区", "vPublishArea");
		map.put("拍摄地点", "vVideoArea");
		map.put("拍摄日期", "vVideoTime");
		map.put("首播时间", "vOnTime");//首播时间，上映时间
		map.put("上映时间", "vOnTime");//首播时间，上映时间
		map.put("导演", "vDirector");
		map.put("编剧", "vWriter");
		map.put("制片人", "vProducer");
		map.put("类型", "vType");
		map.put("主演", "vActor");
		map.put("集数", "vTotal");
		map.put("片长", "vLength");
		map.put("票房", "vBoxOffice");
		map.put("对白语言", "vLanguage");
		map.put("色彩", "vColor");
		map.put("imdb编码", "vImdb");
		map.put("每集长度", "vPerLength");
		map.put("出品人", "vPresenter");
		map.put("在线播放平台", "vOnlineShow");
		map.put("播出平台", "vTvShow");
		map.put("下映时间", "vOffTime");
		map.put("其它译名", "vNickName");
	}
	
	public static String getValue(String value){
		return map.get(value);
	}
	
	public static void main(String[] args) {
		System.out.println(BasicInfos.getValue("其他译名"));
	}
	
}