package com.stock.web.service;

import java.sql.SQLException;
import java.util.List;

import com.stock.web.model.StockPrice;

public interface StockPriceService {

	public StockPrice insertStockPrice(StockPrice stockPrice) throws SQLException;
	public StockPrice updateStockPrice(StockPrice stockPrice);
	public List<StockPrice> getStockPriceList() throws SQLException;
}
