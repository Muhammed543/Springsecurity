package com.springsecurity.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.springsecurity.model.Product;
import com.springsecurity.repository.ProductRepository;


@Controller
@RequestMapping("/user")
public class UserController {	
	
	@Autowired
	private ProductRepository prorepo;
	

	
	public String home() {
		return "user/home";
	}
	
	@GetMapping("/items")
	public ResponseEntity<Map<String , List>> viewitems(){
		List<Product> restlist=prorepo.findAll();
		Map<String , List> map=new HashMap<>();
		map.put("products", restlist);
		
		return ResponseEntity.accepted().body(map);
	}
}
