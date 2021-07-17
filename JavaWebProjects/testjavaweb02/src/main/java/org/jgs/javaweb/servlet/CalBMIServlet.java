package org.jgs.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalBMIServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9112873997862438631L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 设置请求格式
		req.setCharacterEncoding("utf-8");
		
		// 获取请求中封装的数据
		double height = Integer.parseInt(req.getParameter("height"))/100.0;
		double weight = Integer.parseInt(req.getParameter("weight"));
		
		//计算公式为：BMI=体重÷身高2。（体重单位：千克；身高单位：米。）
		double BMI = weight/Math.pow(height, 2);
		
		// 设置响应输出格式
		resp.setContentType("text/html;charset=utf-8");
		
		// 获取输出流
		PrintWriter writer = resp.getWriter();
		writer.write("<h1>您的BMI指数为:"+String.format("%.2f", BMI)+"</h1>");
		
		writer.close();
		
	}

	
	
	
}
