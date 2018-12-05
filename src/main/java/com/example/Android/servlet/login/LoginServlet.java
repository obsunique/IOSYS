package com.example.Android.servlet.login;

import com.example.pojo.Users;

public interface LoginServlet {
	boolean userRegister(Users user);

	int userPhoneLogin(String phonenumber, String password);

	int userEmailLogin(String emailnumber, String password);
}
