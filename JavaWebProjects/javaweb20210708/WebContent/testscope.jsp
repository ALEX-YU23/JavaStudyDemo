<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

	pageContext:<%=pageContext.getAttribute("pageContext") %><br>
    request:<%=request.getAttribute("request") %><br>
    session:<%=session.getAttribute("session") %><br>
    application:<%=application.getAttribute("application") %><br>
</body>
</html>