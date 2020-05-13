package com.happy.bloodbank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happy.bloodbank.entity.BloodDetails;
import com.happy.bloodbank.repo.BloodRepo;
import com.happy.bloodbank.service.BloodService;

@Service
public class BloodServiceImpl implements BloodService{
	
	@Autowired
	private BloodRepo br;
	
@Override
public List<BloodDetails> getall() {
	return br.findAll();
}
@Override
public BloodDetails save(BloodDetails bg) {
	return br.save(bg);
}
}