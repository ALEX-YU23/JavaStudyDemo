package cn.kgc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {
	//过滤器销毁时调用的方法   服务器正常关闭执行
	public void destroy() {
		System.out.println("destroy()");
	}

	//过滤器真正实现的功能    有请求匹配  执行该方法
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	     System.out.println("doFilter()");
	     //放行请求
	     System.out.println("编码过滤器放行前");
	     //设置编码格式
	     request.setCharacterEncoding("utf-8");
	     chain.doFilter(request, response);
	     System.out.println("编码过滤器放行后");
	}

	//过滤器的初始化  服务器启动 就会自动调用该方法
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("EncodingFilter init()");
	}

}
