<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>欢迎您!管理员<span>${username }</span></h1>
	<p>您的密码是${password }</p>
	<p>目前<span>${onLineCount }</span>人在线</p>
	<a href="${bp }/logoutServlet">注销</a>
</body>
</html>