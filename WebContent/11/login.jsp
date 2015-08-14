<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录表单</title>
</head>
<body>
	<form action="do_login.jsp" method="post">
	userName:<input type="text" name="userName" />
	password:<input type="password" name="password" />
	<input type="submit" value="提交" />
	<input type="reset" value="重置" />
	
	</form>
</body>
</html>