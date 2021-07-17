package jgs.javaweb.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jgs.javaweb.servlet.entity.User;
import jgs.javaweb.servlet.service.UserServiceImp;
import jgs.javaweb.servlet.util.MD5Utils;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 265144686596789204L;

	private UserServiceImp userServiceImp = new UserServiceImp();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 获取表单参数
		// 设置req编码格式
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String birthdayString = req.getParameter("birthday");
		Date birthday = null;
		try {
			birthday = new SimpleDateFormat("yyyy-MM-dd").parse(birthdayString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(MD5Utils.encryption(password));
		user.setBirthday(birthday);
		
		Boolean isRegister = userServiceImp.register(user);
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter writer = resp.getWriter();
		
		if (isRegister) {
			writer.write("<h1>注册成功</h1>");
		} else {
			writer.write("<h1>注册失败</h1>");
		}
		
		writer.close();
	}
	
	

}
