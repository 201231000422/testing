package com.spe.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Date;

import com.spe.constrant.WebServiceConstrant;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonUtil {
	
	public static JSONObject okJs(Object obj){
		JSONObject object = new JSONObject();
		JSONArray jsArray = new JSONArray();
		object.put("result", WebServiceConstrant.OK);
		jsArray.add(obj);
		object.put("data",jsArray);
		return object;
		
	}
	
	public static JSONObject errorJs(Object obj){
		JSONObject object = new JSONObject();
		JSONArray jsArray = new JSONArray();
		object.put("result", WebServiceConstrant.Error);
		jsArray.add(obj);
		object.put("data",jsArray);
		return object;
	}
}
