<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功提示页面</title>
</head>
<body>
登录成功<br/>
您提交的信息为：<br/>
用户名：<%= request.getParameter("userName") %>
密码：<%= request.getParameter("password") %>
<a href="login.jsp">返回登录</a>
</body>
</html>