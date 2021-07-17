package cn.kgc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		System.out.println(username);
		
		if("admin".equals(username)) {
			//将用户名放入session作用域
			HttpSession session = request.getSession();
			session.setAttribute("username", "admin");
			//单位秒  设置session的存活时间
			//session.setMaxInactiveInterval(100);
			
			response.sendRedirect("index.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
