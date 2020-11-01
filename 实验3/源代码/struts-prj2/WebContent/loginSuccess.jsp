<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录成功</title>
</head>
<body>

<!--  你登录了<s:property value="count"/>次
<s:text name="login.success.label"/> 

-->
<table border=1> 
<s:iterator value="#session.shoppingcart.itemsOrdered" > 
<tr> 
	<th>编号</th>
	<th>名称</th>
	<th>说明</th>
	<th>单价</th>
	<th>数量</th> 
</tr> 
<tr>
	<td><s:property value="item.itemID"/></td> 
	<td><s:property value="item.name"/></td> 
	<td><s:property value="item.description"/></td> 
	<td><s:property value="item.cost"/></td> 
	<td><s:property value="numItems"/></td> 
</tr> 
</s:iterator> 
</table>
</body>
</html>