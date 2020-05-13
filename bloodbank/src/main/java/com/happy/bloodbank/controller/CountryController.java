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

import com.happy.bloodbank.entity.Country;
import com.happy.bloodbank.service.CountryService;

@RestController
@RequestMapping("Cntry") 
public class CountryController {

	@Autowired
	private CountryService cs;
	
	 @GetMapping("/all")
	 public ResponseEntity<List<Country>> getAllCountry(){
		 List<Country> list = cs.getall();
		 return new ResponseEntity<List<Country>>(list,HttpStatus.OK);
	 }
	 @PostMapping("/save")
	 public ResponseEntity<Country> saveCountry(@RequestBody Country ct) throws Exception{
		 cs.save(ct);
		 return new ResponseEntity<Country>(ct, HttpStatus.CREATED);
	 }
}