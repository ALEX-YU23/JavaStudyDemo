package cn.kgc.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.kgc.javaweb.entity.User;
import cn.kgc.javaweb.service.UserService;
import cn.kgc.javaweb.service.UserServiceImpl;
import cn.kgc.javaweb.util.MD5Util;

@WebServlet("/registerServlet")
public class  RegisterServlet  extends HttpServlet{
	
	private UserService userService =  new UserServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取用户注册参数
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String nickname = req.getParameter("nickname");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(MD5Util.encryptPassword(password));
		user.setNickname(nickname);
		//动用service  实现用户的注册
		boolean  b =   userService.register(user);
		
		//设置响应格式  获取输出流
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter writer = resp.getWriter();
		if(b) {
			writer.write("<h1>注册成功</h1>");
		}else {
			writer.write("<h1>注册失败</h1>");
		}
		writer.close();
	}

}
