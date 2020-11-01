package com.dom.controller;
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*;
import com.dom.model.*;
import com.dom.dao.*;

public class LoginController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		response.setContentType("text/html;charset=utf-8"); 
		//PrintWriter out=response.getWriter(); 
		String username = request.getParameter("username"); 
		String password = request.getParameter("password");
		String type = request.getParameter("type");//获取表单中的用户类型
		int type2 = Integer.parseInt(type);//将string数据转换成int
		UserBean user=new UserBean(); 
		user.setUsername(username); 
		user.setPassword(password);
		user.setType(type2);
		/*if("zjut".equals(username) && "zjut".equals(password)){ 
			out.println("登录成功，欢迎您！"); 
			}else{ 
				out.println("用户名或密码错误！"); 
				} 
		}*/
		if(checkUser(user)){ 
			request.setAttribute("USER", user); 
			RequestDispatcher dispatcher = request .getRequestDispatcher("/loginSuccess.jsp"); 
			dispatcher.forward(request, response); 
		}else{
			response.sendRedirect("/springtest/loginFailed.jsp"); 
			} 
		}
	/*boolean checkUser(UserBean user){
		if("user".equals(user.getType()) && "zjut".equals(user.getUsername()) && "zjut".equals(user.getPassword())) {
			return true; 
		}else{ 
			return false;
		} 
	}*/
		boolean checkUser(UserBean user) {
			UserDao ud=new UserDao(); 
			if( ud.searchUser(user) ) { 
				return true; 
				}
			return false;
		}
}
