<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.opensymphony.xwork2.util.ValueStack, java.util.List,java.util.Iterator, cn.edu.zjut.po.Item"%>
    <%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>商品列表</center> 
<table border=1> 
<tr> 
	<th>编号</th> 
	<th>书名</th> 
	<th>说明</th> 
	<th>单价</th> 
</tr> 
<s:iterator value="items" > 
<tr>
	<td><s:property value="ipk.itemid"/></td> 
	<td><s:property value="ipk.title"/></td> 
	<td><s:property value="description"/></td> 
	<td><s:property value="cost"/></td> 
</tr> 
</s:iterator> 
</table>
</body>
</html>