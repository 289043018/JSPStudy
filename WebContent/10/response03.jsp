<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>response对象实例</title>
</head>
<body>

<%
	Cookie myCookie = new Cookie("jky","hand");
	myCookie.setMaxAge(3600);
response.addCookie(myCookie);
%>

</body>
</html>