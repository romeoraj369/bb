package com.happy.bloodbank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happy.bloodbank.repo.StateRepo;
import com.happy.bloodbank.entity.State;
import com.happy.bloodbank.service.StateService;

@Service
public class StateServiceImpl implements StateService{
	
	@Autowired
	private StateRepo sr;
	
@Override
public List<State> getall() {
	return sr.findAll();
}
@Override
public State save(State state) {
	return sr.save(state);
}
}