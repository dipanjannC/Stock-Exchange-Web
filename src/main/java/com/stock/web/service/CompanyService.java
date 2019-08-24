package com.stock.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.stock.web.model.Company;

public interface CompanyService {

	public Company insertCompany(Company company) throws SQLException;
	public List<Company> getCompanyList() throws SQLException;
	public ResponseEntity<String> deleteCompany(int companyCode);
	public ResponseEntity<String> updateCompany(Company company);
}
