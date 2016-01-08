package com.bw.moive.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;

/**
 * 中文转字母、拼音工具类<br><br>
 * 注意：依赖的jar包：pinyin4j-2.5.0.jar
 * 
 * @author wp Dec 9, 2015 6:40:59 PM
 *
 */
public class Pinyin4jUtil {
	
	public static void main(String[] args) {
		String ss = Pinyin4jUtil.getPinYinFull("重庆");
		System.out.println(ss);
		String bb = Pinyin4jUtil.getPinYinFirstChar("吕，我有一颗真挚的心，不要问我为什么？使用PinYin4j很好啊！");
		System.out.println(bb);
	}
	
	/**
	 * 得到中文的全拼
	 * @param str
	 * @return
	 */
	public static String getPinYinFull(String str){
		return getPinYin(str, true, ToneType.no_tone, true, true);
	}
	
	/**
	 * 得到中文的首字母（大写）
	 * @param str
	 * @return
	 */
	public static String getPinYinFirstChar(String str){
		return getPinYin(str, false, ToneType.no_tone, false, true);
	}
	
	/**
	 * 声调类型(no_tone：无声调、num_tone：数字声调、mark_tone：标记声调-中文)
	 *
	 */
	public static enum ToneType{
		no_tone, num_tone, mark_tone
	}
	private static HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
	
	/**
    * 提取每个汉字的全拼或者首字母
    * 
     * @param str 要转换的字符串
     * @param isFull 是否转全拼
     * @param tone 声调类型
     * @param isLow 是否转小写
     * @param isTrim 是否去除中间的空格
     * @return
     */
    public static String getPinYin(String str, boolean isFull, ToneType tone, boolean isLow, boolean isTrim) {
        if (isNull(str)) {
            return "";
        }
        if(isLow){
        	//转换大小写 （LOWERCASE:小写：默认格式、UPPERCASE:大写）
        	format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        }else{
        	format.setCaseType(HanyuPinyinCaseType.UPPERCASE);
        }
        if(ToneType.mark_tone.equals(tone)){
        	// WITH_TONE_NUMBER(以数字代替声调：默认格式)、WITHOUT_TONE (无声调)、WITH_TONE_MARK (有声调，编码必须使用WITH_U_UNICODE)
        	format.setToneType(HanyuPinyinToneType.WITH_TONE_MARK);
        	// 以“吕”为例：WITH_U_AND_COLON（lu:3：默认格式）、WITH_U_UNICODE（lü3）、WITH_V（lv3）
        	format.setVCharType(HanyuPinyinVCharType.WITH_U_UNICODE);
        } else if(ToneType.num_tone.equals(tone)){
        	format.setToneType(HanyuPinyinToneType.WITH_TONE_NUMBER);
        	format.setVCharType(HanyuPinyinVCharType.WITH_V);
        } else{
        	format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        	format.setVCharType(HanyuPinyinVCharType.WITH_V);
        }
        
        StringBuilder sb = new StringBuilder();
        
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);
            // 提取汉字的首字母、拼音
			try {
				String[] pinyin = PinyinHelper.toHanyuPinyinStringArray(word, format);
//				pinyinArray = PinyinHelper.toTongyongPinyinStringArray(word);
//				pinyinArray = PinyinHelper.toYalePinyinStringArray(word);
//				pinyinArray = PinyinHelper.toWadeGilesPinyinStringArray(word);
			
//	            System.out.println(Arrays.toString(pinyinArray));
				
	            if (pinyin != null) {
	            	if(isFull){
	            		if(flag){
	            			sb.append(" "+pinyin[0]);
	            		}else{
	            			sb.append(pinyin[0]);
	            			flag = true;
	            		}
	            	}else{
	            		sb.append(pinyin[0].charAt(0));
	            	}
	            }else {
	                sb.append(word);
	                flag = false;
	            }
			} catch (Exception e) {
				e.printStackTrace();
				sb.append(word);
			}
        }
        String s = sb.toString();
        if(isTrim){
        	s.replace(" ", "");
        }
        return s;
    }

   /**
    * 判断字符串是否为空
    */

    private static boolean isNull(Object strData) {
        if (strData == null || String.valueOf(strData).trim().equals("")) {
            return true;
        }
        return false;
    }

	

}
