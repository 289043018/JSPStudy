<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>page示例</title>
</head>
<body>
<%= page.toString() %>
<%
	//用于返回当前的object类
	page.getClass();
//用于返回page对象的hashcode的值
page.hashCode();
//用于判断page是否与指定的对象相等
//page.equals(obj);

%>
</body>
</html>