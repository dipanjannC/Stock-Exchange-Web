package com.stock.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.web.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

	
	
}
