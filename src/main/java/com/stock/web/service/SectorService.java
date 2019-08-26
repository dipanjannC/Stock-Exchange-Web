package com.stock.web.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.stock.web.model.Sector;
import com.stock.web.model.StockPrice;

public interface SectorService {

	public Sector insertSector(Sector sector) throws SQLException;
	public ResponseEntity<String> updateSector(int sectorId,Sector sector);
	public List<Sector> getSectorList() throws SQLException;
	public ResponseEntity<String> deleteSector(int sectorId);
	public List<StockPrice> getSectorPriceBetween(String sectorName,Date from,Date to)throws  SQLException;
}
