package org.jgs.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/***
 * 处理前端页面的请求  返回一个当前系统时间
 * @author AlexYU
 *
 */
public class DateServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4910921139619369846L;

	
	/***
	 * HttpServletRequest req   请求参数  封装请求的数据
	 * HttpServletResponse resp 响应参数  将处理的结果返回静态页面
	 * 
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//System.out.println("请求已接收");
		
		//获取当前系统时间并返回
		String date = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss").format(new Date());
		
		// 将系统时间 返回前台页面  首先设置相应的格式  如:返回JSON格式 application/json
		resp.setContentType("text/html;charset=utf-8");
		
		// 通过相应的对象获取输入流
		PrintWriter writer = resp.getWriter();
		// 调用write中的write方法 将数据写出
		writer.write("<h1>"+date+"</h1>");
		// 关闭流
		writer.close();
		
	}

	
	
	
	

}
