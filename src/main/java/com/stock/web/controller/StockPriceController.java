package com.stock.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.web.model.StockPrice;
import com.stock.web.service.StockPriceService;

@RestController
public class StockPriceController {
 
	@Autowired
	public StockPriceService stockPriceService;
	
	
	@PostMapping("/stock-price/add")
	public StockPrice addStockPrice(@RequestBody StockPrice stockPrice) throws SQLException {
		
		return stockPriceService.insertStockPrice(stockPrice);
	}
	
	
	@GetMapping("/stock-prices/all")
	public List<StockPrice> getStockPrice() throws SQLException{
		
		return stockPriceService.getStockPriceList();
		
	}
}
