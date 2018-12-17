package com.example.PC.Admins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PC.Admins.servlet.AdminServlet;
import com.example.pojo.Admins;

@RestController
@RequestMapping("/pc/admin")
public class AdminController {
	@Autowired
	private AdminServlet adminservlet;

	@RequestMapping("/login")
	public String adminLogin(@Requestbody Admins admin,HttpServletResponse response) {
		int flag = adminservlet.adminLogin(admin);
		if (flag == 1) {
			String time = System.currentTimeMillis()+"";
			Cookie cookie = new Cookie("TOKEN_ADMIN" , admin);
			cookie.setMaxAge(60*60*24*7);
			response.addCookie(cookie);
		}
		return "{\"flag\":" + flag + "}";
	}
}
