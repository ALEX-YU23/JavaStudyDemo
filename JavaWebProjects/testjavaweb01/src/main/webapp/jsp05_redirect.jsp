<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>重定向</title>
</head>
<body>
	<h1>redirect</h1>
	<%
	response.sendRedirect("jsp05_redirect1.jsp"); 
	//response.sendRedirect("http://www.baidu.com");
	%>
</body>
</html>