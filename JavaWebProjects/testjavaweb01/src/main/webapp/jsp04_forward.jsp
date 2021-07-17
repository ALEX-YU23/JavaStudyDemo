<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>转发</title>
</head>
<body>
	<h1>被转发的信息</h1>
	<%--转发 --%>
	<%
		// 转发之后使用的是同一个request域,数据共享
		request.setAttribute("username", "灶上");
		request.getRequestDispatcher("jsp04_forward1.jsp").forward(request, response); 
	%>
</body>
</html>