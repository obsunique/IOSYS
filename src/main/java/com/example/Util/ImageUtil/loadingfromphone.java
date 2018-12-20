package com.example.Util.ImageUtil;

import java.io.FileOutputStream;
import java.io.OutputStream;

import com.alibaba.druid.util.Base64;

import io.netty.handler.codec.base64.Base64Decoder;

public class loadingfromphone {

	public boolean GenerateImage(String imgStr,String src,String imgname)  
    {   //对字节数组字符串进行Base64解码并生成图片  
        if (imgStr == null) //图像数据为空  
            return false;  
        Base64 decoder = new Base64();  
        
        try   
        {  
            //Base64解码  
            byte[] b =  decoder.base64ToByteArray(imgStr);
            for(int i=0;i<b.length;++i)  
            {  
                if(b[i]<0)  
                {//调整异常数据  
                    b[i]+=256;  
                }  
            }  
            //生成jpeg图片  
            String imgFilePath = src+imgname;//新生成的图片 头像路径 /root/Turning/avatar/  人脸路径 /root/Turning/facedata/
            OutputStream out = new FileOutputStream(imgFilePath);      
            out.write(b);  
            out.flush();  
            out.close();  
            return true;  
        }   
        catch (Exception e)   
        {  
            return false;  
        }  
    }  

}
