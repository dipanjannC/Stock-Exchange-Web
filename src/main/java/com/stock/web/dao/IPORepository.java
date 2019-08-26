package com.stock.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.stock.web.model.IPODetail;

public interface IPORepository extends JpaRepository<IPODetail, Integer> {

	IPODetail findByCompanyName(String companyName);
}
