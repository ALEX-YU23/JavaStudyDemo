<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页</title>
</head>
<body>

	<%
	   String username = (String) session.getAttribute("username");
		if(username==null){
			//没有登录 重定向到登录页面
			response.sendRedirect("login.jsp");
		}
		
		Integer num = (Integer) application.getAttribute("count");
		if(num==null){
			num = 1;
		}else{
			num++;
		}
		application.setAttribute("count", num);
	%>
	<h1>登录成功</h1>
	欢迎您：<%=session.getAttribute("username")%>
	网页的热度：<%=num %>
</body>
</html>