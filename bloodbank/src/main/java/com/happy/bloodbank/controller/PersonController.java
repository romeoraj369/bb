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

import com.happy.bloodbank.entity.PersonDetails;
import com.happy.bloodbank.service.PersonService;

@RestController
@RequestMapping("prsn") 
public class PersonController {

	@Autowired
	private PersonService ps;
	
	 @GetMapping("/all")
	 public ResponseEntity<List<PersonDetails>> getAllPrsn(){
		 List<PersonDetails> list = ps.getall();
		 return new ResponseEntity<List<PersonDetails>>(list,HttpStatus.OK);
	 }
	 @PostMapping("/save")
	 public ResponseEntity<PersonDetails> savePrsn(@RequestBody PersonDetails pd) 
	 throws Exception{
		 ps.save(pd);
		 return new ResponseEntity<PersonDetails>(pd,HttpStatus.CREATED);	
		 }
	 
}