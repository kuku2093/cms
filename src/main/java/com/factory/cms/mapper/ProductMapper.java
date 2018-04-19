package com.factory.cms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.factory.cms.model.Product;

@Mapper
public interface ProductMapper {

	List<Product> selectAll();
}
