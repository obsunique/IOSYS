package com.example.Util.godescode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class encode {

	public encode() {
		// TODO Auto-generated constructor stub
	}

	public static String encode(String subway,String cityname) //encode.encode("广州南站地铁站", "广州");
	{
		
		//接口地址
    	String requestUrl = "https://restapi.amap.com/v3/geocode/geo";  
    	//params用于存储要请求的参数
        Map params = new HashMap();
      //showapi_appid的值，把###替换成你的appid
        params.put("key","210311889288db9a8adc0a738b145554");
      //我们请求的字符串
        params.put("address",subway);
      //数字签名，###填你的数字签名，可以在你的个人中心看到
        params.put("city",cityname);
      //调用httpRequest方法，这个方法主要用于请求地址，并加上请求参数
        String string = httpRequest.httpRequest(requestUrl,params);
        //处理返回的JSON数据并返回
        JSONObject requestjson = new JSONObject(string);
    	
        JSONArray jsonArray = requestjson.getJSONArray("geocodes");
        
        requestjson = new JSONObject(jsonArray.get(0).toString());
        
        System.out.println(requestjson.get("location").toString());
        
        return requestjson.get("location").toString();
	}
		
}