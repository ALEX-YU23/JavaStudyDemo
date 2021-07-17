package jgs.javaweb.servlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 1.演示 servlet的生命周期:指代的是serv1et从创建到销毁的过程
 * 2.init()初始化只会在 servlet第一次被访问的时候调用init()只会执行一次
 * 3.service()处理请求业务的方法只要有请求匹配就会被执行
 * 4.destroy() servlet销毁的方法当 tomcat容器被正常关闭的时候被调用
 * @author AlexYU
 *
 */
@WebServlet("/life")
public class LifeServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("init被调用");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service被调用");
	}

	@Override
	public void destroy() {
		System.out.println("destroy被调用");
		
	}

	
	
}
