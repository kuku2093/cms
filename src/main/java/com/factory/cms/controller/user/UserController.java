package com.factory.cms.controller.user;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.factory.cms.model.User;
import com.factory.cms.service.user.IUserService;


/**
 * 用户登陆注册控制层
 * */
@Controller
@RequestMapping("/user")
public class UserController {
	
	//自动注入
	@Autowired
	private IUserService userService;
	
	/**
	 * 跳转登陆界面
	 * */
	@RequestMapping("/login")
	public String login() {
		return "user/login";
	}
	
	/**登陆验证
	 * */
	@RequestMapping("/check")
	public String check(User user) {
		if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
			return "user/login";
		}
		return userService.check(user);
	}
	
	/**用户注册
	 * */
	@RequestMapping("/register")
	public String register(User user) {
		if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
			return "user/register";
		}
		return userService.add(user);
	}
	
	
}
