package com.springsecurity.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springsecurity.model.Tax;
import com.springsecurity.service.TaxService;


   
public class TaxController {

	private TaxService taxservice;
	
	@RequestMapping("/calculateTax")
	public String calculateTax(@RequestBody Tax tax){
		
//		 double amount = amount * 0.05;
		return calculateTax(tax);
  
	
		
		
		
		
		}
}
