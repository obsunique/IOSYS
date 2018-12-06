package com.example.Android.controller.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Android.servlet.login.LoginServlet;
import com.example.pojo.Users;

@RestController
@RequestMapping("/android/Login")
public class LoginController {

	private LoginServlet loginservlet;

	@RequestMapping("/register")
	public String userRegister(String phoneNumber, String password) {
		Users user = new Users();
		user.setUserphone(phoneNumber);
		user.setUserpassword(password);
		String flag = loginservlet.userRegister(user) + "";
		return flag;
	}
}
