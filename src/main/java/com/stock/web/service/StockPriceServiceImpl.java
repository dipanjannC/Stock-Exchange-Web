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
import com.stock.web.dao.StockPriceRepository;
import com.stock.web.model.Company;
import com.stock.web.model.StockPrice;

@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	public StockPriceRepository stockPriceRepository;
	
	@Autowired
	public CompanyRepository companyRepository;
	
	
	@Override
	public StockPrice insertStockPrice(StockPrice stockPrice) throws SQLException {
		// TODO Auto-generated method stub
		return stockPriceRepository.save(stockPrice);
	}
	

	@Override
	public ResponseEntity<String> updateStockPrice(int stockPriceId,StockPrice stockPrice) {
		// TODO Auto-generated method stub
		Optional<StockPrice> stockPriceData = stockPriceRepository.findById(stockPriceId);

		if (stockPriceData.isPresent()) {

			StockPrice _stockPrice = stockPriceData.get();
			_stockPrice.setStockExchangeId(stockPrice.getStockExchangeId());
			_stockPrice.setPrice(stockPrice.getPrice());
			_stockPrice.setDate(stockPrice.getDate());
			_stockPrice.setTime(stockPrice.getTime());
			return new ResponseEntity<>("Stock Price Updated successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public List<StockPrice> getStockPriceList() throws SQLException {
		// TODO Auto-generated method stub
		List<StockPrice> stockPrices = new ArrayList<>();
		stockPriceRepository.findAll().forEach(stockPrices::add);

		return stockPrices;
	}

	@Override
	public ResponseEntity<String> deleteStcokPrice(int stockPriceId) {
		// TODO Auto-generated method stub
		stockPriceRepository.deleteById(stockPriceId);
		return new ResponseEntity<>("Stock Price has been Deleted",HttpStatus.OK);
	}

	@Override
	public List<StockPrice> getStockPriceByCompany(String companyName) throws Exception {
		// TODO Auto-generated method stub
		Company company=companyRepository.findByCompanyName(companyName);
		return stockPriceRepository.findByCompanyCode(company.getCompanyCode());
	}

	@Override
	public List<StockPrice> getStockPriceBetween(int companyCode, Date fromDate, Date toDate) throws Exception{
		// TODO Auto-generated method stub
		return stockPriceRepository.getStockPrice(companyCode, fromDate, toDate);
	}

	
}
