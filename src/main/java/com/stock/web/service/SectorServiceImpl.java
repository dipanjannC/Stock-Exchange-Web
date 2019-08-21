package com.stock.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Sector updateSector(Sector sector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sector> getSectorList() throws SQLException {
		// TODO Auto-generated method stub
		return sectorRepository.findAll();
	}

}
