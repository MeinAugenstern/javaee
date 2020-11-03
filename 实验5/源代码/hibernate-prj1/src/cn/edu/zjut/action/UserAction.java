package cn.edu.zjut.action;
import cn.edu.zjut.dao.*;
import cn.edu.zjut.service.*;
import cn.edu.zjut.po.*;
public class UserAction {
	private Customer loginUser;
	public Customer getLoginUser() { 
		return loginUser; 
		}
	public void setLoginUser(Customer loginUser) { 
		this.loginUser = loginUser; 
		}
	public String login() { 
		UserService userServ = new UserService(); 
		if (userServ.login(loginUser)) { 
			return "success"; 
			}return "fail"; 
		}
	public String register() { 
		UserService userServ = new UserService(); 
		userServ.register(loginUser); 
		return "registersuccess"; 
	}
}
