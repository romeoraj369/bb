package com.happy.bloodbank.service;

import java.util.List;

import com.happy.bloodbank.entity.RequestTable;

public interface RequestService {

	public List<RequestTable> getall();
	public RequestTable save(RequestTable rt);
}
