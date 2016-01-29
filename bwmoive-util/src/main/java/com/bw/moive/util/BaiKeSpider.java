package com.bw.moive.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BaiKeSpider {
	
	public static void main(String[] args) {
		BaiKeSpider.loadBasicInfo("http://baike.baidu.com/item/%E6%B8%AF%E5%9B%A7/9722595");
	}
	
	public static Map<String,Object> loadBasicInfo(String url){
		Map<String,Object> map = new HashMap<String,Object>();
		// 从 URL 直接加载 HTML 文档
		Document doc;
		try {
			doc = Jsoup.connect(url).get();
			//获取基本信息
			Elements eBaseInfo = doc.select("div.basic-info");
			Elements names = eBaseInfo.select("dt.basicInfo-item");
			Elements values = eBaseInfo.select("dd.basicInfo-item");
			Map<String,String> basicInfos = new HashMap<String,String>();
			for(int i=0 ; i<names.size() ; i++){
				String name = names.get(i).text().replace("\u00A0", "");
				String value = values.get(i).text().replace("\u3001", ",").replace("/", ",").replace("，", ",");
				basicInfos.put(BasicInfos.getValue(name),value);
			}
			//中文拼音
			String vName = basicInfos.get("vName");
			if(vName != null){
				basicInfos.put("vSpell", Pinyin4jUtil.getPinYinFull(vName).replace(" ", ""));
				basicInfos.put("vLetter", Pinyin4jUtil.getPinYinFirstChar(vName).substring(0,1).toUpperCase());
			}
			map.put("baseInfos", basicInfos);
			
			//获取剧情概要描述
			Elements eSummary = doc.select("div.lemma-summary");
			String summeary = eSummary.text().replace("\r\n", "");
			map.put("vDrama", summeary);
			
			//分集剧情
			Elements eDramaSeries = doc.select("div.dramaSeries");
			List<Map<String,String>> dramaSeries = new ArrayList<Map<String,String>>();
			Elements eSeriesName = eDramaSeries.select("dt");
			Elements eSeriesDesc = eDramaSeries.select("dd");
			for(int i=0 ; i<eSeriesName.size() ; i++){
				Map<String,String> series = new HashMap<String,String>();
				String name = eSeriesName.get(i).text().replace("\u00A0", "");
				String value = eSeriesDesc.get(i).text();
				series.put(name,value);
				dramaSeries.add(series);
			}
			map.put("dramaSeries", dramaSeries);
			
			//角色介绍列表
			Elements eRoleIntroduction = doc.select("div.lemmaWgt-roleIntroduction");
			Elements eRoleIntroductionItem = eRoleIntroduction.select("li");
			List<Map<String,String>> list = new ArrayList<Map<String,String>>();
			for(int i = 0 ; i<eRoleIntroductionItem.size() ; i++){
				Map<String,String> role = new HashMap<String,String>();
				Element eImage = eRoleIntroductionItem.get(i).select("a.roleIntrodcution-picture").select("img").first();
				Element eRoleName = eRoleIntroductionItem.get(i).select("div.role-name").first();
				Element eRoleActor = eRoleIntroductionItem.get(i).select("div.role-actor").select(".item-value").first();
				Element eRoleVoice = eRoleIntroductionItem.select("div.role-voice").select(".item-value").first();
				Element eRoleDescription = eRoleIntroductionItem.get(i).select("dd.role-description").first();
				String image = eImage.attr("src");
				String roleName = eRoleName.text().replace("\r\n", "");
				String roleActor = eRoleActor.text().replace("\r\n", "");
				String roleVoice = "";
				String roleDescription = eRoleDescription.text().replace("\r\n", "");
				if(eRoleVoice != null){
					roleVoice = eRoleVoice.text().replace("\r\n", "");
				}
				role.put("image", image);
				role.put("roleName", roleName);
				role.put("roleActor", roleActor);
				role.put("roleVoice", roleVoice);
				role.put("roleDescription", roleDescription);
				list.add(role);
			}
			map.put("roles", list);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return map;
	} 
	
}
