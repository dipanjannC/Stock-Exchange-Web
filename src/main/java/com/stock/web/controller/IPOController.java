package com.stock.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.web.model.IPODetail;
import com.stock.web.service.IPOService;

@RestController
@RequestMapping("/ipo")
public class IPOController {

	@Autowired
	public IPOService ipoService;
	
	
	@PostMapping("/add")
	public IPODetail addIPO(@RequestBody IPODetail ipo) throws SQLException {
		
		return ipoService.insetIPO(ipo);
	}
	
	@DeleteMapping(value="/delete/{ipoId}")
	public ResponseEntity<String> deleteIPO(@PathVariable("ipoId") int ipoId){
		
		return ipoService.deleteIPO(ipoId);
		
	}
	
	@PutMapping("/update/{ipoId}")
	public ResponseEntity<String> updateIPO(@PathVariable("ipoId") int ipoId, @RequestBody IPODetail ipoDetails) {
		return ipoService.updateIPO(ipoId, ipoDetails);

	}
	
	@GetMapping("/all")
	public List<IPODetail> getIPODetails() throws SQLException{
		
		return ipoService.getIPODetails();
		
	}
	
	
	@GetMapping("/companies/{companyName}")
	public IPODetail getIPODetailsByCompany(@PathVariable("companyName") String companyName) throws Exception
	{
		
		return ipoService.getIPODetailByCompanyName(companyName);
		
	}
}
