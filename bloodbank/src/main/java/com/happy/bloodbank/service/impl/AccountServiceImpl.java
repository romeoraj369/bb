package com.happy.bloodbank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happy.bloodbank.entity.AccountDetails;
import com.happy.bloodbank.repo.AccountRepo;
import com.happy.bloodbank.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountRepo ar;
	
	@Override
	public List<AccountDetails> getall(){
		return ar.findAll();
	}
    @Override
	public AccountDetails save(AccountDetails ad) {
		return ar.save(ad);
	}
}