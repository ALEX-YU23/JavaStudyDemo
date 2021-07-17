<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp九大内置对象之request&response</title>
</head>
<body>
	<!-- request
	    1.设置请求的编码格式
	    2.获取请求参数
	    3.设置请求参数
	    4.实现页面的跳转  转发  
	    请求次数一次 两个页面之间可以共享请求对象  地址栏不会改变  服务器内部的行为
	    
	    
	    response
	    1.设置响应格式
	    2.获取输出流
	    3.实现页面的跳转  重定向  
	    请求次数2次  两个页面之间不能共享请求对象  地址栏会发生改变  浏览器的行为
	    
	    Cookie  不是jsp的内置对象  使用前要使用new关键字创建Cookie对象   浏览器的缓存
	    
	    使用Cookie保存用户名和密码,当用户勾选了记住密码时,下一次登录的时候就要自动填上用户名和密码
	    当用户取消勾选记住密码时,就要删除Cookie,不保留本次登录信息
	    
	 -->
	<%
	request.setCharacterEncoding("utf-8");
	String username = request.getParameter("username");
	String pwd = request.getParameter("password");
	String remember = request.getParameter("remember");
	

	if ("admin".equals(username) && "123456".equals(pwd)) {
		//登录成功  跳转页面到主页  转发  没有发送新的请求  两个页面可以共享请求对象  
		//转发的动作在服务器内部完成
		//request.getRequestDispatcher("success.jsp").forward(request, response);

		//创建一个cookie对象
		Cookie usernameCookie = null;
		Cookie passworkCookie = null;
		Cookie rememberCookie = null;
		
		session.setAttribute("username", username);
		session.setAttribute("password", pwd);
		
		if ("on".equals(remember)) {
			usernameCookie = new Cookie("username", username);
			passworkCookie = new Cookie("password", pwd);
			rememberCookie = new Cookie("remember", remember);
			//设置cookie的有效时间   单位秒
			usernameCookie.setMaxAge(500);
			passworkCookie.setMaxAge(500);
			rememberCookie.setMaxAge(500);
			//绑定cookie
			response.addCookie(usernameCookie);
			response.addCookie(passworkCookie);
			response.addCookie(rememberCookie);
		}else{
			// 获取cookie,并删除
			// System.out.println("获取cookie,并删除");
			Cookie[] cookies = request.getCookies();
			for(Cookie cookie : cookies){
				// System.out.println(cookie.getName());
				
				//if ("username".equals(cookie.getName())||"password".equals(cookie.getName())) {
					// 立刻删除cookie
					cookie.setMaxAge(0);
					//绑定cookie
					response.addCookie(cookie);
				//}
				
			}
			
		}
		//使用重定向实现页面跳转  response
		response.sendRedirect("success.jsp");

	} else {
		//登录失败  跳转到登录页面
		//设置登录失败的信息 到request对象
		session.setAttribute("msg", "用户名或密码不正确");
		//request.getRequestDispatcher("login.jsp").forward(request, response);

		//使用重定向实现页面跳转  response
		response.sendRedirect("login.jsp");
	}
	%>



</body>
</html>