package com.stock.web.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.stock.web.model.Company;



public interface CompanyDao {

	public int insertCompany(Company company) throws SQLException;
	public Company updateCompany(Company company) throws SQLException;
	public ArrayList<Company> getCompanyList() throws SQLException;
}
