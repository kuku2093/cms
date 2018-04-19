package com.factory.cms.service.common;

import java.util.List;

import com.factory.cms.model.Product;

/**
 * 产品信息管理业务层
 * */
public interface IProductService {

	List<Product> selectAllProduct();

}
