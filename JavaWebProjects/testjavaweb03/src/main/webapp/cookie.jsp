<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
			//通过request获取cookie
			Cookie[] cookies = request.getCookies();
	%>	
	    <%=cookies[0].getName() %>
		<%=cookies[0].getValue() %>
		
</body>
</html>