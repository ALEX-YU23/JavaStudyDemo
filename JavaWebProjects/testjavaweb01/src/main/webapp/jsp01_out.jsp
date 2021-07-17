<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp内置对象之out</title>
</head>
<body>
<%--这是jsp注释 --%>
<%
	out.write("445");
	out.write("<hr>");
	out.write(321);//打印的是字符值
	
	out.print("<hr>");
	out.println(34567);

%>
</body>
</html>