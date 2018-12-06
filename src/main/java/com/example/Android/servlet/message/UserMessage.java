package com.example.Android.servlet.message;

import com.example.pojo.UserPerfectWithBLOBs;

public interface UserMessage {

	public int insertPerfectMessage(UserPerfectWithBLOBs userperfectWithBLOBs);// 插入用户完善信息

	public int updataPerfectMessage(UserPerfectWithBLOBs userperfectWithBLOBs);// 更新用户完善信息

	public UserPerfectWithBLOBs checkPerfectMessage(int userid);// 查询用户完善的信息

}
