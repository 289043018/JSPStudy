<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<style type="text/css">
body{
	color:#000;
	font-size:14px;
	margin:20 auto;

}

</style>

<script type="text/javascript">
	function check(form) {
		if(document.forms.loginForm.userName.value==""){
			alert("请输入用户名！");
			document.forms.loginForm.userName.focus();
			return false;
		}
		if(document.forms.loginForm.password.value==""){
			alert("请输入密码！");
			document.forms.loginForm.password.focus();
			return false;
		}

	}
</script>




</head>
<body>
<form action="<%= request.getContextPath()%>/LoginServlet17" Method="post" name="loginForm">
	<table border="1" cellspacing="0" cellpadding="5" bordercolor="silver" align="center">
		<tr>
			<td colspan="2" align="center" bgcolor="#E8E8E8">用户登录</td>
		</tr>
		<tr>
			<td>用户名：</td>
			<td><input type="text" name="userName"></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="submit" onclick="return check(this);"/>
				<input type="reset" name="reset" /></td>
		</tr>	

	
	</table>
</form>
</body>
</html>