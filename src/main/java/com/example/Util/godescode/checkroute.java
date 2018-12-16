package com.example.Util.godescode;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class checkroute {

	public checkroute() {
		// TODO Auto-generated constructor stub
	}

	public void checkroute(String origin, String destination, String city, String cityd) throws JSONException {
		// 接口地址
		String requestUrl = "https://restapi.amap.com/v3/direction/transit/integrated";
		// params用于存储要请求的参数
		Map params = new HashMap();
		// showapi_appid的值，把###替换成你的appid
		params.put("key", "210311889288db9a8adc0a738b145554");
		// 我们请求的字符串
		params.put("origin", encode.encode(origin, city));
		// 数字签名，###填你的数字签名，可以在你的个人中心看到
		params.put("destination", encode.encode(destination, cityd));
		params.put("city", city);
		params.put("cityd", cityd);
		// 调用httpRequest方法，这个方法主要用于请求地址，并加上请求参数
		String string = httpRequest.httpRequest(requestUrl, params);
		// 处理返回的JSON数据并返回
		JSONObject requestjson = new JSONObject(string);

		requestjson = new JSONObject(requestjson.get("route").toString());

		JSONArray jsonArray = new JSONArray(requestjson.get("transits").toString());

		requestjson = new JSONObject(jsonArray.get(0).toString());

		System.out.println(requestjson.get("cost"));
	}

}
