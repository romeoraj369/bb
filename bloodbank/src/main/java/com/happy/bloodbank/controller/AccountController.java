package com.happy.bloodbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.happy.bloodbank.entity.AccountDetails;
import com.happy.bloodbank.service.AccountService;

@RestController
@RequestMapping("acc") 
public class AccountController {

	@Autowired
	private AccountService as;
	
	 @GetMapping("/all")
	 public ResponseEntity<List<AccountDetails>> getAllAcc(){
		 List<AccountDetails> list = as.getall();
		 return new ResponseEntity<List<AccountDetails>>(list,HttpStatus.OK);
	 }
	 @PostMapping("/saveAcc")
	 public ResponseEntity<AccountDetails> saveAcc(@RequestBody AccountDetails acc)
	 throws Exception{
		 as.save(acc);
		 return new ResponseEntity<AccountDetails>(acc, HttpStatus.CREATED);
	 }
	 
}