package com.example.Android.servlet.login;

import com.example.pojo.Users;

public interface LoginServlet {

	public int userRegister(Users user);// 注册

	public int userPhoneLogin(String phonenumber, String password);// 手机号码登录

	public int userEmailLogin(String emailnumber, String password);// 邮箱登录

	public int userUpdata(Users user);// 更改用户数据

	public Users checkUser(int userid); // 查找用户数据

}
