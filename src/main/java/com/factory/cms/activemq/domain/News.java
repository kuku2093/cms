package com.factory.cms.activemq.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class News implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String title;
	
	private String content;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startTime;
}
