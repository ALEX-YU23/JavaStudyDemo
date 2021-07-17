package org.javaweb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IsLoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public IsLoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see 过滤器销毁时调用的方法
	 */
	public void destroy() {
		System.out.println("IsLoginFilter过滤器destroy");
	}
	

	/**
	 * @see 过滤器真正实现的功能
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		String username = (String) req.getSession().getAttribute("username");
		String password = (String) req.getSession().getAttribute("password");
		
		HttpServletResponse resp = (HttpServletResponse)response;
		
		if (username==null||password==null) {
			resp.sendRedirect(req.getContextPath()+"/login.jsp");
		} else {
			chain.doFilter(req, resp);
		}

	}

	/**
	 * @see 过滤器的初始化
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("IsLoginFilter过滤器init");
	}

}
