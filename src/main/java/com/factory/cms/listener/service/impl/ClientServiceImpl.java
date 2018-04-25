package com.factory.cms.listener.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.cms.listener.mapper.ClientMapper;
import com.factory.cms.listener.model.Client;
import com.factory.cms.listener.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientMapper clientMapper;
	
	@Override
	public void add(Client client) {
		// TODO Auto-generated method stub
		
	}

}
