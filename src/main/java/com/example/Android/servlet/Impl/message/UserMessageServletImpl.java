package com.example.Android.servlet.Impl.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Android.servlet.UserMessageServlet;
import com.example.mapper.user_perfect.UserPerfectMapper;
import com.example.pojo.UserPerfect;
import com.example.pojo.UserPerfectExample;
import com.example.pojo.UserPerfectWithBLOBs;

@Service
public class UserMessageServletImpl implements UserMessageServlet {

	@Autowired
	private UserPerfectMapper userperfectmapper;

	/*
	 * 用户完善信息 若账号存在则返回0（失败），不存在则返回1（成功）
	 */
	@Override
	public int insertPerfectMessage(UserPerfectWithBLOBs userperfectWithBLOBs) {
		int flag = userperfectmapper.insertSelective(userperfectWithBLOBs);
		return flag;
	}

	/*
	 * 用户更新信息 若账号存在则返回0（注册失败），不存在则返回1（注册成功）
	 */
	@Override
	public int updataPerfectMessage(UserPerfectWithBLOBs userperfectWithBLOBs) {
		UserPerfectExample example = new UserPerfectExample();
		example.createCriteria().andUseridEqualTo(userperfectWithBLOBs.getUserid());
		int flag = userperfectmapper.updateByExampleSelective(userperfectWithBLOBs, example);
		return flag;
	}

	/*
	 * 用id查找用户完善信息
	 */
	@Override
	public UserPerfectWithBLOBs checkPerfectMessageById(int userid) {
		UserPerfect userperfect = new UserPerfect();
		userperfect.setUserid(userid);
		UserPerfectExample example = new UserPerfectExample();
		example.createCriteria().andUseridEqualTo(userid);
		List<UserPerfectWithBLOBs> userlist = userperfectmapper.selectByExampleWithBLOBs(example);
		if (userlist.size() > 0)
			return userlist.get(0);
		return null;
	}

	/*
	 * 用邮箱查找用户完善信息
	 */
	@Override
	public UserPerfectWithBLOBs checkPerfectMessageByEmail(String useremail) {
		UserPerfect userperfect = new UserPerfect();
		userperfect.setUseremail(useremail);
		UserPerfectExample example = new UserPerfectExample();
		example.createCriteria().andUseremailEqualTo(useremail);
		List<UserPerfectWithBLOBs> userlist = userperfectmapper.selectByExampleWithBLOBs(example);
		if (userlist.size() > 0)
			return userlist.get(0);
		return null;
	}
}
