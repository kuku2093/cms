package com.factory.cms.exception;

public class SysException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SysException(String code,String message,Exception e) {
		super(code,message,e);
	}
	
	
	public SysException(MessageEnum message,Exception e) {
		super(message,e);
	}
	
	public SysException(MessageEnum message) {
		super(message);
	}
	
	
}
