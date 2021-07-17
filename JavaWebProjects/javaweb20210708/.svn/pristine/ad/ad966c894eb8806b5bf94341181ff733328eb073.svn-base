<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp中的四大作用域</title>
</head>
<body>
<!-- 
	jsp中的四大作用域
	1.pageContext    在当前页面有效
	2.request        在同一个请求中有效
	3.session        同一次会话中有效  
	4.application    同一个应用中有效

 -->
 
 <%
 	pageContext.setAttribute("pageContext","pageContext");
 	request.setAttribute("request", "request");
 	session.setAttribute("session", "session");
 	application.setAttribute("application", "application");
 %>
 pageContext:<%=pageContext.getAttribute("pageContext") %><br>
 request:<%=request.getAttribute("request") %><br>
 session:<%=session.getAttribute("session") %><br>
 application:<%=application.getAttribute("application") %><br>
 
 <a href="testscope.jsp">testscope</a>
</body>
</html>