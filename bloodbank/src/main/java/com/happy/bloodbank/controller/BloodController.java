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

import com.happy.bloodbank.entity.BloodDetails;
import com.happy.bloodbank.service.BloodService;

@RestController
@RequestMapping("bld") 
public class BloodController {

	@Autowired
	private BloodService bs;
	
	 @GetMapping("/all")
	 public ResponseEntity<List<BloodDetails>> getAllBld(){
		 List<BloodDetails> list = bs.getall();
		 return new ResponseEntity<List<BloodDetails>>(list,HttpStatus.OK);
	 }
	 @PostMapping("/save")
	 public ResponseEntity<BloodDetails> saveBld(@RequestBody BloodDetails bd) 
	 throws Exception {
		 bs.save(bd);
		 return new ResponseEntity<BloodDetails>(bd, HttpStatus.CREATED);
	 }
}