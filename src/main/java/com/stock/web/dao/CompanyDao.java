package com.stock.web.dao;

import java.sql.SQLException;

import com.stock.web.model.Company;



public interface CompanyDao {

	public int insertCompany(Company company) throws SQLException;
	public Company updateCompany(Company company);
	
}
