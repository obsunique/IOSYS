package com.example.PC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Turning")
public class pageController
{
	@RequestMapping("/login")
	public String login()
	{
		return "management/login";
	}
}