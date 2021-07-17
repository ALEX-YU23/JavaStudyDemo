<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>四大作用域</title>
</head>
<body>

<%="application:"+application.getAttribute("username") + "<hr>" %>
<%="session:"+session.getAttribute("username") + "<hr>"  %>
<%="request:"+request.getAttribute("username") + "<hr>"  %>
<%="pageContext:"+pageContext.getAttribute("username") + "<hr>"  %>

</body>
</html>