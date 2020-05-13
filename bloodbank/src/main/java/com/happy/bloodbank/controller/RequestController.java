package com.happy.bloodbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.happy.bloodbank.entity.RequestTable;
import com.happy.bloodbank.etc.Search;
import com.happy.bloodbank.etc.SearchImpl;
import com.happy.bloodbank.service.RequestService;

@RestController
@RequestMapping("req")
public class RequestController {

	@Autowired
	private RequestService rs;
	@Autowired
	private SearchImpl ss;

	
	 @GetMapping("/all")
	 public ResponseEntity<List<RequestTable>> getAllreq(){
		 List<RequestTable> list = rs.getall();
		 return new ResponseEntity<List<RequestTable>>(list,HttpStatus.OK);
	 }

	 @GetMapping("/savereq")
	 public ResponseEntity<List<Search>> saveAc(@RequestBody RequestTable rt)
	 throws Exception{
		 		 rs.save(rt);
		 
		List<Search> lis = ss.getPrsn(rt.getCity(), rt.getReqBlood());
		
		return new ResponseEntity<List<Search>>(lis, HttpStatus.OK);
	 }
}
