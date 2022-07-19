package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Autowired
	private ProductRepository pr;

	@Override
	public void saveProductsDetails() {
		// TODO Auto-generated method stub
		
		pr.insertdata();
		
	}

}
