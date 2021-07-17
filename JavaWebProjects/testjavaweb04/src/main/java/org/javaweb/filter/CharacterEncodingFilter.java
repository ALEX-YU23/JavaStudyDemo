package org.javaweb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {

	@Override
	// 初始化
	public void init(FilterConfig filterConfig) throws ServletException {

		System.out.println("CharacterEncodingFilter初始化");
		
	}

	@Override
	// chain链
	/*
	 * 1. 过滤中的所有代码,在过滤特定请求的时候都会执行
	 * 2. 必须要让过滤继续放行
	 *    chain.doFilter(request, response);
	 * */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 放行过滤器
		chain.doFilter(request, response);
	}
	
	// 销毁
	@Override
	public void destroy() {
		System.out.println("CharacterEncodingFilter销毁");


	}

}
