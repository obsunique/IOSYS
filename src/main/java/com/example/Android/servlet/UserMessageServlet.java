package com.example.Android.servlet;

import com.example.pojo.UserPerfectWithBLOBs;

public interface UserMessageServlet {

	public int insertPerfectMessage(UserPerfectWithBLOBs userperfectWithBLOBs);// 插入用户完善信息

	public int updataPerfectMessage(UserPerfectWithBLOBs userperfectWithBLOBs);// 更新用户完善信息

	public UserPerfectWithBLOBs checkPerfectMessageById(int userid);// 查询用户完善的信息

	public UserPerfectWithBLOBs checkPerfectMessageByEmail(String useremail);// 查询用户完善的信息

}
