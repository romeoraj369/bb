package com.happy.bloodbank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happy.bloodbank.entity.PersonDetails;
import com.happy.bloodbank.repo.PersonRepo;
import com.happy.bloodbank.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepo pr;
	
@Override
public List<PersonDetails> getall() {
	return pr.findAll();
}
@Override
public PersonDetails save(PersonDetails pd) {
	return pr.save(pd);
}
}