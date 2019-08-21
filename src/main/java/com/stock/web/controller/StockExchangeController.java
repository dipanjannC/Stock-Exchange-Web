package com.stock.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.web.model.StockExchange;
import com.stock.web.service.StockExchangeService;

@RestController
public class StockExchangeController {

	@Autowired
	public StockExchangeService stockExchangeService;
	
	@PostMapping("/stock-exchange/add")
	public StockExchange addStockExchange(@RequestBody StockExchange stockExchange) throws SQLException {
		
		return stockExchangeService.insertStockExchange(stockExchange);
	}
	
	
	@GetMapping("/stock-exchanges/all")
	public List<StockExchange> getStockExchanges() throws SQLException{
		
		return stockExchangeService.getStockExchangeList();
		
	}
	
}
