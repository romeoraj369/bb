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

import com.happy.bloodbank.entity.State;
import com.happy.bloodbank.service.StateService;

@RestController
@RequestMapping("state") 
public class StateController {

	@Autowired
	private StateService ss;
	
	 @GetMapping("/all")
	 public ResponseEntity<List<State>> getAllState(){
		 List<State> list = ss.getall();
		 return new ResponseEntity<List<State>>(list,HttpStatus.OK);
	 }
	 @PostMapping("/save")
	 public ResponseEntity<State> saveState(@RequestBody State st)
		 throws Exception{
			  ss.save(st);
			  return new ResponseEntity<State>(st,HttpStatus.CREATED);
		 
	 }
}