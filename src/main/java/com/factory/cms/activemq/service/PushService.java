package com.factory.cms.activemq.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/** 
 * 推送的接口 
 * 
 * @author Administrator 
 * 
 * @create 2018/4/25 
 * 
 * @version 1.0 
 */  
public interface PushService {
	
	public final ExecutorService pushExecutor = Executors.newFixedThreadPool(10);  
    
    public void push(Object info); 
}
