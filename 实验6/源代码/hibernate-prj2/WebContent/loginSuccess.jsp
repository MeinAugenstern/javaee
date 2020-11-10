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
修改个人信息<p>
<s:form action="Userupdate" method="post"> 
	<s:hidden name="loginUser.customerId" 
			value="%{#request.loginUser.customerId}"/> 
	<s:textfield name="loginUser.account" label="用户名不能修改" 
			value="%{#request.loginUser.account}" readonly="true"/> 
	<s:textfield type="password" name="loginUser.password" label="修改密码" 
			value="%{#request.loginUser.password}"/> 
	<s:textfield type="name" name="loginUser.name" label="修改名字" 
			value="%{#request.loginUser.name}"/> 	
	<s:radio name="loginUser.sex" list="#{true : '男', false : '女'}" label ="修改性别"  
			value="%{#request.loginUser.sex}"/>
	<s:textfield type="birthday" name="loginUser.birthday" label="修改生日" 
			value="%{#request.loginUser.birthday}"/> 			 			
	<s:textfield type="phone" name="loginUser.phone" label="修改电话" 
			value="%{#request.loginUser.phone}"/> 			
	<s:textfield type="email" name="loginUser.email" label="修改邮箱" 
			value="%{#request.loginUser.email}"/> 			
	<s:textfield type="address" name="loginUser.address" label="修改地址" 
			value="%{#request.loginUser.address}"/> 	
	<s:textfield type="zipcode" name="loginUser.zipcode" label="修改邮政编码" 
			value="%{#request.loginUser.zipcode}"/> 
	<s:textfield type="fax" name="loginUser.fax" label="修改传真号码" 
			value="%{#request.loginUser.fax}"/>		
	<s:submit value="修改"/> 
</s:form>
<s:form action="Userdelete" method="post"> 
	<s:hidden name="loginUser.customerId" 
			value="%{#request.loginUser.customerId}"/>
	<s:submit value="删除"/> 
</s:form>

<a href="./findItems">查看商品信息</a>
</body>
</html>