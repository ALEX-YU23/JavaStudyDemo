package org.javaweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * 项目源地址配置
 * @author AlexYU
 *
 */
public class BasePathListener implements ServletContextListener {


    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("BasePathListener监听器创建");
    	sce.getServletContext().setAttribute("bp", sce.getServletContext().getContextPath()); 
    	System.out.println("项目根地址设置");
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("BasePathListener监听器销毁");
    }

	
	
}
