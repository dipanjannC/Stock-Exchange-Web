package com.stock.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.web.model.Company;
import com.stock.web.service.CompanyService;

@RestController
public class CustomerController {

	@Autowired
	public CompanyService companyService;
	
	
	@PostMapping("/company/add")
	public Company addCompany(@RequestBody Company company) throws SQLException {
		
		return companyService.insertCompany(company);
	}
	
	
	@GetMapping("/companies")
	public List<Company> getCompanies() throws SQLException{
		
		return companyService.getCompanyList();
		
	}

	
}
