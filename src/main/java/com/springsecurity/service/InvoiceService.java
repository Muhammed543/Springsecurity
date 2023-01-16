package com.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.model.Invoice;
import com.springsecurity.repository.InvoiceRepository;

@Service
public class InvoiceService {
   
	@Autowired
	private final InvoiceRepository invoicerepo;
   
	public InvoiceService(InvoiceRepository invoicerepo) {
		this.invoicerepo=invoicerepo;
	}
	
	public List<Invoice> findAllInvoices()
	{
		return invoicerepo.findAll();
	}
	
	public Invoice addInvoice(Invoice invoice) {
		return invoicerepo.save(invoice);
		
	}
	
	public void deleteInvoice(Long id) {
		try {
			invoicerepo.deleteById(id);
		}
		catch(Exception e) {
			throw e;
		}
	}
}
