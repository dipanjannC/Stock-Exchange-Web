package com.stock.web.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.stock.web.model.IPODetail;

public interface IPOService {

	public IPODetail insetIPO(IPODetail ipo);
	public IPODetail getIPODetailByCompanyName(String companyName);
	public ResponseEntity<String> updateIPO(int ipoId,IPODetail ipoDetails);
	public ResponseEntity<String> deleteIPO(int ipoId);
	public List<IPODetail> getIPODetails();
	
}
