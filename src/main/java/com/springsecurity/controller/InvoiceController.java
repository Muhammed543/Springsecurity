package com.springsecurity.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springsecurity.model.Invoice;
import com.springsecurity.repository.InvoiceRepository;
import com.springsecurity.service.InvoiceService;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {
	
	@Autowired
	private InvoiceRepository invoicerepo;
	
	private final InvoiceService invoiceservice;
	
	public InvoiceController(InvoiceService invoiceservice) {
		this.invoiceservice=invoiceservice;
	}
	
		
	
	@GetMapping("/invoices")
	public ResponseEntity<Map<String , List>> viewAll(){
		List<Invoice> restlist=invoicerepo.findAll();
		Map<String , List> map=new HashMap<>();
		map.put("invoice", restlist);
		
		return ResponseEntity.accepted().body(map);
	}
	
	@PostMapping("/add")
	public Invoice saveInvoice(@RequestBody Invoice addinvoice)
	{
		Invoice addinvo=invoicerepo.save(addinvoice);
		return addinvo;
	}

}
