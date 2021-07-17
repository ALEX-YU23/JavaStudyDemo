<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="${bp }/LoginServlet" method="post">
			用户名:<input type="text" name="username" placeholder="请输入用户名" ><br>
			密码:<input type="password" name="password"  ><br>
			<input type="submit" value="登录">
		</form>
	
	</center>
</body>
</html>