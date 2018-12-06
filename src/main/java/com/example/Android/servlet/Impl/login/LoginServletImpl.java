package com.example.Android.servlet.Impl.login;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Android.servlet.login.LoginServlet;
import com.example.Util.MD5Util.MD5Tools;
import com.example.mapper.user.UsersMapper;
import com.example.mapper.user_perfect.UserPerfectMapper;
import com.example.pojo.UserPerfect;
import com.example.pojo.UserPerfectExample;
import com.example.pojo.UserPerfectWithBLOBs;
import com.example.pojo.Users;
import com.example.pojo.UsersExample;

public class LoginServletImpl implements LoginServlet {

	@Autowired
	private UsersMapper usersmapper;
	@Autowired
	private UserPerfectMapper userperfectmapper;

	/*
	 * 用户注册 若账号存在则返回0（注册失败），不存在则返回1（注册成功）
	 */
	@Override
	public int userRegister(Users user) {
		UsersExample example = new UsersExample();
		example.createCriteria().andUserpasswordEqualTo(user.getUserphone());
		List<Users> userlist = usersmapper.selectByExample(example);
		if (userlist.size() < 1) {
			user.setUsername(user.getUserphone());
			user.setUserpassword(MD5Tools.KL(MD5Tools.string2MD5(user.getUserpassword())));
			user.setCreatetime(new Date());
			usersmapper.insertSelective(user);
			UserPerfectWithBLOBs u = new UserPerfectWithBLOBs();
			u.setUserid(user.getUserid());
			userperfectmapper.insertSelective(u);
			return 1;
		}
		return 0;
	}

	/*
	 * 通过手机号码查用户(non-Javadoc) 成功:Userid 密码错误:-1 账号不存在:-2 账号被禁用-3
	 * 
	 * @see
	 * com.example.Android.servlet.login.LoginServlet#userPhoneLogin(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public int userPhoneLogin(String phonenumber, String password) {
		UsersExample example = new UsersExample();
		example.createCriteria().andUserpasswordEqualTo(phonenumber);
		List<Users> userlist = usersmapper.selectByExample(example);
		if (userlist.size() > 0) {
			if (userlist.get(0).getUserstatus() == 0)
				return -3;
			if (userlist.get(0).getIsdataflag() == -1)
				return -2;
			String m = MD5Tools.string2MD5(password);
			String n = MD5Tools.JM(userlist.get(0).getUserpassword());
			if (n.equals(m))
				return userlist.get(0).getUserid();
			else
				return -1;
		}
		return -2;
	}

	/*
	 * 通过邮箱号码查用户(non-Javadoc) 成功:Userid 密码错误:-1 账号不存在:-2账号被禁用-3
	 * 
	 * @see
	 * com.example.Android.servlet.login.LoginServlet#userPhoneLogin(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public int userEmailLogin(String emailnumber, String password) {
		UserPerfectExample userperfectexample = new UserPerfectExample();
		userperfectexample.createCriteria().andUseremailEqualTo(emailnumber);
		List<UserPerfect> userperfectlist = userperfectmapper.selectByExample(userperfectexample);
		if (userperfectlist.size() > 0) {
			Users user = usersmapper.selectByPrimaryKey(userperfectlist.get(0).getUserid());
			if (user != null) {
				if (user.getUserstatus() == 0)
					return -3;
				if (user.getIsdataflag() == -1)
					return -2;
				String m = MD5Tools.string2MD5(password);
				String n = MD5Tools.JM(user.getUserpassword());
				if (m.equals(n))
					return 1;
				else
					return -1;
			}
		}
		return -2;
	}

	// 更新用户信息
	@Override
	public int userUpdata(Users user) {
		int flag = usersmapper.updateByPrimaryKeySelective(user);
		return flag;
	}

	// 用id查找用户
	@Override
	public Users checkUserById(int userid) {
		Users user = usersmapper.selectByPrimaryKey(userid);
		return user;

	}

	// 用手机号码查找用户
	@Override
	public Users checkUserByPhone(String phoneNumber) {
		UsersExample example = new UsersExample();
		example.createCriteria().andUserphoneEqualTo(phoneNumber);
		List<Users> userlist = usersmapper.selectByExample(example);
		if (userlist.size() > 0)
			return userlist.get(0);
		return null;

	}
}
