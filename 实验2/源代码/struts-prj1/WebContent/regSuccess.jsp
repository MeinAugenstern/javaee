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
<!-- 数据标签 property --> 
<s:property value="registerUser.name"/> 
<!-- 控制标签 if/else -->
<s:if test="%{registerUser.sex==\"1\"}"> 
	<s:text name="registerUser.gentleman.label"/> 
</s:if> 
<s:else> 
	<s:text name="registerUser.madam.label"/> 
</s:else> 
<s:text name="register.success.label"/> 
<!-- 数据标签 set --> 
<s:set var="user" value="registerUser" scope="session"/>
</body>
</html>