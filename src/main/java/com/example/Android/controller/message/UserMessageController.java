package com.example.Android.controller.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Android.servlet.LoginServlet;
import com.example.Android.servlet.UserMessageServlet;
import com.example.pojo.UserPerfectWithBLOBs;
import com.example.pojo.Users;
import com.example.vo.UserAllMessage;

@RestController
@RequestMapping("/android/User")
public class UserMessageController {

	@Autowired
	private LoginServlet loginservlet;
	@Autowired
	private UserMessageServlet usermessage;

	// 完善用户信息
	@RequestMapping("/insertUserPerfectMesaage")
	public String userPerfectMesaageInsert(@RequestBody UserPerfectWithBLOBs userperfectWithBLOBs) {
		String flag = usermessage.insertPerfectMessage(userperfectWithBLOBs) + "";
		return "{\"flag\":" + flag + "}";
	}

	// 更新用户信息
	@RequestMapping("/updataUserPerfectMesaage")
	public String userPerfectMesaageUpdata(@RequestBody UserPerfectWithBLOBs userperfectWithBLOBs) {
		System.out.println(userperfectWithBLOBs.toString());
		int flag = 0;
		UserPerfectWithBLOBs us = null;
		if (userperfectWithBLOBs.getUseremail() != null) {
			us = usermessage.checkPerfectMessageByEmail(userperfectWithBLOBs.getUseremail());
		}
		if (us == null)
			flag = usermessage.updataPerfectMessage(userperfectWithBLOBs);
		System.out.println(flag);
		return "{\"flag\":" + flag + "}";
	}

	// 更新用户昵称
	@RequestMapping("/updataUserName")
	public String updataUserName(@RequestBody Users user) {
		int flag = loginservlet.userUpdata(user);
		return "{\"flag\":" + flag + "}";
	}

	// 更换手机号码
	@RequestMapping("/updataUserPhone")
	public String updataUserPhone(@RequestBody Users user) {
		Users users = loginservlet.checkUserByPhone(user.getUserphone());
		int flag = 0;
		if (users == null)
			flag = loginservlet.userUpdata(user);
		return "{\"flag\":" + flag + "}";
	}

	// 查找用户全部信息
	@RequestMapping("/checkUserPerfectMesaage")
	public UserAllMessage userPerfectMessageCheck(@RequestBody UserPerfectWithBLOBs userperfectWithBLOBs) {
		int userid = userperfectWithBLOBs.getUserid();
		UserAllMessage userAllmessage = new UserAllMessage();
		userAllmessage.setUser(loginservlet.checkUserById(userid));
		userAllmessage.setUserperfectWithBLOBs(usermessage.checkPerfectMessageById(userid));
		if (userAllmessage.getUser() == null)
			return null;
		return userAllmessage;
	}

	// 上传头像

	// 上传脸部图片
}
