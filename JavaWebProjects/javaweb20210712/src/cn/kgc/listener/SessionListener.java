package cn.kgc.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import cn.kgc.util.CountUtil;

@WebListener
public class SessionListener implements HttpSessionListener {

	//会话监听器创建
    public void sessionCreated(HttpSessionEvent arg0)  { 
        System.out.println("会话监听器创建");
        CountUtil.add();
        //arg0.getSession().setAttribute("online", CountUtil.getNum());
        arg0.getSession().getServletContext().setAttribute("online", CountUtil.getNum());
        
    }
    //会话监听器销毁
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         System.out.println("会话监听器销毁");
         CountUtil.sub();
         //arg0.getSession().setAttribute("online", CountUtil.getNum());
         arg0.getSession().getServletContext().setAttribute("online", CountUtil.getNum());
    }
	
}
