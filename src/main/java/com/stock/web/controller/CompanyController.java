package com.stock.web.controller;

import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.web.model.Company;
import com.stock.web.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	public CompanyService companyService;
	
	
	@PostMapping("/companies/add")
	public Company addCompany(@RequestBody Company company) throws SQLException {
		
		return companyService.insertCompany(company);
	}
	
	
	@GetMapping("/companies/all")
	public List<Company> getCompanies() throws SQLException{
		
		return companyService.getCompanyList();
		
	}
	
	
	@DeleteMapping(value="/companies/delete/{companyCode}")
	public ResponseEntity<String> deleteCompany(@PathVariable("companyCode") int companyCode){
		
		return companyService.deleteCompany(companyCode);
		
	}
	
	
	@PutMapping("/companies/update/{companyCode}")
	public ResponseEntity<String> updateCompany(@PathVariable("comanyCode") int companyCode, @RequestBody Company company) {
		return companyService.updateCompany(companyCode,company);

	}
	
	
	@GetMapping("/companies/all/{pattern}")
	public List<String> companyByNamePattern(@PathVariable("pattern") String pattern) throws Exception
	{
		
			return companyService.getListByPattern(pattern);
		
	}
	
	@GetMapping("/companies/details/{companyName}")
	public Company getDetailByCompanyName(@PathVariable("companyName") String companyName) throws Exception
	{
			return companyService.getDetailByCompanyName(companyName);
		
	}

	
}
