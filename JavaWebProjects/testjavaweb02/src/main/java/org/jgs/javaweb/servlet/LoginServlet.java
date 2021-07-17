package org.jgs.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7348012821830996370L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 解决post中文乱码问题  设置请求的编码字符集  必须要在获取请求参数之前
		req.setCharacterEncoding("utf-8");
		
		//获取请求中 封装的参数
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		System.out.println("username: "+username);
		System.out.println("password: "+password);
		
		resp.setContentType("text/html;charset=utf-8");
		
		//获取输出流  将数据写出
		PrintWriter writer = resp.getWriter();
		writer.write("<h1>"+"username: "+username+"</h1>");
		writer.write("<h1>"+"password: "+password+"</h1>");
		
		writer.close();
		
		
	}
	
	
	

}
