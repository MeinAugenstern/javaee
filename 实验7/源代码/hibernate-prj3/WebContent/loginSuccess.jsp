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
<table> 
<tr>
	<td>个人信息：<p></td>
</tr> 
<tr>
	<td>用户名：</td> 
	<td><s:property value="#request.loginUser.account" /></td> 
</tr>
<s:if test="#request.loginUser.address">
<s:form action="UserdelAddr" method="post">
<!-- 
<s:hidden name="loginUser.customerId" value="%{#request.loginUser.customerId}"/> 
<s:hidden name="address.addressId" value="%{addressId}"/>
 -->
	<s:hidden name="loginUser.customerId" value="%{#request.loginUser.customerId}"/>
	<tr>
		<td>详细地址：</td>
		<td><s:property value="#request.loginUser.address.detail" /></td>
	</tr>
	<tr>
		<td>邮政编码：</td>
		<td><s:property value="#request.loginUser.address.zipcode" /></td>
	</tr>
	<tr>
		<td>电话号码：</td>
		<td><s:property value="#request.loginUser.address.phone" /></td>
	</tr>
	<tr>
		<td>地址类型：</td>
		<td><s:property value="#request.loginUser.address.type" /></td>
	</tr>
	<tr>
		<td><s:submit value="删除"/></td>
	</tr> 
</s:form>
</s:if> 
<s:else>
</table> 
<hr> 添加新地址：<p> 
<s:form action="UseraddAddr" method="post"> 
	<s:hidden name="loginUser.customerId" 
			value="%{#request.loginUser.customerId}"/> 
	<s:textfield name="address.detail" label="详细地址" /> 
	<s:textfield name="address.zipcode" label="邮政编码" /> 
	<s:textfield name="address.phone" label="联系电话" /> 
	<s:textfield name="address.type" label="地址类型（office,home,etc.）" /> 
	<s:submit value="添加"/> 
</s:form>
</s:else>
</body>
</html>