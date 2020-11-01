package cn.edu.zjut.action;
import com.opensymphony.xwork2.ActionContext;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;
import cn.edu.zjut.bean.*;
import cn.edu.zjut.service.*;
/*版本1
public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private UserBean loginUser; 
	private Map session;
	public UserBean getLoginUser() { 
		return loginUser; 
	}
	public void setLoginUser(UserBean loginUser) { 
		this.loginUser = loginUser; 
	}
	public String login() {
		ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		UserService userServ = new UserService(); 
		try {
			if (userServ.login(loginUser)) { 
			session.put("user", loginUser.getAccount());
			return "success"; 
			} else { 
				return "fail"; 
			}
		}catch (Exception e) { 
			e.printStackTrace(); 
			return "exception"; 
			}
		}
}*/
public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private UserBean loginUser; 
	private Map session;
	public UserBean getLoginUser() { 
		return loginUser; 
	}
	public void setLoginUser(UserBean loginUser) { 
		this.loginUser = loginUser; 
	}
	public String login() throws Exception{
		ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		UserService userServ = new UserService(); 
		try {
			if (userServ.login(loginUser)) { 
			session.put("user", loginUser.getAccount());
			return "success"; 
			} else { 
				return "fail"; 
			}
		}catch (Exception e) { 
			throw e;
			}
		}
}