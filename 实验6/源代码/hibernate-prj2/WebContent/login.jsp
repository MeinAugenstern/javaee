<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:property value="#request.tip"/><p> 
<s:form action="Userlogin" method="post"> 
	<s:textfield name="loginUser.account" label="请输入用户名"/><br>
	<s:password name="loginUser.password" label="请输入密码"/> <br>
	<s:submit value="登录"/> 
</s:form>
<a href="register.jsp">没有账号？点击申请</a>
</body>
</html>