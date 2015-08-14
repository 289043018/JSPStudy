<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	session.invalidate();//直接清除session对象，这个方法会直接干掉整个session对象，非常彻底
	response.setHeader("refresh", "2;URL=login.jsp");
%>