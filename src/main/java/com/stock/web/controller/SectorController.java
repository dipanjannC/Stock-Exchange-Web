package com.stock.web.controller;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

import com.stock.web.model.Sector;
import com.stock.web.model.StockPrice;
import com.stock.web.service.SectorService;

@RestController
@RequestMapping("sectors")
public class SectorController {

	@Autowired
	public SectorService sectorService;

	@PostMapping("/sector/add")
	public Sector addSector(@RequestBody Sector sector) throws SQLException {

		return sectorService.insertSector(sector);
	}

	@GetMapping("/sector/all")
	public List<Sector> getSectors() throws SQLException {

		return sectorService.getSectorList();

	}

	@DeleteMapping(value = "/sector/{sectorId}")
	public ResponseEntity<String> deleteSector(@PathVariable("sectorId") int sectorId) {

		return sectorService.deleteSector(sectorId);

	}

	@PutMapping("/sector/update/{sectorId}")
	public ResponseEntity<String> updateCompany(@PathVariable("sectorId") int sectorId, @RequestBody Sector sector) {
		
		return sectorService.updateSector(sectorId, sector);
	}

	@GetMapping("/sector/price/{sectorname}/{from}/{to}")
	List<StockPrice> getSectorPrice(@PathVariable("sectorname") String sector, @PathVariable("from") String from,
			@PathVariable("to") String to) throws  SQLException, ParseException {
		
		DateFormat datefm = new SimpleDateFormat("dd-MM-yyyy");
		
		return sectorService.getSectorPriceBetween(sector, datefm.parse(from), datefm.parse(to));
	}
}
