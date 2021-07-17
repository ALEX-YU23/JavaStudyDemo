package cn.kgc.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

@WebServlet("/checkUserServlet")
public class CheckUserServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("ajax请求已接收");
		System.out.println("username:"+username);
		
		HashMap<String, String> map = new HashMap<String,String>();
		
		if("admin".equals(username)) {
			map.put("msg", "用户名已存在");
		}else {
			map.put("msg", "用户名合法");
		}
		
		
		//将java对象转换为json字符串 响应给前端页面
		
		String jsonString = JSON.toJSONString(map);
		resp.setContentType("application/json;charset=utf-8");
		PrintWriter writer = resp.getWriter();
		writer.write(jsonString);
		writer.close();
	}

	
	
}
