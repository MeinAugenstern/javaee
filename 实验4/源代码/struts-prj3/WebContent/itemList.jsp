<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.opensymphony.xwork2.util.ValueStack, java.util.List,java.util.Iterator, cn.edu.zjut.bean.Item"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 基础实验
<center>商品列表</center>
<table border=1> 
	<tr> 
		<th>编号</th><th>书名</th><th>说明</th><th>单价</th> 
	</tr> 
	<s:iterator value="items" >
	<tr>
		<td><s:property value="itemID"/></td> 
		<td><s:property value="name"/></td> 
		<td><s:property value="description"/></td> 
		<td><s:property value="cost"/></td>
	 </tr> 
	 </s:iterator> 
</table>
 -->
<body>
<!-- 提高实验 
通过值栈接口的 findValue 方法获得值栈中对象的值并输出
<% 
	ValueStack vs=(ValueStack)request. 
				getAttribute("struts.valueStack"); 
	String title=vs.findString("tableTitle"); 
	List itemList=(List)vs.findValue("items"); 
 	%>
<center>商品列表</center>
<table border=1> 
	<tr> 
		<th>编号</th><th>书名</th><th>说明</th><th>单价</th> 
	</tr> 
	<% 
	Iterator it=itemList.iterator(); 
		while(it.hasNext()){ 
			Item item = (Item)it.next(); 
			%> 
	<tr>
		<td><%=item.getItemID() %></td> 
		<td><%=item.getName() %></td> 
		<td><%=item.getDescription() %></td> 
		<td><%=item.getCost() %></td> 
		</tr> 
<%} %>
</table>
-->
<!-- 提高实验 通过 OGNL 获得值栈内容 
<s:property value="#session.user"/>，您好！
<center>商品列表</center>
<table border=1> 
	<tr> 
		<th>编号</th><th>书名</th><th>说明</th><th>单价</th> 
	</tr> 
	<s:iterator value="items" >
	<tr>
		<td><s:property value="itemID"/></td> 
		<td><s:property value="name"/></td> 
		<td><s:property value="description"/></td> 
		<td><s:property value="cost"/></td>
	 </tr> 
	 </s:iterator> 
</table>
-->
<!-- 提高实验 使用符号#过滤集合 -->
<s:url value="items.{name}[0]"/><br> 
<s:url value="%{items.{name}[0]}"/><br>

价格低于 20 元的商品有：<br> 
<s:iterator value="items.{?#this.cost<20}" > 
	<li><s:property value="name"/>：
 		<s:property value="cost" />元</li> 
 </s:iterator> 
 <p> 
 名称为《JAVAEE 技术实验指导教程》的商品的价格为： 
 <s:property value="items.
 	 {?#this.name=='JAVAEE 技术实验指导教程'}.{cost}[0]"/>元

</body>
</html>