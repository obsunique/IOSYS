package com.example.Android.controller.message;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/android/User")
public class UserMessage {

	@RequestMapping("/check/isExist")
	public boolean userCheck(String userid) {

		return false;

	}
}
