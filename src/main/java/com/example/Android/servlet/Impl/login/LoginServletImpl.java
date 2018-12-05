package com.example.Android.servlet.Impl.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Android.servlet.login.LoginServlet;
import com.example.mapper.user.UsersMapper;
import com.example.pojo.UserPerfectExample;
import com.example.pojo.Users;
import com.example.pojo.UsersExample;

public class LoginServletImpl implements LoginServlet {

	@Autowired
	private UsersMapper usersmapper;

	/*
	 * 用户注册 若账号存在则返回false（注册失败），不存在则返回true（注册成功）
	 */
	@Override
	public boolean userRegister(Users user) {
		UsersExample example = new UsersExample();
		example.createCriteria().andUserpasswordEqualTo(user.getUserphone());
		List<Users> userlist = usersmapper.selectByExample(example);
		if (userlist.size() < 1) {
			user.setUsername(user.getUserphone());
			usersmapper.insertSelective(user);
			return true;
		}
		return false;
	}

	/*
	 * 通过手机号码查用户(non-Javadoc) 成功:Userid 密码错误:-1 账号不存在:-2
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
			if (userlist.get(0).getUserpassword().equals(password))
				return userlist.get(0).getUserid();
			else
				return -1;
		}
		return -2;
	}

	/*
	 * 通过邮箱号码查用户(non-Javadoc) 成功:Userid 密码错误:-1 账号不存在:-2
	 * 
	 * @see
	 * com.example.Android.servlet.login.LoginServlet#userPhoneLogin(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public int userEmailLogin(String emailnumber, String password) {
		UserPerfectExample userperfectexample = new UserPerfectExample();
		UsersExample example = new UsersExample();
		userperfectexample.createCriteria().andUseremailEqualTo(emailnumber);

		List<Users> userlist = usersmapper.selectByExample(example);
		if (userlist.size() > 0) {
			if (userlist.get(0).getUserpassword().equals(password))
				return 1;
			else
				return -1;
		}
		return -2;
	}
}
