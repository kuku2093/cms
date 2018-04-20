package com.factory.cms.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseException extends RuntimeException{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;

	public BaseException(String code,String message) {
		super(message);
		this.code = code;
	}
	
	public BaseException(String code,String message,Exception e) {
		super(message,e);
		this.code = code;
	}
	
	public BaseException(MessageEnum message,Exception e) {
		super(message.getMessage(),e);
		this.code = message.getCode();
		
	}
	
	public BaseException(MessageEnum message) {
		super(message.getMessage());
		this.code = message.getCode();
		
	}
	
	
	
	
	
}
