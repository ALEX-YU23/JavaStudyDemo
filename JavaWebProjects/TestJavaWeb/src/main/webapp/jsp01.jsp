<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsptest</title>
</head>
<body>
	<h1>第一个jsp页面</h1>
	<%
		//System.out.println("hello jsp");
		out.write("小骚货,刘浩");
		int a = 10;
		int b = 20;
		out.write(a + b + "");
	%>
	<hr>
	<%="什么东西" %>
	
	<hr>
	<%!
	// 只能声明变量  全局声明
	String str = "刘浩";
	%>
	<%=str %>
</body>
</html>