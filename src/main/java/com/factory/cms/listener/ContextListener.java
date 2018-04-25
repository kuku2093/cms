package com.factory.cms.listener;

import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.factory.cms.listener.model.Client;
import com.factory.cms.listener.service.ClientService;


/**配置springboot监听器，该类继承servletContextListener
 * 并且在springboot启动类上加ServletComponentScan注解
 * 
 * */

@WebListener
public class ContextListener implements ServletContextListener{
	
	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private ClientService clientService;
	
	/**
	 * 模拟场景一：监听器在启动时将服务器启动信息记录下来，保存到数据库中
	 * */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// 监听器启动时
		logger.info("----------监听器启动-----------");
		
		Date date = new Date();
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		Client client = new Client();
		client.setStartTime(date);
		client.setId(id);
		client.setIsStart("00");//00启动正常，01启动报错
		
		try {
			clientService.add(client);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("----------记录信息出错-----------");
		}
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// 监听器销毁时
		logger.info("----------监听器销毁-----------");
	}
	
	
	
	
	
}
