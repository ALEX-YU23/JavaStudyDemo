<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
</head>
<body>
	<!-- 获取用户名和密码 实现记住我的功能-->
<%-- 	<%
	// 通过request获取cookie
	Cookie[] cookies = request.getCookies();
	// 遍历cookies数组  获取缓存的用户名和密码
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if ("username".equals(cookie.getName())) {
				request.setAttribute("username", cookie.getValue());
			}
			if ("password".equals(cookie.getName())) {
				request.setAttribute("password", cookie.getValue());
			}
			if ("remember".equals(cookie.getName())) {
				request.setAttribute("remember", "on".equals(cookie.getValue())?"checked":"");
			}
		}

	}
	%> --%>
	
	<form action="${pageContext.request.contextPath }/request.jsp" method="post">
		用户名：<input type="text" name="username"
			value=${username }><br> 密码：<input
			type="password" name="password"
			value=${password }><br> 记住我：<input
			type="checkbox" name="remember" ${remember }><br> <input
			type="submit">
	</form>

	<%-- <%
	// 获取页面转发携带的参数    Object  getAttribute()
	String msg = (String) session.getAttribute("msg");
	// 销毁session
	request.getSession().invalidate();
	%>
	<%=msg == null ? "" : msg%> --%>
	${msg }
	

</body>
</html>