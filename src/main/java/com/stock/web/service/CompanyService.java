package com.stock.web.service;

import java.sql.SQLException;
import java.util.List;

import com.stock.web.model.Company;

public interface CompanyService {

	public Company insertCompany(Company company) throws SQLException;
	public Company updateCompany(Company company);
	public List<Company> getCompanyList() throws SQLException;
}
