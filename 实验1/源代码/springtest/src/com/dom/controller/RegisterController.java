package com.dom.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dom.dao.UserDao;
import com.dom.model.UserBean;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username"); 
		String password = request.getParameter("password1");
		UserBean user=new UserBean(); 
		user.setUsername(username); 
		user.setPassword(password);
		user.setType(2);
		if(checkUser(user)){ 
			//如果不存在该用户，则将注册的用户信息添加到表中，并转到注册成功的页面中
			UserDao ud=new UserDao(); 
			ud.insertUser(user);
			request.setAttribute("USER", user); 
			RequestDispatcher dispatcher = request .getRequestDispatcher("/registerSuccess.jsp"); 
			dispatcher.forward(request, response); 
		}else{
			//如果存在该用户，则转到注册失败的页面中
			response.sendRedirect("/springtest/registerFailed.jsp"); 
			} 
		}
	boolean checkUser(UserBean user) {
		UserDao ud=new UserDao(); 
		if( ud.searchUser2(user) ) { 
			return false; 
			}
		return true;
	}
		
}
 