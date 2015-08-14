<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/LoginServlet" method="post">
	userName:<input type="text"  name="userName"/>	<br/>
	password:<input type="password" name="password" /><br/>
	<input type="submit" value="提交" />
	<input type="reset" value="重置" />

</form>
</body>
</html>