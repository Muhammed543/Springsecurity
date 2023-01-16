package com.springsecurity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

	List<Invoice> findAll();

}
