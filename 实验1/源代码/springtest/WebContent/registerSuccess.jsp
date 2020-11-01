<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.dom.model.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册成功</title>
</head>
<body>
<% UserBean user=(UserBean)(request.getAttribute("USER")); %> 
注册成功,欢迎您,<%=user.getUsername() %>
</body>
</html>