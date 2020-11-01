package cn.edu.zjut.action;

import cn.edu.zjut.bean.ShoppingCart;
import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.service.UserService;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/*基础实验
public class UserAction {
	private static Integer count=0; 
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
	public UserAction(){ 
		System.out.println("创建了一个 UserAction 类对象。"); 
		}
	public Integer getCount() {
		return count; 
		}
	public String login() {
		count++;//Action实例化情况测试
		UserService userServ = new UserService(); 
		if (userServ.login(loginUser)) { 
			return "success"; 
			} 
		return "fail"; 
		}
	public String register() { 
		UserService userServ = new UserService(); 
		if (userServ.register(registerUser)) { 
			return "registersuccess"; 
			} 
		return "registerfail"; 
		}
}*/
/*
public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
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
	public void validate() { 
		String account = loginUser.getAccount(); 
		String pwd = loginUser.getPassword(); 
		if (account == null || account.equals("")) { 
			this.addFieldError("loginUser.account",this.getText("login.account.null")); 
			}
		if (pwd == null || pwd.equals("")) { 
			this.addFieldError("loginUser.password",this.getText("login.password.null")); 
			} 
		}
	public String login() {
		UserService userServ = new UserService(); 
		if (userServ.login(loginUser)) { 
			this.addActionMessage(this.getText("login.success"));
			return "success"; 
			} else { 
				this.addActionError(this.getText("login.error")); 
				return "fail"; 
			}
		}
	public String register() { 
		UserService userServ = new UserService(); 
		if (userServ.register(registerUser)) { 
			return "registersuccess"; 
			} 
		return "registerfail"; 
		}
}
*/
//提高实验
/*
public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
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
	public void validateLogin() {
		String account = loginUser.getAccount(); 
		String pwd = loginUser.getPassword(); 
	
		if (account == null || account.equals("")) { 
			this.addFieldError("loginUser.account",this.getText("login.account.null")); 
			}
		if (pwd == null || pwd.equals("")) { 
			this.addFieldError("loginUser.password",this.getText("login.password.null")); 
			} 
	}
	public void validateRegister() {
		String account = registerUser.getAccount(); 
		String pwd = registerUser.getPassword(); 
	
		if (account == null || account.equals("")) { 
			this.addFieldError("registerUser.account",this.getText("login.account.null")); 
			}
		if (pwd == null || pwd.equals("")) { 
			this.addFieldError("registerUser.password",this.getText("login.password.null")); 
			} 
		String repwd = registerUser.getRepassword();
		String email = registerUser.getEmail();
		if(!pwd.equals(repwd)) {
			this.addFieldError("registerUser.repassword","两次密码输入不一致");
			}
		if(!dataPass(email,"^[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}$")) {
			this.addFieldError("registerUser.email", "邮箱格式不正确");
			}
	}
	private boolean dataPass(String str,String regEx)

	 {
	  Pattern pattern=Pattern.compile(regEx,Pattern.CASE_INSENSITIVE);
	  Matcher matcher =pattern.matcher(str);
	  return matcher.matches();
	 }
	public String login() {
		UserService userServ = new UserService(); 
		if (userServ.login(loginUser)) { 
			this.addActionMessage(this.getText("login.success"));
			return "success"; 
			} else { 
				this.addActionError(this.getText("login.error")); 
				return "fail"; 
			}
		}
	public String register() { 
		UserService userServ = new UserService(); 
		if (userServ.register(registerUser)) { 
			return "registersuccess"; 
			} 
		return "registerfail"; 
		}
}

/*拓展实验 版本1
public class UserAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{
	private static final long serialVersionUID = 1L;
	private UserBean loginUser; 
	private UserBean registerUser;
	private Map<String,Object> request,session,application;
	public void setRequest(Map<String, Object> request) {
		this.request=request; 
		}
	public void setSession(Map<String, Object> session) { 
		this.session=session; 
		}
	public void setApplication(Map<String, Object> application) { 
		this.application=application; 
		}
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
	public void validate() { 
		String account = loginUser.getAccount(); 
		String pwd = loginUser.getPassword(); 
	
		if (account == null || account.equals("")) { 
			this.addFieldError("loginUser.account",this.getText("login.account.null")); 
			}
		if (pwd == null || pwd.equals("")) { 
			this.addFieldError("loginUser.password",this.getText("login.password.null")); 
			} 
		}
	public String login() {
		//ActionContext ctx= ActionContext.getContext(); 
		//通过 ActionContext 对象获取请求、会话和上下文对象相关联的 Map 对象 
		//request=(Map) ctx.get("request"); 
		//session=(Map) ctx.getSession(); 
		//application=(Map) ctx.getApplication(); 
		//访问 application 范围的属性值 
		Integer counter = (Integer)application.get("counter");
		if(counter==null) 
			counter=1; 
		else
			counter=counter+1;
		application.put("counter", counter);
		UserService userServ = new UserService(); 
		if (userServ.login(loginUser)) { 
			this.addActionMessage(this.getText("login.success"));
			session.put("user", loginUser.getAccount());
			request.put("tip", "您已登录成功");
			return "success"; 
			} else { 
				this.addActionError(this.getText("login.error")); 
				return "fail"; 
			}
		}
	public String register() { 
		UserService userServ = new UserService(); 
		if (userServ.register(registerUser)) { 
			return "registersuccess"; 
			} 
		return "registerfail"; 
		}
}
 */
