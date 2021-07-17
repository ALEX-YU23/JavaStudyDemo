package cn.kgc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicationListener implements ServletContextListener {

	//全局域对象监听器的创建  tomcat 服务器启动 就会被创建
	public void contextInitialized(ServletContextEvent arg0)  { 
	       System.out.println("全局域对象监听器的创建");
	       arg0.getServletContext().setAttribute("bp", arg0.getServletContext().getContextPath() );
	       
    }
	
	//全局域对象监听器的销毁  tomcat 服务器正常关闭 会执行该方法
    public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("//全局域对象监听器的销毁");
    }


    
	
}
