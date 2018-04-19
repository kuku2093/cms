package com.factory.cms.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自动跳入登陆页面
 * */
@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping("**/*")
	public Object index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/index");
		return mv;
	}
	
	@GetMapping("login")
	public Object getIndex() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/index");
		return mv;
	}
	
	@PostMapping("login")
	public Object postIndex() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/index");
		return mv;
	}
}
