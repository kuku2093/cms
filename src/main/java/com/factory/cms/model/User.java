package com.factory.cms.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 用户实体
 * 
 * 2018/4/13
 * */
public class User {

	private String id;
	
	private String username;
	
	private String password;
	
	private String option;
   
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
