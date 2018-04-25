package com.factory.cms.activemq.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.cms.activemq.domain.News;
import com.factory.cms.activemq.service.PushService;

@Controller
@RequestMapping("/push")
public class NewsController {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	 @Resource(name="newsPushService")  
	 private PushService newsPushService;  
	 
	/**
	 * 新闻推送
	 * 
	 * @param info
	 * @return
	 * @author Administrator
	 * @create 2016-8-10 下午4:22:38
	 */
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	@ResponseBody
	public Object newsPush(News info) {
		logger.info("=========推送消息開始=======");
		try {
			newsPushService.push(info);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("==========推送消息出錯========");
		}
		return info;
	}
}
