package com.happy.bloodbank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happy.bloodbank.entity.Country;
import com.happy.bloodbank.repo.CountryRepo;
import com.happy.bloodbank.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	private CountryRepo cr;
	
	@Override
	public List<Country> getall() {
		return cr.findAll();
	}
	
	@Override
	public Country save(Country country) {
		return cr.save(country);
	}
}