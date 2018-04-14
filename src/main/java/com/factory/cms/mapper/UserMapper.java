package com.factory.cms.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.factory.cms.model.User;

@Mapper
public interface UserMapper {
	//查询用户是否存在
	User findUserByUsername(User user);
	//用户注册
	int insert(User user);
}
