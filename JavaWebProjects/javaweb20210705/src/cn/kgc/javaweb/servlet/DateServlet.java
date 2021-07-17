package cn.kgc.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 处理前端页面的请求  返回一个当前系统时间
 * @author mosin
 * @date 2021年7月6日
 * @version  1.0
 */

public class DateServlet extends HttpServlet{
	
	/**
	 * HttpServletRequest req   请求参数    封装请求的数据
	 * HttpServletResponse resp 响应参数    将处理结果返回前端页面
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	    System.out.println("请求已接收");
	    //获取当前的系统时间并返回
	    Date date = new Date();
	    String dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	    
	    //将系统时间 返回前端页面  首先设置响应的格式 json  application/json  
	    resp.setContentType("text/html;charset=utf-8");
	    //通过响应对象获取输出流
	    PrintWriter writer = resp.getWriter();
	    //调用writer中的write方法 将数据写出
	    writer.write("<h1>"+dt+"</>");
	    //关闭流
	    writer.close();
   }
	
}
