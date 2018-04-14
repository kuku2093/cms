package com.factory.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * springboot run class
 * 
 * author wu 2018/4/13
 * */
@SpringBootApplication
@MapperScan("com.factory.cms.mapper")//配置mybatis扫描包 
public class CmsApplication extends SpringBootServletInitializer{
	
	//日志管理
	static Logger logger = LoggerFactory.getLogger(CmsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CmsApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CmsApplication.class);
	}
}
