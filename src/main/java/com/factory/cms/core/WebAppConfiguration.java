package com.factory.cms.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
	* @Description: 对文件的路径进行配置,创建一个虚拟路径/Path/** ，即只要在<img src="/path/picName.jpg" />便可以直接引用图片
	*这是图片的物理路径  "file:/+本地图片的地址"
	* @Date： Create in 14:08 2017/12/20
	*/ 
/*@Configuration
public class WebAppConfiguration extends WebMvcConfigurerAdapter {

	 public void addResourceHandlers(ResourceHandlerRegistry registry) {   
		    registry.addResourceHandler("/path/**").addResourceLocations("file:/D:/program/cms/src/main/resources/static/image");
		        super.addResourceHandlers(registry);
	 }

}
*/