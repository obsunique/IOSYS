package com.example.PC.Admins.servlet.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.PC.Admins.servlet.AdminServlet;
import com.example.mapper.user.AdminsMapper;
import com.example.pojo.Admins;
import com.example.pojo.AdminsExample;

public class AdminServletImpl implements AdminServlet {

	@Autowired
	private AdminsMapper adminmapper;

	// 管理员登录 成功1 密码错误-1 账号不存在-2
	@Override
	public int adminLogin(Admins admin) {
		AdminsExample example = new AdminsExample();
		example.createCriteria().andAdminidEqualTo(admin.getAdminid());
		List<Admins> adminlist = adminmapper.selectByExample(example);
		if (adminlist.size() > 0) {
			if (adminlist.get(0).getAdminpwd().equals(admin.getAdminpwd()))
				return 1;
			else
				return -1;
		}
		return -2;
	}

}
