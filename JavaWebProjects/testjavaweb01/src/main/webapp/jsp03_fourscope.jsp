<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>四大作用域</title>
</head>
<body>
<%
	// 四大作用域测试
	application.setAttribute("username", "李浩");
	session.setAttribute("username", "李浩");
	request.setAttribute("username", "李浩");
	pageContext.setAttribute("username", "李浩");
%>
<%="application:"+application.getAttribute("username") + "<hr>" %>
<%="session:"+session.getAttribute("username") + "<hr>"  %>
<%="request:"+request.getAttribute("username") + "<hr>"  %>
<%="pageContext:"+pageContext.getAttribute("username") + "<hr>"  %>

<a href="jsp03_fourscope1.jsp">跳转页面</a>
</body>
</html>