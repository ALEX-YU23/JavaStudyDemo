<%@page import="java.util.ArrayList"%>
<%@page import="org.jgs2021.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>输出java对象</title>
<style type="text/css">
	#table1{
				width: 1200px;
				margin: 30px auto;
			}
</style>
</head>
<body>
<%
	ArrayList<Student> stulist = new ArrayList<Student>();
	stulist.add(new Student("张三",23,'男',67.8));
	stulist.add(new Student("李四",25,'男',78.3));
	stulist.add(new Student("王五",22,'男',69.3));
	stulist.add(new Student("小红花",18,'女',97.8));
	stulist.add(new Student("牡丹",23,'女',89.5));
%>
<table id="table1" border="1px" cellspacing="0" cellpadding="10px">
	<caption>学生成绩表</caption>
	<tr>
		<th>序号</th>
		<th>姓名</th>
		<th>年龄</th>
		<th>性别</th>
		<th>成绩</th>
	</tr>
	<%
		//for(Student stu : stulist){
		//	out.write("<tr/>");
		//	out.write("<td/>"+stu.getName()+"</td/>");
		//	out.write("<td/>"+stu.getAge()+"</td/>");
		//	out.write("<td/>"+stu.getGender()+"</td/>");
		//	out.write("<td/>"+stu.getScore()+"</td/>");
		//	out.write("</tr/>");
		//}
	%>
	<% int i=1; for(Student stu : stulist){ %>
		<tr>
			<td><%=(i++) %></td>
			<td><%=stu.getName() %></td>
			<td><%=stu.getAge() %></td>
			<td><%=stu.getGender() %></td>
			<td><%=stu.getScore() %></td>
		</tr>
	<% } %>
</table>


</body>
</html>