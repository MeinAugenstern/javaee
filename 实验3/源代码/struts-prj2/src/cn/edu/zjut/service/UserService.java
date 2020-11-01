package cn.edu.zjut.service;

import cn.edu.zjut.bean.UserBean;

public class UserService {
	public boolean login(UserBean loginUser) { 
		if (loginUser.getAccount().equals(loginUser.getPassword())) { 
			return true; 
		}
		return false;
	}
	public boolean register(UserBean registerUser) { 
		//用户名与两次输入的密码相等并且用户名不为空时注册成功
		if(registerUser.getAccount()=="") return false;
		else if (registerUser.getAccount().equals(registerUser.getPassword())&&registerUser.getPassword().equals(registerUser.getRepassword())) { 
			return true; 
		}
		return false;	
	}
}