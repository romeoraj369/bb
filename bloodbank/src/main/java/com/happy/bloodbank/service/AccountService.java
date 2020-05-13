package com.happy.bloodbank.service;

import java.util.List;

import com.happy.bloodbank.entity.AccountDetails;

public interface AccountService {

	public List<AccountDetails> getall();
	public AccountDetails save(AccountDetails ad);
}