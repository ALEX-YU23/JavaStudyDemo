<%@page import="org.jgsjavaweb.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 登录校验,没有登录不能进入主页 -->
	<%
		User onlineUser = (User)(session.getAttribute("onlineUser"));
		if(onlineUser==null){
			response.sendRedirect("login.jsp");
		}
	%>
	<h1>欢迎您! <%=onlineUser.getUsername() %></h1>
</body>
</html>