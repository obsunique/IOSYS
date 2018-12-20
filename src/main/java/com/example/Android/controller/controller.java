package com.example.Android.controller;


import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.Android.servlet.UserMessageServlet;
import com.example.PC.Users.servlet.UserServlet;
import com.example.Util.ImageUtil.loadingfromphone;
import com.example.pojo.UserPerfectWithBLOBs;
import com.example.vo.downloadBean;
import com.example.vo.uploadBean;

@RestController
@RequestMapping("/android")
public class controller {
	
	@Autowired
	private UserMessageServlet usermessage;
	
	@RequestMapping("/uploadPicture")
	public String upload(@RequestBody uploadBean uploadBean)  //头像路径 /root/Turning/avatar/  人脸路径 /root/Turning/facedata/   getImgname格式:****.jpeg
	{
		loadingfromphone uploadphone = new loadingfromphone();
		uploadphone.GenerateImage(uploadBean.getImgStr(),uploadBean.getSrc(),uploadBean.getImgname());
		String src = uploadBean.getImgStr()+uploadBean.getImgname();
		UserPerfectWithBLOBs userperfectWithBLOBs = new UserPerfectWithBLOBs();
		userperfectWithBLOBs.setUserid(uploadBean.getUserid());
		userperfectWithBLOBs.setUserphoto(src);
		System.out.println(uploadBean.getUserid());
		System.out.println(src);
		System.out.println(userperfectWithBLOBs.toString());
		int flag =usermessage.updataPerfectMessage(userperfectWithBLOBs);
		return "{\"flag\":" + flag + "}";
	}
	
	@RequestMapping("/downloadPicture")
	public String download(@RequestBody downloadBean downloadBean)
	{
		
		String base64 = "";
		String src = downloadBean.getSrc();
		System.out.println(src);
		InputStream in = null;
		byte[] data = null;
 
		// 读取图片字节数组
		try {
			in = new FileInputStream(src);
			
			data = new byte[in.available()];
			in.read(data);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("读取失败");
			base64 = "read faild";
		}
		// 对字节数组Base64编码
		Base64 encoder = new Base64();
 
		base64 = encoder.encodeAsString(data);

		return "{\"Base64\":" + base64 + "}";
	}
}
