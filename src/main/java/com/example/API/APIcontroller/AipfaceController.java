package com.example.API.APIcontroller;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.aip.face.FaceVerifyRequest;
import com.example.API.APIBean.AipBean;
import com.example.API.APIUtil.AipFaceUtil;

@RestController
@RequestMapping("/Aipface")
public class AipfaceController {

	@RequestMapping("/detect") // 人脸检测
	private JSONObject detect(@RequestBody AipBean aipBean) // 传递Imagein
	{
		// 传入可选参数调用接口
		HashMap<String, String> options = new HashMap<String, String>();
		// 检测属性
		options.put("face_field", "quality");
		// 检测脸的数量
		options.put("max_face_num", "1");
		// LIVE相册，摄像头照片
		options.put("face_type", "LIVE");
		// 图片URL地址
		String image = aipBean.getImagein();
		// 选择图片传入类型为URL
		String imageType = "BASE64";
		// 人脸检测
		JSONObject res = AipFaceUtil.client.detect(image, imageType, options);
		// 输出
		System.out.println(res.toString());
		// 返回
		return res;
	}

	@RequestMapping("/search") // 人脸搜索
	private JSONObject search(@RequestBody AipBean aipBean) // 传递Imagein,group
	{
		// 传入可选参数调用接口
		HashMap<String, String> options = new HashMap<String, String>();
		options.put("quality_control", "HIGH"); // 照片质量
		options.put("liveness_control", "HIGH"); // 活体判断
		options.put("max_user_num", "1"); // 检索最相似的一个
		String image = aipBean.getImagein();
		String imageType = "BASE64";
		String groupIdList = aipBean.getGroup(); // 指定分组,String中用逗号隔开
		// 人脸搜索
		JSONObject res = AipFaceUtil.client.search(image, imageType, groupIdList, options);
		System.out.println(res.toString());
		return res;
	}

	@RequestMapping("/addUser") // 人脸注册
	private JSONObject addUser(@RequestBody AipBean aipBean) // 传递imagein，group，user，userinfo
	{
		// 传入可选参数调用接口
		HashMap<String, String> options = new HashMap<String, String>();
		options.put("user_info", aipBean.getUserinfo()); // 存储的用户辅助信息
		options.put("quality_control", "HIGH"); // 照片质量
		options.put("liveness_control", "HIGH"); // 活体检测程度
		String image = aipBean.getImagein();
		String imageType = "BASE64";
		String groupId = aipBean.getGroup(); // 要进行注册的用户组
		String userId = aipBean.getUser(); // 要进行注册的用户
		// 人脸注册
		JSONObject res = AipFaceUtil.client.addUser(image, imageType, groupId, userId, options);
		System.out.println(res.toString());
		return res;
	}

	@RequestMapping("/updateUser") // 人脸更新
	private JSONObject updateUser(@RequestBody AipBean aipBean)// 传递imagein，group，user，userinfo
	{
		// 传入可选参数调用接口
		HashMap<String, String> options = new HashMap<String, String>();
		options.put("user_info", aipBean.getUserinfo()); // 存储的用户辅助信息
		options.put("quality_control", "HIGH"); // 照片质量
		options.put("liveness_control", "HIGH"); // 活体检测程度
		String image = aipBean.getImagein();
		String imageType = "BASE64";
		String groupId = aipBean.getGroup(); // 要进行注册的用户组
		String userId = aipBean.getUser(); // 要进行注册的用户
		// 人脸更新
		JSONObject res = AipFaceUtil.client.updateUser(image, imageType, groupId, userId, options);
		System.out.println(res.toString());
		return res;
	}

	@RequestMapping("/faceGetlist") // 获取人脸列表
	private JSONObject faceGetlist(@RequestBody AipBean aipBean)// 传递group，user
	{
		// 传入可选参数调用接口
		HashMap<String, String> options = new HashMap<String, String>();
		String userId = aipBean.getUser(); // 要进行注册的用户
		String groupId = aipBean.getGroup(); // 要进行注册的用户组
		// 获取用户人脸列表
		JSONObject res = AipFaceUtil.client.faceGetlist(userId, groupId, options);
		System.out.println(res.toString());
		return res;
	}

	@RequestMapping("/userCopy") // 复制用户到新的组
	private JSONObject userCopy(@RequestBody AipBean aipBean) // 传递fromgroup,togroup,user
	{
		// 传入可选参数调用接口
		HashMap<String, String> options = new HashMap<String, String>();
		options.put("src_group_id", aipBean.getFromgroup()); // 要复制的组
		options.put("dst_group_id", aipBean.getTogroup()); // 目标组
		String userId = aipBean.getUser(); // 要复制的用户id
		// 复制用户
		JSONObject res = AipFaceUtil.client.userCopy(userId, options);
		System.out.println(res.toString());
		return res;
	}

	@RequestMapping("/groupAdd") // 创建用户组
	private JSONObject groupAdd(@RequestBody AipBean aipBean) // 传递group
	{
		// 传入可选参数调用接口
		HashMap<String, String> options = new HashMap<String, String>();
		String groupId = aipBean.getGroup(); // 组名
		// 创建用户组
		JSONObject res = AipFaceUtil.client.groupAdd(groupId, options);
		System.out.println(res.toString());
		return res;
	}

	@RequestMapping("/groupDelete") // 删除用户组
	private JSONObject groupDelete(@RequestBody AipBean aipBean) // 传递group
	{
		// 传入可选参数调用接口
		HashMap<String, String> options = new HashMap<String, String>();
		String groupId = aipBean.getGroup(); // 组名
		// 删除用户组
		JSONObject res = AipFaceUtil.client.groupDelete(groupId, options);
		System.out.println(res.toString());
		return res;
	}

}
