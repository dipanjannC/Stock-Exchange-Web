package com.stock.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public StockExchange updateStockExchange(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockExchange> getStockExchangeList() throws SQLException {
		// TODO Auto-generated method stub
		return stockExchangeRepository.findAll();
	}

}
