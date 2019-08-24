package com.stock.web.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.stock.web.dao.CompanyRepository;
import com.stock.web.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	public CompanyRepository companyRepository;

	@Override
	public Company insertCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		Company _company = companyRepository.save(company);

		return _company;
	}

	@Override
	public List<Company> getCompanyList() throws SQLException {
		// TODO Auto-generated method stub

		List<Company> companies = new ArrayList<>();
		companyRepository.findAll().forEach(companies::add);

		return companies;
	}

	@Override
	public ResponseEntity<String> deleteCompany(int companyCode) {
		// TODO Auto-generated method stub
		companyRepository.deleteById(companyCode);
		return new ResponseEntity<>("Company has been Deleted", HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> updateCompany(Company company) {
		// TODO Auto-generated method stub

		Optional<Company> companyData = companyRepository.findById(company.getCompanyCode());

		if (companyData.isPresent()) {

			Company _company = companyData.get();
			_company.setCompanyName(company.getCompanyName());
			_company.setCeo(company.getCeo());
			_company.setBrief(company.getBrief());
			_company.setStockCode(company.getStockCode());
			companyRepository.save(_company);
			return new ResponseEntity<>("Company Updated", HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
