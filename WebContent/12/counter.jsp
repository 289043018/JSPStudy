<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>访问计数器</title>
</head>
<body>
<%
	Object obj = application.getAttribute("counter");

	if(obj == null){
		application.setAttribute("counter", new Integer(1));
		out.println("该页面被访问了1次。<br / >");
	}else{
		int countervalue = Integer.parseInt(obj.toString());
		countervalue++;
		out.println("该页面被访问了 "+countervalue+"次。 ");
		application.setAttribute("counter", countervalue);
	}


%>

</body>
</html>