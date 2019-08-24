package com.stock.web.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.stock.web.dao.StockExchangeRepository;
import com.stock.web.model.StockExchange;

@Service
public class StockExchangeServiceImpl implements StockExchangeService{

	@Autowired
	public StockExchangeRepository stockExchangeRepository; 
	
	@Override
	public StockExchange insertStockExchange(StockExchange stockExchange) throws SQLException {
		// TODO Auto-generated method stub
		return stockExchangeRepository.save(stockExchange);
	}

	@Override
	public ResponseEntity<String> updateStockExchange(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		
		Optional<StockExchange> stockExchangeData = stockExchangeRepository.findById(stockExchange.getStockExchangeId());
		if (stockExchangeData.isPresent()) {

			StockExchange _stockExchange = stockExchangeData.get();
			_stockExchange.setStockExchange(stockExchange.getStockExchange());
			_stockExchange.setRemarks(stockExchange.getRemarks());
			_stockExchange.setAddress(stockExchange.getAddress());
			_stockExchange.setBrief(stockExchange.getBrief());
			
			stockExchangeRepository.save(_stockExchange);
			
			return new ResponseEntity<>("Stock Exchange Updated succesfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		}
	}

	@Override
	public List<StockExchange> getStockExchangeList() throws SQLException {
		// TODO Auto-generated method stub
		List<StockExchange> stockExchanges = new ArrayList<>();
		stockExchangeRepository.findAll().forEach(stockExchanges::add);

		return stockExchanges;
	}

	@Override
	public ResponseEntity<String> deleteStockExchange(int stockExchangeId) {
		// TODO Auto-generated method stub
		stockExchangeRepository.deleteById(stockExchangeId);
		return new ResponseEntity<>("Stock Exchange has been Deleted",HttpStatus.OK);
	}

}
