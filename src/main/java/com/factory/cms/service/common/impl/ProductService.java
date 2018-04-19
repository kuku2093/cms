package com.factory.cms.service.common.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.cms.mapper.ProductMapper;
import com.factory.cms.model.Product;
import com.factory.cms.service.common.IProductService;

/**
 * 产品信息管理业务层
 * */
@Service
public class ProductService implements IProductService{

	@Autowired
	ProductMapper productMapper;
	
	@Override
	public List<Product> selectAllProduct() {
		// TODO Auto-generated method stub
		return productMapper.selectAll();
	}

}
