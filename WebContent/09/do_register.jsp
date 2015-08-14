<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userName = request.getParameter("userName");
String skills = "";
String[] skillArr = request.getParameterValues("skills");
if(skillArr!= null && skillArr.length > 0){
	//遍历语句，从0开始遍历skillArr，并把skillArr的值依次传递给skill。
	for(String skill : skillArr){
		skills = skills+skill+" ";
	}
}

request.setAttribute("userName", userName);
request.setAttribute("skills", skills);

%>
<jsp:forward page="welcome.jsp"></jsp:forward>