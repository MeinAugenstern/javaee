<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>普通用户注册</title>
<script type="text/javascript">
	function mycheck2(){
		//判断填入的数据是否有错
		if(document.form2.username.value==""){
			alert("用户名为空");
			return false;
		}
		if(document.form2.password1.value==""){
			alert("密码为空");
			return false;
		}
		if(document.form2.password2.value==""){
			alert("请确认密码");
			return false;
		}
		if(document.form2.password1.value.length>=6){
			alert("密码长度大于六位");
			return false;
		}
		if(!(document.form2.password1.value == document.form2.password2.value)){
			alert("两次密码输入不一致");
			return false;
		}
	}
</script>
</head>
<body>
<form name="form2" action="register" method="post" onsubmit="return mycheck2()">
	<table>
		<tr>
			<td>普通用户注册</td>
		</tr>
		<tr>
			<td>请输入用户名:</td>
			<td><input type="text" name="username"></td>
		</tr>
		<tr>
			<td>请输入密码:</td>
			<td><input type="password" name="password1"></td>
		</tr>
		<tr>
			<td>请确认密码:</td>
			<td><input type="password" name="password2"></td>
		</tr>
		<tr> 
			<td><input type="submit" value="注册"/></td>
			<td><input type="reset" value="重置" /></td>
		</tr>
	</table>
</form>
</body>
</html>