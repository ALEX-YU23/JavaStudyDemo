<%@ page import="java.util.Date"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set  value="${pageContext.request.contextPath }" var="bp"></c:set>
	<%
	     pageContext.setAttribute("number", 10);
		
		//定义数组
		int[] scores = new int[3];
		scores[0] = 60;
		scores[1] = 70;
		scores[2] = 80;
		pageContext.setAttribute("scores", scores);
		
		//定义list集合
		ArrayList<Integer> scores2 = new ArrayList<Integer>();
		scores2.add(60);
		scores2.add(70);
		scores2.add(80);
		pageContext.setAttribute("scores2", scores2);
		
		//创建map集合
		
	    HashMap<String,Integer> scores3 = new HashMap<String,Integer>();
		scores3.put("english", 70);
		scores3.put("math", 80);
		scores3.put("chinese", 70);
		pageContext.setAttribute("scores3", scores3);
		
		Date date = new Date();
		pageContext.setAttribute("date", date);

	%>
	<!-- jstl基本使用
	  c:out   输出数据到页面  等同于 jsp脚本中的输出表达式 
	  	value: 输出的值
	  	default：输出的默认值 
	  	
	  	
	  c:if  选择结构中的  if单分支结构    使用场景  ：权限的判定
	  test: 接收布尔类型值  true 执行标签内部的内容  否则不执行
	  
	  c:choose  多分支的结构 switch
	  	c:when
	  	c:otherwise
	  
	  c:forEach  循环
	  
	 -->
	numbber:<c:out value="${number }" default="default"></c:out>

	<c:if test="${number>10 }">
		<h1>test中的值为true</h1>
	</c:if>
	<c:if test="${number==10 }">
		<h1>test中的值为true</h1>
	</c:if>

	<c:choose>
		<c:when test="${number>10 }">A</c:when>
		<c:when test="${number<10 }">B</c:when>
		<c:when test="${number!=10 }">C</c:when>
		<c:otherwise>D</c:otherwise>
	</c:choose><br>
--------------------------------------<br>
	<!-- 循环标签的使用 -->
	<c:forEach begin="0" end="10" step="2" var="num" varStatus="status">
		<c:out value="${num }"></c:out> <br>
		<c:out value="${status.index }"></c:out> <br>
		<c:out value="${status.count }"></c:out> <br>
	</c:forEach>
--------------------------------------<br>
	<c:forEach var="num" items="${scores }">
		<c:out value="${num }"></c:out> <br>
	</c:forEach>
	
--------------------------------------<br>
	<c:forEach var="num" items="${scores2 }">
		<c:out value="${num }"></c:out> <br>
	</c:forEach>

--------------------------------------<br>
	<c:forEach var="num" items="${scores3 }">
		<c:out value="${num.key }"></c:out> <br>
		<c:out value="${num.value }"></c:out> <br>
	</c:forEach>
--------------------------------------<br>
<c:out value="${date }"></c:out>	
<fmt:formatDate value="${date }" pattern="yyyy-MM-dd HH:mm:ss"/>	<br>
	
path:${bp}
		
</body>
</html>