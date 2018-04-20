package com.factory.cms.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 产品实体
 * 
 * @see 使用lombok简化代码，
 * 		无须在实体类中添加
 * (get/set/带参构造/无参构造/equals()/hashCode()/toString()等方法)
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
		 
}
