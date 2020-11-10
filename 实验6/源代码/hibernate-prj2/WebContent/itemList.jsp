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
<!-- 
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
		<td><s:property value="itemID"/></td> 
		<td><s:property value="title"/></td> 
		<td><s:property value="description"/></td> 
		<td><s:property value="cost"/></td> 
	</tr> 
</s:iterator> 
</table>
 -->
<!-- 
<table border=1> 
	<tr> 
		<th>书名</th> 
	</tr> 
<s:iterator value="items" id="object"> 
	<tr>
		<td><s:property value="object"/></td> 
	</tr> 
</s:iterator> 
</table>
<table border=1> 
	<tr> 
		<th>书名</th>
		<th>单价</th>
	</tr> 
<s:iterator value="items" id="object"> 
	<tr>
		<td><s:property value="#object[0]"/></td> 
		<td><s:property value="#object[1]"/></td> 
	</tr> 
</s:iterator> 
</table>
<table border=1> 
	<tr> 
		<th>书籍数</th>
	</tr> 
<s:iterator value="items" id="object"> 
	<tr>
		<td><s:property value="object"/></td>  
	</tr> 
</s:iterator> 
</table>
 -->
<table border=1> 
	<tr> 
		<th>编号</th> 
		<th>书名</th> 
		<th>说明</th> 
		<th>单价</th> 
	</tr> 
<s:iterator value="items" > 
	<tr>
		<td><s:property value="itemID"/></td> 
		<td><s:property value="title"/></td> 
		<td><s:property value="description"/></td> 
		<td><s:property value="cost"/></td> 
	</tr> 
</s:iterator> 
</table>

</body>
</html>