package com.example.demo.model;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub

		//return p1.getProductName().compareTo(p2.getProductName());
		
		if(p1.getProductID()==p2.getProductID())
           return 0;
        else if(p1.getProductID()>p2.getProductID())
               return -1;
        else
        	return -1;
		
		
		
		
		
		
	
	
	}

}
