package com.factory.cms.service.user.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.cms.mapper.UserMapper;
import com.factory.cms.model.User;
import com.factory.cms.service.user.IUserService;

/**业务层
 * */
@Service
public class UserService implements IUserService {
	
	//自动注入
	@Autowired
	private UserMapper usermapper;
	
	@Override
	public String check(User user) {
		// TODO Auto-generated method stub
		User userData = usermapper.findUserByUsername(user);
		if (user.getUsername().equals(userData.getUsername())) {
			if (user.getPassword().equals(userData.getPassword())) {
				return "index";
			}
			else {
				return "error";
			}
		}
		else {
			return "error";
		}
	}

	@Override
	public String add(User user) {
		// TODO Auto-generated method stub
		//主键
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		user.setId(uuid);
		Date date = new Date();
		user.setCreateTime(date);
		int i = usermapper.insert(user);
		if (0 == i) {
			return "error";
		}
		return "success";
	}

}
