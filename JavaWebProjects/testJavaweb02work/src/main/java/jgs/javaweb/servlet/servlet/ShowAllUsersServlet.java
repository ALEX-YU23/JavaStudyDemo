package jgs.javaweb.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jgs.javaweb.servlet.entity.User;
import jgs.javaweb.servlet.service.UserServiceImp;

@WebServlet("/showAllUsers")
public class ShowAllUsersServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3902528243787731342L;

	private UserServiceImp userServiceImp = new UserServiceImp();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 获取表单参数
		// 设置req编码格式
		req.setCharacterEncoding("utf-8");
		
		List<User> allUsers = userServiceImp.showAllUsers();
		
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter writer = resp.getWriter();
		
		writer.write("<table border=\"1px solid black\" cellspacing=\"0\" cellpadding=\"0\" width=\"600px\">\r\n"
				+ "	<tr>\r\n"
				+ "		<th>序号</th>\r\n"
				+ "		<th>用户名</th>\r\n"
				+ "		<th>密码</th>\r\n"
				+ "		<th>生日</th>\r\n"
				+ "		<th>删除</th>\r\n"
				+ "	</tr>");
		
		for (User user : allUsers) {
			
			writer.write("<tr>\r\n"
					+ "	<td>"+user.getId()+"</td>\r\n"
					+ "	<td>"+user.getUsername()+"</td>\r\n"
					+ "	<td>"+user.getPassword()+"</td>\r\n"
					+ "	<td>"+new SimpleDateFormat("yyyy-MM-dd").format(user.getBirthday())+"</td>\r\n"
					+ "	<td><form action='deleteOneServlet' method=\"post\">"
					+ "<input type='hidden' name='id' value="+user.getId()+">"
					+ "<input type='submit' value='删除' />"
					+ "</form></td>\r\n"
					+ "	</tr>");
		}
		// TODO 考虑用ajax写删除,但是删除之后这个页面该怎么刷新
		
		
		writer.write("</table>");
		
		writer.close();
	}
	
	

}
