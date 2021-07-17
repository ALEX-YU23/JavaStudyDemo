<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>El表达式处理复杂的value</title>
</head>
<body>
	<%
		//value为数组
		int[] score = new int[3];
	    score[0] = 70;
	    score[1] = 80;
	    score[2] = 60;
	   pageContext.setAttribute("score", score);
	    
	   //value为集合
	  ArrayList<Integer> scores =  new ArrayList<Integer>();
	   scores.add(70);
	   scores.add(80);
	   scores.add(60);
	   pageContext.setAttribute("score2", scores);  
	   
	   //value为Map集合
	   
	   HashMap<String,Integer> scores2 = new HashMap<String,Integer>();
	   scores2.put("英语", 70);
	   scores2.put("math", 80);
	   scores2.put("chinese",90);
	   pageContext.setAttribute("score3", scores2);
	%>
	
	<!-- EL表达式取值为数组的处理方式 -->
	
   score:<br>${score[0]}
    ${score[1]}<br>
    ${score[2]}<br>
    --------------------------<br>
    score2:<br>${score2[0]}<br>
    ${score2[1]}<br>
    ${score2[2]}<br>
    --------------------------<br>
    score3:<br>${score3["英语"]}<br>
    ${score3.math}<br>
    ${score3.chinese}<br>
</body>
</html>