package com.example.PC.Users.servlet;

import java.util.List;

import com.example.pojo.Users;
import com.example.vo.UserAllMessage;

public interface UserServlet {

	public List<Users> checkUserMessage();// 查询用户注册信息

	public UserAllMessage checkUserAllMessage(int userid);// 查询用户全部信息

	public int updataUserState(Users user);// 更改用户状态
}
