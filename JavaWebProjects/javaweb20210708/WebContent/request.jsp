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
	    
	 -->
	<%
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
	    String   pwd= request.getParameter("password");
	    String  remember = request.getParameter("remember");
	    System.out.println(remember);
	
	    if("admin".equals(username)&&"123456".equals(pwd)){
	    	//登录成功  跳转页面到主页  转发  没有发送新的请求  两个页面可以共享请求对象  
	    	//转发的动作在服务器内部完成
	    	//request.getRequestDispatcher("success.jsp").forward(request, response);
	    	//保存用户名到session
	    	session.setAttribute("username", username);
	    	//创建一个cookie对象
	    	if("true".equals(remember)){
	    		 Cookie cookie1 = new Cookie("username","admin");
	    		 Cookie cookie2 = new Cookie("password","123456");
	    		 Cookie cookie3 = new Cookie("remember","on");
	    		//设置cookie的有效时间   单位秒
	    		cookie1.setMaxAge(60*60);
	    		cookie2.setMaxAge(60*60);
	    		cookie3.setMaxAge(60*60);
	    	    //绑定cookie
	    	    response.addCookie(cookie1);
	    	    response.addCookie(cookie2);
	    	    response.addCookie(cookie3);
	    	}else{
	    		//获取所有的cookie
	    		Cookie[] cookies = 	request.getCookies();
	    		//遍历所有的cookie  设置存活的时间为0   setMaxAge(-1)  关闭浏览器自动清除cookie
	    		if(cookies!=null){
	    			for(Cookie cookie: cookies){
	    			//立即删除该cookie
	    			if(!("JSESSIONID".equals(cookie.getName()))){
	    				cookie.setMaxAge(0);
	    			    response.addCookie(cookie);
	    			}
	    		  }	
	    		}
	    	}
	    	//使用重定向实现页面跳转  response
	    	response.sendRedirect(request.getContextPath()+"/success.jsp");
	    	
	    }else{
	    	//登录失败  跳转到登录页面
	    	//设置登录失败的信息 到request对象
	    	request.setAttribute("msg", "用户名或密码不正确");
	    	request.getRequestDispatcher("login.jsp").forward(request, response);
	    	
	    	//使用重定向实现页面跳转  response
	    	//response.sendRedirect("login.jsp");
	    }
	
	%>
	


</body>
</html>