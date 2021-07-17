package cn.kgc.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
/*
 * 通过HttpSessionAttributeListener 监听session域中值的变化
 * 
 * 
 */
@WebListener
public class SessionAttrListener implements HttpSessionAttributeListener {

	//session域中添加值
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         System.out.println("session域中添加值");
    }

    //session域中移除值
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
    	System.out.println("session域中移除值");
    }

  //session域中替换值
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
    	System.out.println("session域中替换值");
    }
	
}
