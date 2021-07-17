<%@page import="org.jgsjavaweb.dao.UserDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.jgsjavaweb.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册处理页面</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String birthday = request.getParameter("birthday");
	
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(birthday));
		
		UserDao userDao = new UserDao();
		int result = userDao.insert(user);
		
		if(result==1){
			// 注册成功,重定向到登录页面
			response.sendRedirect("login.jsp");
		}else{
			request.setAttribute("msg", "注册失败");
			// 注册失败,转发到原页面
			request.getRequestDispatcher("regist.jsp").forward(request, response);
		}
		
		
	%>
</body>
</html>