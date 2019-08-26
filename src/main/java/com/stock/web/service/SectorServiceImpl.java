package com.stock.web.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.stock.web.dao.CompanyRepository;
import com.stock.web.dao.SectorRepository;
import com.stock.web.dao.StockPriceRepository;
import com.stock.web.model.Company;
import com.stock.web.model.Sector;
import com.stock.web.model.StockPrice;

@Service
public class SectorServiceImpl implements SectorService {

	@Autowired
	public SectorRepository sectorRepository;
	
	@Autowired
	public CompanyRepository companyRepository;
	
	@Autowired
	public StockPriceRepository stockPriceRepository;

	@Override
	public Sector insertSector(Sector sector) throws SQLException {
		// TODO Auto-generated method stub
		return sectorRepository.save(sector);
	}

	@Override
	public ResponseEntity<String> updateSector(int sectorId, Sector sector) {
		// TODO Auto-generated method stub
		Optional<Sector> sectorData = sectorRepository.findById(sectorId);
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

	@Override
	public List<StockPrice> getSectorPriceBetween(String sectorName, Date from, Date to)
			throws SQLException {
		// TODO Auto-generated method stub
		Sector sector = sectorRepository.findBySectorName(sectorName);

		List<Company> companyList = companyRepository.findBySector(sector.getSectorId());
	
		List<StockPrice> stockPriceList = new ArrayList<>();
		
		for (Company company : companyList) {

			List<StockPrice> companyStock = stockPriceRepository.getStockPrice(company.getCompanyCode(), from, to);
			stockPriceList.addAll(companyStock);
		}
		
		return stockPriceList;
	}

}
