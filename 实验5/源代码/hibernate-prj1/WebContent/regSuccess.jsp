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
<s:property value="loginUser.name"/> 
<!-- 控制标签 if/else -->
<s:if test="%{loginUser.sex==\"1\"}"> 
	<s:text name="先生，"/> 
</s:if> 
<s:else> 
	<s:text name="女士，"/> 
</s:else> 您注册成功了！ 
</body>
</html>