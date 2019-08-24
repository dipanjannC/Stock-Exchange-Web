package com.stock.web.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mysql.model.Customer;
import com.stock.web.model.Company;
import com.stock.web.service.CompanyService;

@RestController
public class CompanyController {

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
	
	@DeleteMapping(value="/companies/{companyCode}")
	public ResponseEntity<String> deleteCompany(@PathVariable("companyCode") int companyCode){
		
		return companyService.deleteCompany(companyCode);
		
	}
	
	@PutMapping("/customers/{id}")
	public ResponseEntity<Company> updateCustomer(@PathVariable("comanyCode") int companyCode, @RequestBody Company company) {
		return null;


	}
	

	
}
