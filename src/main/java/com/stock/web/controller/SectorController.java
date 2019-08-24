package com.stock.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.web.model.Sector;
import com.stock.web.service.SectorService;

@RestController
public class SectorController {

	@Autowired
	public SectorService sectorService;
	
	@PostMapping("/sector/add")
	public Sector addSector(@RequestBody Sector sector) throws SQLException {
		
		return sectorService.insertSector(sector);
	}
	
	
	@GetMapping("/sectors/all")
	public List<Sector> getSectors() throws SQLException{
		
		return sectorService.getSectorList();
		
	}

	@DeleteMapping(value="/sectors/{sectorId}")
	public ResponseEntity<String> deleteSector(@PathVariable("sectorId") int sectorId){
		
		return sectorService.deleteSector(sectorId);
		
	}
}
