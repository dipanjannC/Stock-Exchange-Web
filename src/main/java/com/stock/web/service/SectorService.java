package com.stock.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.stock.web.model.Sector;

public interface SectorService {

	public Sector insertSector(Sector sector) throws SQLException;
	public ResponseEntity<String> updateSector(Sector sector);
	public List<Sector> getSectorList() throws SQLException;
	public ResponseEntity<String> deleteSector(int sectorId);
}
