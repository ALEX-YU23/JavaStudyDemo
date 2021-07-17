<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>表单提交</title>
</head>
<body>
	<form action="jsp02_request.jsp" method="post">
		<div>
			用户名：<input type="text" name="username"/>
		</div>
		<div>
			密码：<input type="password" name="password"/>
		</div>
		<div>
			爱好：
			Java<input type="checkbox" name="hobby" value="java"/>
			看小电影<input type="checkbox" name="hobby" value="movie"/>
			跑步<input type="checkbox" name="hobby" value="run"/>
		</div>
		<div>
			<input type="submit" value="登录"/>
		</div>
	</form>

</body>
</html>