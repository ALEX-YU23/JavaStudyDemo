package org.javaweb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 获取用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		if ("admin".equals(username)&&"123456".equals(password)) {
			// 验证之后,将用户名和密码存入session
			request.getSession().setAttribute("username", username);
			request.getSession().setAttribute("password", password);
			// 重定向到主页
			
			response.sendRedirect(request.getContextPath()+"/protect/main.jsp");
		} else {
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
