<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.kgc.javaweb.entity.User"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   欢迎您：<%=session.getAttribute("username")  %>
	<%
	    List<User> users = 	new ArrayList<User>();
	    for(int i=0;i<5;i++){
	    	
	    	User user  = new  User();
		    user.setPassword("123456"+i);
		    user.setUsername("tom"+i);
		    users.add(user);
	    }
	%>
	<!-- 遍历users 以无序列表的形式展示在页面 -->
	<ul>
		<%
			for(User user: users){
		%>	
			<li><%=user %></li>
		<%		
			}
		%>
	
	</ul>
	<!-- 遍历users 以表格的形式展示在页面 -->
	
	<table border="1px" cellspacing="0" width="100%" height="300px">
		<tr>
			<th>用户名</th>
			<th>密码</th>
		</tr>
		
		<%
			for(User user: users){
		%>	
			<tr>
			  <td><%=user.getUsername() %></td>
			  <td><%=user.getPassword() %></td>
			</tr>
		<%		
			}
		%>	
	</table>
	
</body>
</html>