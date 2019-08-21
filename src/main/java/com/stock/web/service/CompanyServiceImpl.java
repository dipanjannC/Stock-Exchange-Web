package com.stock.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.web.dao.CompanyRepository;
import com.stock.web.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	public CompanyRepository companyRepository;
	
	@Override
	public Company insertCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		return companyRepository.save(company);
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> getCompanyList() throws SQLException {
		// TODO Auto-generated method stub
		return companyRepository.findAll() ;
	}

}
