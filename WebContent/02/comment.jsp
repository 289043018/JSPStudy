<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- this is body -->
<!-- today is <%=new java.util.Date().toString()     %> -->
<%--
this is JSP comments.
 --%>
 
 <%
 	String str="hello world";
 	/*String str="hello world";*/
 	out.print(str);
 %>
</body>
</html>