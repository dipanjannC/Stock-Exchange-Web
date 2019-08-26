package com.stock.web.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.stock.web.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

	List<Company> findBySector( int sectorId);
	
	Company findByCompanyName(String companyName);
	
	@Query("SELECT c.companyName FROM Company c WHERE c.companyName LIKE %:name% ")
	List<String> getPattern(@Param("name") String name);
	
}
