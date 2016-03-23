package com.ninesale.valinor.item.provider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ninesale.valinor.item.provider.model.DtoItemAttribute;

public class BaseTest {

	@Autowired(required = false)
	public static void main(String[] args) {
		test1();
		//getObject();
	}
	
	public static void test1(){
		String strJson = "[{'url':'www.baidu.com'},{'url':'www.baidu.com1'},{'url':'www.baidu.com3'}]";
		try {
			JSONArray jsonArray = JSONArray.parseArray(strJson);
			
			for(int i=0;i<jsonArray.size();i++){
				JSONObject object = (JSONObject) jsonArray.get(i);
				object.get("url");
				System.out.println(object.get("url")); 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getObject(){
		String strJson = "";
		strJson+=strJson+"{"
           +" 'code': 0,"
           +" 'desc': 'success',"
           +" 'data': ["
		   +"     {"
		   +"         'id': '11',"
		   +"         'attrName': '颜色',"
		   +"         'categId': '3',"
		   +"         'attrContext': '属性描述',"
		   +"         'validFlag': '1',"
		   +"         'modifyUserId': '10004',"
		   +"         'modifyUserName': '张三',"
		   +"         'createTime': '2015-11-04 16:47:01',"
		   +"         'updateTime': '2015-11-04 16:47:02'"
		   +"     },"
		   +"     {"
		   +"        'id': '12',"
		   +"         'attrName': '颜色2',"
		   +"         'categId': '3',"
		   +"         'attrContext': '属性描述2',"
		   +"         'validFlag': '0',"
		   +"         'modifyUserId': '10004',"
		   +"         'modifyUserName': '张三2',"
		   +"         'createTime': '2015-11-04 16:47:10',"
		   +"         'updateTime': '2015-11-04 16:47:09'"
		   +"     }"
		   +" ],"
		   +" 'tid': 'fcdf6c8a85cd34faa24eb58c1c06ffb5'"
		   +"}";
		
		try {
			List<DtoItemAttribute> list = new ArrayList<DtoItemAttribute>();
			DtoItemAttribute dto;
			JSONObject jsonObject = JSONObject.parseObject(strJson); 
			System.out.println(jsonObject); 
			System.out.println(jsonObject.get("desc")); 
			System.out.println(jsonObject.get("data")); 
			JSONArray obj = (JSONArray) jsonObject.get("data");
			System.out.println(obj.size()); 
			for(int i=0;i<obj.size();i++){
				dto = JSONObject.toJavaObject(obj.getJSONObject(i), DtoItemAttribute.class);
				list.add(dto);
			}
			System.out.println(list.toString()); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
