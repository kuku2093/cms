package com.factory.cms.listener.controller;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 查询在线人数
 * */
@Controller
@RequestMapping("/online")
public class OnlineController {

	
	@RequestMapping("/count")
	@ResponseBody
	public Object count(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		  try{  //把sessionId记录在浏览器  
	            Cookie c = new Cookie("JSESSIONID", URLEncoder.encode(httpServletRequest.getSession().getId(), "utf-8"));  
	            c.setPath("/");  
	            //先设置cookie有效期为2天，不用担心，session不会保存2天  
	            c.setMaxAge( 48*60 * 60);  
	            httpServletResponse.addCookie(c);  
	        }catch (Exception e){  
	            e.printStackTrace();  
	        }  
	  
	        HttpSession session = httpServletRequest.getSession();  
	        Object count=session.getServletContext().getAttribute("count");  
	        return count;  
	    }   
	
}
