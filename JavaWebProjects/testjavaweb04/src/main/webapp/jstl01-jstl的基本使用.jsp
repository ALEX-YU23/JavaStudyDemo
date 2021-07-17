<%@page import="java.util.Date"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set value="${pageContext.request.contextPath }" var="bp"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl的基本使用</title>
</head>
<body>
	<%
	
		pageContext.setAttribute("number", 10); 
	
		//定义数组
		int [] scores = new int[3];
		scores[0]=123;
		scores[1]=456;
		scores[2]=789;
		pageContext.setAttribute("scores", scores);
		
		//定义ArrayList集合
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(12);
		scoreList.add(13);
		scoreList.add(14);
		pageContext.setAttribute("scoreList", scoreList);
		
		// 创建map集合
		HashMap<String,Integer> scoreMap =  new HashMap();
		scoreMap.put("英语", 89);
		scoreMap.put("数学", 99);
		scoreMap.put("物理", 79);
		pageContext.setAttribute("scoreMap", scoreMap);
		
		// 日期格式化输出
		Date date = new Date();
		pageContext.setAttribute("date", date);
	%>
	
	<!-- jstl的基本使用
	
		c:out 输出数据到页面 等同于 jsp脚本中的输出表达式
	 -->
	number:<c:out value="${number }" default="defulat"></c:out>	
	
	<c:if test="${number==10 }">
		<h1>test中的值为true</h1>
	</c:if>
	<hr>
	
	多分支结构:<br>
	<c:choose>
		<c:when test="${number>10 }">A</c:when>
		<c:when test="${number<10 }">B</c:when>
		<c:when test="${number!=10 }"></c:when>
		<c:otherwise>D</c:otherwise>
	</c:choose>
	<hr>
	
	循环标签的使用:<br>
	<c:forEach begin="0" end="5" step="1" var="num">
		<c:out value="${num }"></c:out>
	</c:forEach>
	<hr>
	
	<c:forEach var="score" items="${scores }">
		<c:out value="${score }"></c:out><br>
	</c:forEach>
	
	<hr>
	<c:forEach var="score" items="${scoreList }">
		<c:out value="${score }"></c:out> <br>
	</c:forEach>
	<c:forEach var="score" items="${scoreList }">
		<c:out value="${score }"></c:out><br>
	</c:forEach>
	<hr>
	
	<c:forEach  var="score" items="${scoreMap }">
		<c:out value="${score.key }"></c:out>
		:
		<c:out value="${score.value }"></c:out><br>
	</c:forEach>
	
	<fmt:formatDate value="${date }" pattern="yyyy年MM月dd日 HH时mm分ss秒"/>
	<hr>
	${bp }
</body>
</html>