package jgs.javaweb.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

import jgs.javaweb.servlet.entity.User;
import jgs.javaweb.servlet.service.UserServiceImp;

@WebServlet("/showAllUsers")
public class ReturnAllUsersServlet extends HttpServlet {
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
		
		
		resp.setContentType("application/json;charset=utf-8");
		PrintWriter writer = resp.getWriter();
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("test", jsonObject);
		System.out.println(jsonObject.toJSONString());
		
		writer.close();
	}
	
	

}
