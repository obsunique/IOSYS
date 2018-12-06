package com.example.vo;

import com.example.pojo.UserPerfectWithBLOBs;
import com.example.pojo.Users;

public class UserAllMessage {
	UserPerfectWithBLOBs userperfectWithBLOBs;
	Users user;

	public UserPerfectWithBLOBs getUserperfectWithBLOBs() {
		return userperfectWithBLOBs;
	}

	public void setUserperfectWithBLOBs(UserPerfectWithBLOBs userperfectWithBLOBs) {
		this.userperfectWithBLOBs = userperfectWithBLOBs;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

}
