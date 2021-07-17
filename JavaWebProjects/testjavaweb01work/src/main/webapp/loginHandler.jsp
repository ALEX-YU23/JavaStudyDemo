<%@page import="com.mysql.cj.Session"%>
<%@page import="org.jgsjavaweb.dao.UserDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.jgsjavaweb.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录处理页面</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserDao userDao = new UserDao();
		
		User user = userDao.getOneByUsernameAndPassword(username, password);
		
		
		if(user!=null){
			session.setAttribute("onlineUser", user);
			// 登录成功,重定向到主页面
			response.sendRedirect("main.jsp");
		}else{
			request.setAttribute("msg", "登录失败");
			// 登录失败,转发到原页面
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
	%>
</body>
</html>