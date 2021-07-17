<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL表达式</title>
</head>
<body>
	<%
	 	pageContext.setAttribute("key1","pageContext");
	    pageContext.setAttribute("key2","pageContext2");
	 	request.setAttribute("key2", "request");
	 	session.setAttribute("key3", "session");
	 	application.setAttribute("key4", "application");
	%>
	pageContext：${pageScope.key1} <br>
	request: ${requestScope.key2}<br>
	session:${sessionScope.key3}<br>
	application:${applicationScope.key4}<br>
	---------------------------------------------------<br>
	<!-- 
		在使用el表达式取值的过程中 如果不指定在哪个域对象中取值,
		那么el表达式会遍历四个作用域对象，从小到大的返回寻找key
		pageScope -> requestScope -> sessionScope -> applicationScope
	
	 -->
	${key1}<br>
	${requestScope.key2}<br>
	${key3}<br>
	${key4}<br>
	${key5}<br>
	
</body>
</html>