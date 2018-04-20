package com.factory.cms.exception;

public class MessageEnum {
	//全局异常默认99开头
	public static final MessageEnum  BASE_ERROR = new MessageEnum("999999","未知错误");
	
	//数据库错误
	public static final MessageEnum DB_ERROR = new MessageEnum("999998","数据库错误");
	
	//参数错误
	public static final MessageEnum PARAMS_ERROR = new MessageEnum("999997","参数错误");

	private String code;

	private String message;
	
	MessageEnum(String code,String message){
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}

	//用户模块异常10开头
	public static class UserMessageEnum extends MessageEnum{
		public static UserMessageEnum USER_LOGIN_ERROR = new UserMessageEnum("200001","用户登录失败");
		
		public UserMessageEnum(String code,String message) {
			super(code, message);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
