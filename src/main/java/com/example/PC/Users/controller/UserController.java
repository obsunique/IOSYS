package com.example.PC.Users.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.PC.Users.servlet.UserServlet;
import com.example.pojo.Users;

@RestController
@RequestMapping("/pc/user")
public class UserController {

	private UserServlet userservlet;

	@RequestMapping("/checkUserMessage")
	public ModelAndView userMessageCheck() {
		ModelAndView mav = new ModelAndView();
		List<Users> userlist = userservlet.checkUserMessage();
		mav.addObject("userlist", userlist);
		mav.setViewName("/user");
		return mav;
	}
}
