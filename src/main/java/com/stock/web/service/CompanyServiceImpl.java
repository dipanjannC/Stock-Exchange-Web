package com.stock.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.stock.web.dao.CompanyDao;
import com.stock.web.model.Company;

public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	public CompanyDao companyDao;
	
	@Override
	public int insertCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		int companyCode = companyDao.insertCompany(company);
		return companyCode;
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> getCompanyList() throws SQLException {
		// TODO Auto-generated method stub
		return companyDao.getCompanyList() ;
	}

}
