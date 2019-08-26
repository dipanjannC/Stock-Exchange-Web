package com.stock.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.stock.web.model.StockExchange;

public interface StockExchangeService {

	public StockExchange insertStockExchange(StockExchange stockExchange) throws SQLException;
	public ResponseEntity<String> updateStockExchange(int stockExchangeId,StockExchange stockExchange);
	public List<StockExchange> getStockExchangeList() throws SQLException;
	public ResponseEntity<String> deleteStockExchange(int stockExchangeId);
}
