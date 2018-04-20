package com.factory.cms.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserException(String code,String message,Exception e) {
		super(code,message,e);
	}
	
	public UserException(MessageEnum message,Exception e) {
		super(message,e);
	}
	
	public UserException(MessageEnum message) {
		super(message);
	}
	
	public UserException(MessageEnum message,String msg) {
		super(message.getMessage(),msg);
	}
	
}
