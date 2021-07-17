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
		String username = (String)session.getAttribute("username");
		String password = (String)session.getAttribute("password");
		if(username==null||password==null){
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
	%>


	<h1>登录成功</h1>
	<h1>欢迎您,${username }</h1>
</body>
</html>