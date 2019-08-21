package com.stock.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.web.dao.StockPriceRepository;
import com.stock.web.model.StockPrice;

@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	public StockPriceRepository stockPriceRepository;

	@Override
	public StockPrice insertStockPrice(StockPrice stockPrice) throws SQLException {
		// TODO Auto-generated method stub
		return stockPriceRepository.save(stockPrice);
	}

	@Override
	public StockPrice updateStockPrice(StockPrice stockPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockPrice> getStockPriceList() throws SQLException {
		// TODO Auto-generated method stub
		return stockPriceRepository.findAll();
	}

	
}
