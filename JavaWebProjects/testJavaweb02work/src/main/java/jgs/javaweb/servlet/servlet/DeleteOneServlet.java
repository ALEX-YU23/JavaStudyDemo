package jgs.javaweb.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jgs.javaweb.servlet.service.UserServiceImp;

@WebServlet("/deleteOneServlet")
public class DeleteOneServlet extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = -2818776201358366860L;
	private UserServiceImp userServiceImp = new UserServiceImp();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 获取表单参数
		// 设置req编码格式
		req.setCharacterEncoding("utf-8");
		
		String id = req.getParameter("id");

		Boolean isDelete = userServiceImp.delete(Integer.parseInt(id));
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter writer = resp.getWriter();
		
//		writer.write("<h1>"+id+"</h1>");
		
		if (isDelete) {
			req.getRequestDispatcher("/showAllUsers").forward(req, resp); 
		} else {
			writer.write("<h1>注册失败</h1>");
		}
		
		writer.close();
	}
	
	

}
