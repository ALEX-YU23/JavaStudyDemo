package cn.kgc.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 处理用户的登录请求
 * @author mosin
 * @date 2021年7月6日
 * @version  1.0
 */
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//解决中文乱码 设置请求的编码格式  必须要在获取请求参数之前
		req.setCharacterEncoding("utf-8");
		
		//获取请求对象中 封装的数据
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		
		//将数据响应到前端页面
		resp.setContentType("text/html;charset=utf-8");
		//获取输出流  将数据写出
		PrintWriter writer = resp.getWriter();
		writer.write("<h1>username:"+username+"</h1>");
		writer.write("<h1>password:"+password+"</h1>");
		writer.close();
		
		
	}

}
