package com.example.Android.servlet.Impl.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Android.servlet.message.UserMessage;
import com.example.mapper.user_perfect.UserPerfectMapper;
import com.example.pojo.UserPerfect;
import com.example.pojo.UserPerfectExample;
import com.example.pojo.UserPerfectWithBLOBs;

public class UserMessageImpl implements UserMessage {

	@Autowired
	private UserPerfectMapper userperfectmapper;

	@Override
	public int insertPerfectMessage(UserPerfectWithBLOBs userperfectWithBLOBs) {
		int flag = userperfectmapper.insertSelective(userperfectWithBLOBs);
		return flag;
	}

	@Override
	public int updataPerfectMessage(UserPerfectWithBLOBs userperfectWithBLOBs) {
		UserPerfectExample example = new UserPerfectExample();
		example.createCriteria().andUseridEqualTo(userperfectWithBLOBs.getUserid());
		int flag = userperfectmapper.updateByExampleSelective(userperfectWithBLOBs, example);
		return flag;
	}

	@Override
	public UserPerfectWithBLOBs checkPerfectMessage(int userid) {
		UserPerfect userperfect = new UserPerfect();
		userperfect.setUserid(userid);
		UserPerfectExample example = new UserPerfectExample();
		example.createCriteria().andUseridEqualTo(userid);
		List<UserPerfectWithBLOBs> userlist = userperfectmapper.selectByExampleWithBLOBs(example);
		if (userlist.size() > 0)
			return userlist.get(0);
		return null;
	}

}
