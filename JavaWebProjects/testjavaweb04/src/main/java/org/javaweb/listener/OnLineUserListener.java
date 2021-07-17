package org.javaweb.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.javaweb.util.CountUtil;


@WebListener
public class OnLineUserListener implements HttpSessionListener {

	// session创建时计数器加一,并添加入application域
    public void sessionCreated(HttpSessionEvent se)  { 
    	CountUtil.add();
    	se.getSession().getServletContext().setAttribute("onLineCount", CountUtil.getCount());
    }

    // session创建时计数器减一,并添加入application域
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	CountUtil.sub();
    	se.getSession().getServletContext().setAttribute("onLineCount", CountUtil.getCount());
    }
	
}
