package com.factory.cms.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

@Aspect
@Order(30)
@Component
public class JsonResponseAop {
		//日志
		Logger logger =	LoggerFactory.getLogger(getClass());
		
		static ThreadLocal<Boolean> isError = new ThreadLocal() {
			@Override
			protected Object initialValue() {
				return false;
			}
			
		};
		
		/**
		 * aop请求拦截
		 * */
		//环绕通知
		@Around("execution(* com.factory.cms.controller..*Controller.*(..))")
		public Object jsonResponseAop(ProceedingJoinPoint proceedingJoinPoint) {
			JSONObject resObject = new JSONObject();
			JSONObject head = new JSONObject();
			
			try {
				Object o = proceedingJoinPoint.proceed();
				head.put("code", "0000");
				head.put("message", "ok");
				resObject.put("body", o);
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				isError.set(true);
				head.put("code", "1111");
				head.put("message", "error");
				logger.error("=====json处理数据异常=====");
			}
			resObject.put("head", head);
			
			return JSONObject.toJSONString(resObject, SerializerFeature.WriteMapNullValue);
		}
				
}
