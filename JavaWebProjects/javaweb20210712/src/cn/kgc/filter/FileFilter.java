package cn.kgc.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * 非法请求的拦截
 * 
 * @author mosin
 * date 2021年7月13日
 * @version  1.0
 */

public class FileFilter implements Filter {
   
	private static final ServletResponse HttpServletResponse = null;


	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest  req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
//		//获取请求路径  放行特定的页面
//		String uri = req.getRequestURI();
//		if(uri.endsWith("login.jsp")||uri.endsWith("regist.jsp")) {
//			chain.doFilter(req, resp);
//			return;
//		}
//		
//		//放行特定的请求
//		if(uri.endsWith("loginservlet")||uri.endsWith("registservlet")) {
//			chain.doFilter(req, resp);
//			return;
//		}
//		
//		//静态资源 .css .js img 
//		if(uri.endsWith(".css")||uri.endsWith(".js")) {
//			chain.doFilter(req, resp);
//			return;
//		}
//		HttpSession session = req.getSession();
//		String username =(String)session.getAttribute("username");
//		if(username==null) {
//			resp.sendRedirect("login.jsp");
//		}else {
//			//登录放行
//			chain.doFilter(req, resp);
//		}
		
		System.out.println("请求路径拦截放行前");
		chain.doFilter(req, resp);
		System.out.println("请求路径拦截放行后");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FileFilter init()");
	}

}
