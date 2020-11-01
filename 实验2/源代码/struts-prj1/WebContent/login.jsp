<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="s" uri="/struts-tags"%> 
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
</head>
<body>
<%-- 版本1
<form action="login" method="post"> 
	请输入用户名：<input name="loginUser.account" type="text"><BR> 
	请输入密码：<input name="loginUser.password" type="password"><BR>
<input type="submit" value="登录"> </form>
--%>
<%-- 版本2
<form action="login" method="post"> 
	请输入用户名：<input name="account" type="text"><BR> 
	请输入密码：<input name="password" type="password"><BR>
<input type="submit" value="登录"> </form>
--%>
<%-- 版本3
<form action="login" method="post"> 
	请输入用户名：<input name="loginUser.login.account" type="text"><BR> 
	请输入密码：<input name="loginUser.login.password" type="password"><BR>
<input type="submit" value="登录"> </form>
--%>
<%-- 扩展实验 --%>
<form action="login" method="post"> 
	<s:textfield name="loginUser.account" key="login.account.lable"/> 
	<s:password name="loginUser.password" key="login.password.lable"/> 
	<s:submit name="submit" key="login.submit.button"/>
</form>
</body>
</html>