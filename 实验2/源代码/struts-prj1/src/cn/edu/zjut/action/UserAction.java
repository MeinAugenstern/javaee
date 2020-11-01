package cn.edu.zjut.action;
import cn.edu.zjut.bean.UserBean; 
import cn.edu.zjut.service.UserService;

/*版本1
public class UserAction {
	private UserBean loginUser; 
	public UserBean getLoginUser() { 
		return loginUser; 
	}
	public void setLoginUser(UserBean loginUser) { 
		this.loginUser = loginUser; 
	}
	public String execute() {
		UserService userServ = new UserService(); 
		if (userServ.login(loginUser)) { 
			return "success"; 
			}
		return "fail";
	}
}*/
/*版本2
public class UserAction {
	private String password;
	private String account;
	
	public String execute() {
		if (getPassword().equals(getAccount())) { 
			return "success"; 
			}
		return "fail";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
}
*/
//版本3
/*
public class UserAction {
	private UserBean loginUser; 
	public UserBean getLoginUser() { 
		return loginUser; 
	}
	public void setLoginUser(UserBean loginUser) { 
		this.loginUser = loginUser; 
	}
	public String execute() {
		UserService userServ = new UserService(); 
		if (userServ.login(loginUser)) { 
			return "success"; 
			}
		return "fail";
	}
}*/
//提高实验
public class UserAction {
	private UserBean loginUser; 
	private UserBean registerUser;
	public UserBean getRegisterUser() {
		return registerUser;
	}
	public void setRegisterUser(UserBean registerUser) {
		this.registerUser = registerUser;
	}
	public UserBean getLoginUser() { 
		return loginUser; 
	}
	public void setLoginUser(UserBean loginUser) { 
		this.loginUser = loginUser; 
	}
	public String execute() {
		//先判断有无登录请求，无登录请求时再判断注册请求
		UserService userServ = new UserService(); 
		if(loginUser!=null) {
			if (userServ.login(loginUser)) { 
			return "success"; 
			}
		 return "fail";
		}
		else if(userServ.register(registerUser)) {
			return "regsuccess";
		}
		return "regfail";
	}
}