package jgs.javaweb.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jgs.javaweb.servlet.entity.User;
import jgs.javaweb.servlet.service.UserServiceImp;
import jgs.javaweb.servlet.util.MD5Utils;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1543409478835616921L;
	
	private UserServiceImp userServiceImp = new UserServiceImp();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 获取表单参数
		// 设置req编码格式
		req.setCharacterEncoding("utf-8");
		
		String username = req.getParameter("username");
		String password = MD5Utils.encryption(req.getParameter("password"));
		
		User user = userServiceImp.login(username, password);
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter writer = resp.getWriter();
		
		if (user!=null) {
			writer.write("<h1>登录成功</h1>");
			writer.write("<a href='showAllUsers'>查看所有用户信息</a>");
		} else {
			writer.write("<h1>登录失败</h1>");
		}
		
		writer.close();
	}
	
	

}
