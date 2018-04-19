package com.factory.cms.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 产品实体
 * */
public class Product {

	private String id;
	
	private String name;
	
	private String introduce;
	
	private String metal_company_id;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date product_out_time; 
	
	private String period;
	
	private String product_img;
	
	private String is_qualification;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getMetal_company_id() {
		return metal_company_id;
	}

	public void setMetal_company_id(String metal_company_id) {
		this.metal_company_id = metal_company_id;
	}

	public Date getProduct_out_time() {
		return product_out_time;
	}

	public void setProduct_out_time(Date product_out_time) {
		this.product_out_time = product_out_time;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getProduct_img() {
		return product_img;
	}

	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}

	public String getIs_qualification() {
		return is_qualification;
	}

	public void setIs_qualification(String is_qualification) {
		this.is_qualification = is_qualification;
	}
	
	
}
