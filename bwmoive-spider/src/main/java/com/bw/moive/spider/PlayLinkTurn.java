package com.bw.moive.spider;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;

public class PlayLinkTurn {

	private static final String divider = "//";

	public static void main(String[] args) {
		String url = "http://tool.lu/test.zip";
		Map<String,String> map = turnDownloadUrl(url);
		System.out.println(map);
	}

	public static Map<String,String> turnDownloadUrl(String url){
		Map<String,String> map = new HashMap<String,String>();
		String head = url.substring(0, url.indexOf(divider));
		//迅雷地址
		if("thunder:".equalsIgnoreCase(head)){
			//不操作
			map.put("thunder", url);
			return map;
		}
		//QQ旋风地址
		if("qqdl:".equals(head)){
			//不操作
			map.put("qqdl", url);
			return map;
		}
		//快车地址
		if("flashget:".equalsIgnoreCase(head)){
			//不操作
			map.put("flashget", url);
			return map;
		}
		//电驴地址
		if("ed2k:".equalsIgnoreCase(head)){
			map.put("ed2k", url);
			return map;
		}
		//http地址
		if("http:".equalsIgnoreCase(head)){
			String thunder = thunderConvert(url);
			String flashget = flashgetConvert(url);
			String qqdl = qqdlConvert(url);
			map.put("thunder", thunder);
			map.put("flashget", flashget);
			map.put("qqdl", qqdl);
			return map;
		}
		if("http:".equalsIgnoreCase(head)
				||"ftp:".equalsIgnoreCase(head)
				||"https:".equalsIgnoreCase(head)
				||"mms:".equalsIgnoreCase(head)
				||"rtsp:".equalsIgnoreCase(head)){
			String thunder = thunderConvert(url);
			String flashget = flashgetConvert(url);
			String qqdl = qqdlConvert(url);
			map.put("thunder", thunder);
			map.put("flashget", flashget);
			map.put("qqdl", qqdl);
			return map;
		}

		return map;
	}
	// 迅雷
	private static String thunderConvert(String urlstr) {
		String thunderUrl = "AA" + urlstr + "ZZ";
		return "thunder://" + Base64.encodeBase64String(thunderUrl.getBytes());
	}
	// 快车
	private static String flashgetConvert(String urlstr) {
		String flashgetUrl = "[FLASHGET]" + urlstr + "[FLASHGET]";
		return "Flashget://" + Base64.encodeBase64String(flashgetUrl.getBytes());
	}
	// QQ旋风
	private static String qqdlConvert(String urlstr) {
		return "qqdl://" + Base64.encodeBase64String(urlstr.getBytes());
	}
	
	/**
	 * 转化原始下载地址
	 * @param url
	 * @return
	 */
	public static String turnOriginalUrl(String url) {
		try {
			String head = url.substring(0, url.indexOf(divider));
			String content = url.substring(url.indexOf(divider) + divider.length());
			if("qqdl:".equalsIgnoreCase(head)) {
				byte[] bytes = Base64.decodeBase64(url);
				String result = new String(bytes);
				return result;
			}
			if("thunder:".equalsIgnoreCase(head)) {//
				byte[] bytes = Base64.decodeBase64(content);
				String result = new String(bytes, "GBK");
				result = result.substring(2, result.length() - 2);
				return result;
			}
			if("flashget:".equalsIgnoreCase(head)) {//
				String flag = "[FLASHGET]";
				byte[] bytes = Base64.decodeBase64(content);
				String result = new String(bytes);
				result = result.substring(flag.length(),
						result.lastIndexOf(flag));
				return result;
			}
			if("http:".equalsIgnoreCase(head)){
				return url;
			}
			if("ftp:".equalsIgnoreCase(head)){
				return url;
			}
			if("ed2k:".equalsIgnoreCase(head)){
				return url;
			}
			if("mms:".equalsIgnoreCase(head)){
				return url;
			}
			if("rtsp:".equalsIgnoreCase(head)){
				return url;
			}
			if("https:".equalsIgnoreCase(head)){
				return url;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		return "";
	}

}
