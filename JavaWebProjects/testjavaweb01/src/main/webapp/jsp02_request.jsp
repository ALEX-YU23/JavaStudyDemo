<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>使用request获取表单数据</title>
</head>
<body>
<!-- 
	1.设置请求的编码格式
	2.获取请求参数
	3.设置请求参数
	4.实现页面的跳转转发
 -->
<%
	// 解决post请求中中文乱码问题 必须在使用request之前设置
	request.setCharacterEncoding("utf-8");

	//使用request对象获取表单请求参数
	//获取参数map集合
	Map<String, String[]> parameterMap = request.getParameterMap();
	/* out.print(parameterMap); */
	for(String key : parameterMap.keySet()){
		out.print(key+" ::: "+Arrays.toString(parameterMap.get(key)));
		out.print("<hr>");
	}
	
	// 获取单个参数
	String username = request.getParameter("username");
	out.println(username);
	out.print("<hr>");
	String hobby = request.getParameter("hobby");// 获取第一个
	out.println(hobby);
	
	// 获取单个参数的多个值
	String[] hobbys = request.getParameterValues("hobby");
	out.println(Arrays.toString(hobbys));
	out.print("<hr>");
	
	// 其他方法
	out.println(request.getRequestURL() + "<hr>");
	out.println(request.getRequestURI() + "<hr>");
%>
</body>
</html>