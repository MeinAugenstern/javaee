<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 版本1 
<form action="login" method="post"> 
	请输入用户名：<input name="loginUser.account" type="text"><BR> 
	请输入密码：<input name="loginUser.password" type="password"><BR>
<input type="submit" value="登录"> 
</form> 
-->

<!-- DMI 
<s:form action="UserAction!login" method="post"> 
	请输入用户名：<input name="loginUser.account" type="text"><BR> 
	请输入密码：<input name="loginUser.password" type="password"><BR>
<input type="submit" value="登录"> 
</s:form> 
-->
<!-- 提交按钮的method形式<s:form action="UserAction" method="post"> 
	请输入用户名：<input name="loginUser.account" type="text"><BR> 
	请输入密码：<input name="loginUser.password" type="password"><BR>
	<s:submit value="登录"  method="login"/> 
</s:form>  
-->
<!-- 通配符 <s:form action="loginAction" method="post"> 
	请输入用户名：<input name="loginUser.account" type="text"><BR> 
	请输入密码：<input name="loginUser.password" type="password"><BR>
	<s:submit value="登录" /> 
</s:form> 
-->
<!--  -->
<s:actionmessage/>
<s:actionerror/>
<s:fielderror/>
<!-- 提高实验
<form action="login" method="post"> 
	请输入用户名：<input name="loginUser.account" type="text"><BR> 
	请输入密码：<input name="loginUser.password" type="password"><BR>
<input type="submit" value="登录"> 
 -->

<!-- 国际化 -->
<form action="login" method="post"> 
	<s:textfield name="loginUser.account" key="login.account.lable"/> <br>
	<s:password name="loginUser.password" key="login.password.lable"/> <br>
		<s:submit theme = "simple" name="submit"  key="login.submit.button"/>
</form> 
</body>
</html>