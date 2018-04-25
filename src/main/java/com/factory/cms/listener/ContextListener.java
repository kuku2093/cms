package com.factory.cms.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class ContextListener implements ServletContextListener{
	
	Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// 监听器启动时
		logger.info("----------监听器启动-----------");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// 监听器销毁时
		logger.info("----------监听器销毁-----------");
	}
	
	
	
	
	
}
