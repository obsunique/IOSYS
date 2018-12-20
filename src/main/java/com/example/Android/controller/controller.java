package com.example.Android.controller;


import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.Util.ImageUtil.loadingfromphone;
import com.example.vo.uploadBean;

@RestController
@RequestMapping("/android")
public class controller {
	
	@RequestMapping("/uploadPicture")
	public void upload(@RequestBody uploadBean uploadBean)  //头像路径 /root/Turning/avatar/  人脸路径 /root/Turning/facedata/   getImgname格式:****.jpeg
	{
		loadingfromphone uploadphone = new loadingfromphone();
		uploadphone.GenerateImage(uploadBean.getImgStr(),uploadBean.getSrc(),uploadBean.getImgname());
	}
}
