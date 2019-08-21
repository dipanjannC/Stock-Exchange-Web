package com.stock.web.service;

import java.sql.SQLException;
import java.util.List;

import com.stock.web.model.StockExchange;

public interface StockExchangeService {

	public StockExchange insertStockExchange(StockExchange stockExchange) throws SQLException;
	public StockExchange updateStockExchange(StockExchange stockExchange);
	public List<StockExchange> getStockExchangeList() throws SQLException;
}
