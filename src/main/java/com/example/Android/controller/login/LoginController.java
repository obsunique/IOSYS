package com.example.Android.controller.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/android/Login")
public class LoginController {

	@RequestMapping("/register")
	public String userRegister(String phoneNumber) {

		return null;

	}
}
