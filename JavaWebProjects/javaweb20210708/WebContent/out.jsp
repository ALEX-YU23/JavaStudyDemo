<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp九大内置对象之out</title>
</head>
<body>
	<!-- out
		作用：输出数据到前端页面
	 -->
	 
	 <%
	 	int num = 10;
	 	out.write("<h1>"+num+"</h1>");
	 %>
	 <%=num %>
	 
	 <%
	 		int number = 1/0;
	
	 %>
	 
</body>
</html>