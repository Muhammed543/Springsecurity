package com.springsecurity.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.model.User;
import com.springsecurity.service.UserService;

@RestController


public class HomeController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/main")
	public String index() {
		return "index";
		
	}
	
	@GetMapping("/signin")
	public String login() {
		return "login";
		
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
		
	}
	@GetMapping("/product")
	public String product() {
		return "product";
		
	}
	
	@GetMapping("/invoice")
	public String invoice() {
		return "invoice";
		
	}
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute User user) {
		System.out.println(user);
		return "register";
	}
}

