<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html>
<html>
<head>
	<s:head theme="xhtml"/> 
	<sx:head parseContent="true" extraLocales="UTF-8"/> 
</head>
<body>
<s:actionmessage/>
<s:actionerror/>
<s:fielderror/>
<s:form action="register" method="post"> 
	<s:textfield name="registerUser.account" label="请输入用户名"/> 
	<s:password name="registerUser.password" label="请输入密码"/>
	<s:password name="registerUser.repassword" label="请再次输入密码"/>
	<s:textfield name="registerUser.name" label="真实姓名"/>
	<s:radio name="registerUser.sex" list="#{1 : '男', 0 : '女'}" label ="请输入性别"/> 
	<s:textfield name="registerUser.birthday"  label="请输入生日"/>
	<s:textfield name="registerUser.address" label="联系地址"/>
	<s:textfield name="registerUser.phone" label="联系电话"/>
	<s:textfield name="registerUser.email" label="电子邮箱"/>
	<s:submit value="注册"/> <s:reset value="重置"/> 
</s:form>
</body>
</html>