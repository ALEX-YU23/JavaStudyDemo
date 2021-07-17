package jgs.javaweb.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import jgs.javaweb.servlet.service.UserServiceImp;

@WebServlet("/checkUserServlet")
public class CheckUserServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8527585655581361248L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		
		UserServiceImp userServiceImp = new UserServiceImp();
		
		boolean checkUser = userServiceImp.checkUser(username);
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		if (checkUser) {
			map.put("msg", "0"); // 不合法
		} else {
			map.put("msg", "1"); // 合法
		}
		
		resp.setContentType("application/json;charset=utf-8");
		String jsonString = JSON.toJSONString(map);
		
		PrintWriter writer = resp.getWriter();
		writer.write(jsonString);
		
		writer.close();
		
		
		
		
	}

	
}
