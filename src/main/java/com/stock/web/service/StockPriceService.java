package com.stock.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.stock.web.model.StockPrice;

public interface StockPriceService {

	public StockPrice insertStockPrice(StockPrice stockPrice) throws SQLException;
	public ResponseEntity<String> updateStockPrice(StockPrice stockPrice);
	public List<StockPrice> getStockPriceList() throws SQLException;
	public ResponseEntity<String> deleteStcokPrice(int stockPriceId);
}
