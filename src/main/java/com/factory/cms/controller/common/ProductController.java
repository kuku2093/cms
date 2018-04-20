package com.factory.cms.controller.common;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.cms.model.Product;
import com.factory.cms.service.common.IProductService;

/**
 * 产品信息管理
 * */
@Controller
@RequestMapping("/product")
public class ProductController {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	IProductService productService;
	
	@RequestMapping("/list")
	@ResponseBody
	public Object list() {
		logger.info("===========查询所有的产品===========");
		List<Product> products = productService.selectAllProduct();
		return products;
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public Object select() {
		logger.info("===========查询指定的产品===========");
		String id = "1";
		Product product = productService.selectById(id);
		return product;
	}
	
	
}
