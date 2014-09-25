package com.summer.taobao.spider;

import java.util.HashMap;
import java.util.Map;


public class Util {
	public static String getShopValue(String content,String id) {
		String [] values=content.split(";");
		Map<String, String> maps = new HashMap<String, String>();
		for(int i=0;i<values.length;i++){
			String [] value=values[i].split("=");
			if(value.length>=2){
				maps.put(value[0].trim(), value[1].trim());
			}
		}
		return maps.get(id);
	}
	
	
	public static void main(String[] args){
		String s="pageId=332718897;prototypeId=2;siteId=4; shopId=34153805; userid=53330269;";
		
		System.out.println(getShopValue(s,"shopId"));
	}
}
