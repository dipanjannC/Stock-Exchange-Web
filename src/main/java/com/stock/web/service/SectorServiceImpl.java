package com.stock.web.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.stock.web.dao.SectorRepository;
import com.stock.web.model.Sector;

@Service
public class SectorServiceImpl implements SectorService {

	@Autowired
	public SectorRepository sectorRepository;

	@Override
	public Sector insertSector(Sector sector) throws SQLException {
		// TODO Auto-generated method stub
		return sectorRepository.save(sector);
	}

	@Override
	public ResponseEntity<String> updateSector(Sector sector) {
		// TODO Auto-generated method stub
		Optional<Sector> sectorData = sectorRepository.findById(sector.getSectorId());
		if (sectorData.isPresent()) {

			Sector _sector = sectorData.get();
			_sector.setSectorName(sector.getSectorName());
			_sector.setBrief(sector.getBrief());
			sectorRepository.save(_sector);
			return new ResponseEntity<>("sector Updated succesfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public List<Sector> getSectorList() throws SQLException {
		// TODO Auto-generated method stub
		List<Sector> sectors = new ArrayList<>();
		sectorRepository.findAll().forEach(sectors::add);

		return sectors;
	}

	@Override
	public ResponseEntity<String> deleteSector(int sectorId) {
		// TODO Auto-generated method stub
		sectorRepository.deleteById(sectorId);
		return new ResponseEntity<>("Sector has been Deleted", HttpStatus.OK);
	}

}
