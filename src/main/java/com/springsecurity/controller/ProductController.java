package com.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.springsecurity.model.Product;
import com.springsecurity.repository.ProductRepository;

@RequestMapping("/save")
public class ProductController {
	
	@Autowired
	private ProductRepository prorepo;
	@PostMapping("/save")
	public Product saveProducts(@RequestBody Product product)
	{
		System.out.println(product);
		Product products=prorepo.save(product);
		return products;
	}	

}
