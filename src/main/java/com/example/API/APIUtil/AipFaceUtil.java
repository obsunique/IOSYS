package com.example.API.APIUtil;

import com.baidu.aip.face.AipFace;

public class AipFaceUtil {
	//设置APPID/AK/SK
    public String APP_ID = "14980138";
    public String API_KEY = "fZGEqZroBTvQOy1dDOecwNed";
    public String SECRET_KEY = "s9DAlZjdzDn3BYr4Zs1EXOan0MWVWSQy";
    public static AipFace client;

    public void init() {
        // 初始化一个AipFace
        client = new AipFace(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000); 
    }
}