/*版本2
 public class UserAction extends ActionSupport implements ServletContextAware, ServletRequestAware,ServletResponseAware{
	private static final long serialVersionUID = 1L;
	private UserBean loginUser; 
	private UserBean registerUser;
	private ServletContext application;         // Servlet上下文  
	private HttpServletRequest request;         // request对象  
	private HttpServletResponse response;           // response对象  
	private Map session; 
	 public void setServletRequest(HttpServletRequest request) {  
         this.request = request;  
	 	}  
	 public void setServletResponse(HttpServletResponse response) {  
		 this.response = response;  
	 	}  
	 public void setSession(Map sessionValues) { 
		 this.session = sessionValues;  
		}  
	 public void setServletContext(ServletContext application) {  
		 this.application = application;  
		}  
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
	public void validate() { 
		String account = loginUser.getAccount(); 
		String pwd = loginUser.getPassword(); 
	
		if (account == null || account.equals("")) { 
			this.addFieldError("loginUser.account",this.getText("login.account.null")); 
			}
		if (pwd == null || pwd.equals("")) { 
			this.addFieldError("loginUser.password",this.getText("login.password.null")); 
			} 
		}
	public String login() {
		Integer counter = (Integer)application.getAttribute("counter");
		if(counter==null) 
			counter=1; 
		else
			counter=counter+1;
		application.setAttribute("counter", counter);
		UserService userServ = new UserService(); 
		if (userServ.login(loginUser)) { 
			this.addActionMessage(this.getText("login.success"));
			session.put("user", loginUser.getAccount());
			request.setAttribute("tip", "您已登录成功");
			return "success"; 
			} else { 
				this.addActionError(this.getText("login.error")); 
				return "fail"; 
			}
		}
	public String register() { 
		UserService userServ = new UserService(); 
		if (userServ.register(registerUser)) { 
			return "registersuccess"; 
			} 
		return "registerfail"; 
		}
}
*/
/*ServletActionContext 工具类
public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private UserBean loginUser; 
	private UserBean registerUser;         // Servlet上下文  
	private HttpServletRequest request=ServletActionContext.getRequest();         // request对象  
	private HttpServletResponse response=ServletActionContext.getResponse();           // response对象 
	ServletContext application = ServletActionContext.getServletContext();
	HttpSession session=request.getSession(); 
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
	public void validate() { 
		String account = loginUser.getAccount(); 
		String pwd = loginUser.getPassword(); 
	
		if (account == null || account.equals("")) { 
			this.addFieldError("loginUser.account",this.getText("login.account.null")); 
			}
		if (pwd == null || pwd.equals("")) { 
			this.addFieldError("loginUser.password",this.getText("login.password.null")); 
			} 
		}
	public String login() {
		Integer counter = (Integer)request.getAttribute("counter");
		if(counter==null) 
			counter=1; 
		else
			counter=counter+1;
		request.setAttribute("counter", counter);
		UserService userServ = new UserService(); 
		if (userServ.login(loginUser)) { 
			this.addActionMessage(this.getText("login.success"));
			session.put("user", loginUser.getAccount());
			request.put("tip", "您已登录成功");
			return "success"; 
			} else { 
				this.addActionError(this.getText("login.error")); 
				return "fail"; 
			}
		}
	public String register() { 
		UserService userServ = new UserService(); 
		if (userServ.register(registerUser)) { 
			return "registersuccess"; 
			} 
		return "registerfail"; 
		}
}*/
//购物车

public class UserAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{
	private static final long serialVersionUID = 1L;
	private UserBean loginUser; 
	private UserBean registerUser;
	private Map<String,Object> request,session,application;
	public void setRequest(Map<String, Object> request) {
		this.request=request; 
		}
	public void setSession(Map<String, Object> session) { 
		this.session=session; 
		}
	public void setApplication(Map<String, Object> application) { 
		this.application=application; 
		}
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
	public void validate() { 
		String account = loginUser.getAccount(); 
		String pwd = loginUser.getPassword(); 
	
		if (account == null || account.equals("")) { 
			this.addFieldError("loginUser.account",this.getText("login.account.null")); 
			}
		if (pwd == null || pwd.equals("")) { 
			this.addFieldError("loginUser.password",this.getText("login.password.null")); 
			} 
		}
	public String login() {
		ShoppingCart cart = new ShoppingCart();
		UserService userServ = new UserService(); 
		if (userServ.login(loginUser)) { 
			this.addActionMessage(this.getText("login.success"));
			session.put("shoppingcart", cart);
			return "success"; 
			} else { 
				this.addActionError(this.getText("login.error")); 
				return "fail"; 
			}
		}
	public String register() { 
		UserService userServ = new UserService(); 
		if (userServ.register(registerUser)) { 
			return "registersuccess"; 
			} 
		return "registerfail"; 
		}
}