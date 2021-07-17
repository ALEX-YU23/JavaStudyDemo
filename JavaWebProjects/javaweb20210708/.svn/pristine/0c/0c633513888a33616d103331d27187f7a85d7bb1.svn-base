<%@page import="cn.kgc.javaweb.entity.User"%>
<%--jsp的指令 
   @ page
  language:脚本的语言
  contentType：响应数据的格式
  pageEncoding：jsp页面的编码格式
  import：导包  在jsp页面中需要使用的类 需要以包的形式导入
  isELIgnored：设置是否忽略EL表达式
  
  @include:静态包含
   <%@include file="相对路径或者内部路径"%>
  
  @taglib:导入标签库
  <%@taglib prefix=“前缀名" uri="命名空间"%>
  
 --%>
 
 <%--
  jsp页面中的注释可以分为 三类
  1.html  <!-- -->
  2.java注释  //   /**/
  3.jsp本身注释  
  --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <!-- 脚本 -->
     
	<%     //定义变量 局部变量   Java语句
		int num = 1;
		System.out.println(num);
		//out是jsp页面中的内置对象  使用时 不需要new 直接使用即可
		out.write("num:"+num);
		
		//调用方法
		 test();
	%>
	
	<%!  //定义全局变量   定义方法
		String str = "jsp";
		
	    public void test(){
	    	System.out.println("test()被调用");
	    }
	
	%>
	<!--输出表达式 简化了out.write()的写法 -->
	<span>str:</span><%=str %>
	<span>str:</span><%out.write(str); %>
	<h1>hello jsp</h1>

</body>
</html>