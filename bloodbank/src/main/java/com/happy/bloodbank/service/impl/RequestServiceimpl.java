package com.happy.bloodbank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happy.bloodbank.entity.RequestTable;
import com.happy.bloodbank.repo.RequestRepo;
import com.happy.bloodbank.service.RequestService;
@Service
public class RequestServiceimpl implements RequestService{

	@Autowired
	private RequestRepo rp;
	
	@Override
	public List<RequestTable> getall() {
	     return rp.findAll();
	}

	@Override
	public RequestTable save(RequestTable rt) {
		return rp.save(rt);
	}}
