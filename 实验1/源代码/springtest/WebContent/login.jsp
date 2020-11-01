<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录界面</title>
<script type="text/javascript">
	function mycheck(){
		//判断填入的数据是否有错
		if(document.form1.username.value==""){
			alert("用户名为空");
			return false;
		}
		if(document.form1.password.value==""){
			alert("密码为空");
			return false;
		}
		if(document.form1.password.value.length>=6){
			alert("密码长度大于六位");
			return false;
		}
	}
</script>
</head>
<body>	
<form name="form1" action="login" method="post" onsubmit="return mycheck()">
	<table>
		<tr>
			<select name="type">
				<option value="1">管理员</option>
				<option value="2">普通用户</option>
			</select>
		</tr>
		<tr>
			<td>请输入用户名：</td>
			<td><input type="text" name="username">
		</tr>
		<tr>
			<td>请输入密码：</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr> 
			<td> <input type="submit" value="登录"/></td>
			<td><input type="reset" value="重置" /></td>
		</tr>
	</table>
	<a href="register.jsp">还没账户？点击申请</a>
<%--
			请输入用户名：<input name="username" type="text"><br> 
		请输入密码：<input name="password" type="password"> 
		<input type="submit" value="登录">  
--%>
</form>	
</body>
</html>