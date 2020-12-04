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
<s:form action="register" method="post"> 
	<s:textfield name="loginUser.account" label="请输入用户名"/> 
	<s:password name="loginUser.password" label="请输入密码"/>
	<s:password name="loginUser.repassword" label="请再次输入密码"/>
	<s:textfield name="loginUser.name" label="真实姓名"/>
	<s:radio name="loginUser.sex" list="#{true : '男', false : '女'}" label ="请输入性别"/> 
	<s:textfield name="loginUser.birthday"  label="请输入生日"/>
	<s:textfield name="loginUser.address" label="联系地址"/>
	<s:textfield name="loginUser.phone" label="联系电话"/>
	<s:textfield name="loginUser.zipcode" label="邮政编码"/>
	<s:textfield name="loginUser.fax" label="传真号码"/>
	<s:submit value="注册"/> <s:reset value="重置"/> 
</s:form>
</body>
</html>