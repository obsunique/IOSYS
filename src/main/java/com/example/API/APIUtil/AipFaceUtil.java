package com.example.API.APIUtil;

import com.baidu.aip.face.AipFace;

public class AipFaceUtil {
	//设置APPID/AK/SK
    public String APP_ID = "";
    public String API_KEY = "";
    public String SECRET_KEY = "";
    public static AipFace client;

    public void init() {
        // 初始化一个AipFace
        client = new AipFace(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000); 
    }
}
