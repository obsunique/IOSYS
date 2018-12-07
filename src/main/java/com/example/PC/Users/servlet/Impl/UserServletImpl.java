package com.example.PC.Users.servlet.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PC.Users.servlet.UserServlet;
import com.example.mapper.user.UsersMapper;
import com.example.mapper.user_perfect.UserPerfectMapper;
import com.example.pojo.UserPerfectExample;
import com.example.pojo.UserPerfectWithBLOBs;
import com.example.pojo.Users;
import com.example.pojo.UsersExample;
import com.example.vo.UserAllMessage;

@Service
public class UserServletImpl implements UserServlet {

	@Autowired
	private UsersMapper usersmapper;
	@Autowired
	private UserPerfectMapper userperfectmapper;

	@Override
	public List<Users> checkUserMessage() {
		UsersExample example = new UsersExample();
		List<Users> userlist = usersmapper.selectByExample(example);
		return userlist;
	}

	@Override
	public UserAllMessage checkUserAllMessage(int userid) {
		Users user = usersmapper.selectByPrimaryKey(userid);
		if (user != null) {
			UserPerfectExample example = new UserPerfectExample();
			example.createCriteria().andUseridEqualTo(userid);
			List<UserPerfectWithBLOBs> userperfectlist = userperfectmapper.selectByExampleWithBLOBs(example);
			UserAllMessage userallmessage = new UserAllMessage();
			userallmessage.setUser(user);
			userallmessage.setUserperfectWithBLOBs(userperfectlist.get(0));
			return userallmessage;
		}
		return null;
	}

	@Override
	public int updataUserState(Users user) {
		int flag = usersmapper.updateByPrimaryKeySelective(user);
		return flag;
	}

}
