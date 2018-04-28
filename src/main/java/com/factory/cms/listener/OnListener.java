package com.factory.cms.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 使用springboot监听器实现统计在线人数
 * 
 * **/
@WebListener
public class OnListener implements HttpSessionListener{

	//访问终端人数
	int count = 0 ;

	//session创建时,synchronized 防并发bug 
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("【HttpSessionListener监听】----在线人数增加---");
		count++;
		 se.getSession().getServletContext().setAttribute("count", count);  
	}

	//session销毁时,在线人数减少
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("【HttpSessionListener监听】----在线人数减少---");
		count--;  
        se.getSession().getServletContext().setAttribute("count", count);  
	}
	
	
	
}
