package com.example.Android.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Android.servlet.LoginServlet;
import com.example.Android.servlet.UserMessageServlet;
import com.example.Util.SendPhoneCode.SendMessage;
import com.example.pojo.Users;

@RestController
@RequestMapping("/android/Login")
public class LoginController {

	@Autowired
	private LoginServlet loginservlet;
	@Autowired
	private UserMessageServlet usermessage;

	@RequestMapping("/helloworld")
	public String helloworld() {
		return "1";
	}

	/*
	 * 发送短信验证码
	 */
	@RequestMapping("/sendCode")
	public String sendCode(@RequestBody Users user) {
		String code = SendMessage.send(user.getUserphone());
		return code;
	}

	/*
	 * 用户注册 若账号存在则返回0（注册失败），不存在则返回1（注册成功）
	 */
	@RequestMapping("/register")
	public String userRegister(@RequestBody Users user) {
		String flag = loginservlet.userRegister(user) + "";
		return flag;
	}

	/*
	 * 通过手机号码查用户(non-Javadoc) 成功:Userid 密码错误:-1 账号不存在:-2 账号被禁用-3
	 * 通过邮箱号码查用户(non-Javadoc) 成功:Userid 密码错误:-1 账号不存在:-2账号被禁用-3
	 * 
	 * @see
	 * com.example.Android.servlet.login.LoginServlet#userPhoneLogin(java.lang.
	 * String, java.lang.String)
	 */
	@RequestMapping("/login")
	public String userLogin(@RequestBody Users user) {
		String flag = "0";
		if (user.getUserphone().indexOf("@") > 0)
			flag = loginservlet.userEmailLogin(user.getUserphone(), user.getUserpassword()) + "";
		else
			flag = loginservlet.userPhoneLogin(user.getUserphone(), user.getUserpassword()) + "";
		return flag;
	}

	/*
	 * 重置密码 若账号存在则返回-2（账号不存在），不存在则返回1（修改成功）
	 */
	@RequestMapping("/forget")
	public String userForget(@RequestBody Users user) {
		String number = user.getUserphone();
		String password = user.getUserpassword();
		String flag = "-2";

		try {
			if (number.indexOf("@") > 0)
				user.setUserid(usermessage.checkPerfectMessageByEmail(number).getUserid());
			else
				user.setUserid(loginservlet.checkUserByPhone(number).getUserid());
			if (user.getUserid() == null)
				return flag;
		} catch (Exception e) {
			return flag;
		}
		user.setUserpassword(password);
		flag = loginservlet.userUpdata(user) + "";
		return flag;
	}
}
