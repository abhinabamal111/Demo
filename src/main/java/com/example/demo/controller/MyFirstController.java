package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ProductServiceImpl;

@RestController
@RequestMapping("/abc")
public class MyFirstController {
	
	
	@Autowired
	private ProductServiceImpl prs;
	
	@GetMapping("/def")
	public ResponseEntity<?> getDetails(){
		
		prs.saveProductsDetails();
		
		return new ResponseEntity<String>("Success",HttpStatus.OK);
	}
	
	
	

}
