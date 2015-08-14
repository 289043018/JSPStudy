<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>config对象实例</title>
</head>
<body>
用户名：<%=config.getInitParameter("username")
//用于获得指定的初始化信息。
%><br/>
密码：<%=config.getInitParameter("password") %><br/>
</body>
</html>