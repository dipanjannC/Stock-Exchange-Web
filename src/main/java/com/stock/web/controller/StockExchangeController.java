package com.stock.web.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.web.model.StockExchange;
import com.stock.web.service.StockExchangeService;

@RestController
@RequestMapping("/stock-exchanges")
public class StockExchangeController {

	@Autowired
	public StockExchangeService stockExchangeService;
	
	@PostMapping("/stock-exchange/add")
	public StockExchange addStockExchange(@RequestBody StockExchange stockExchange) throws SQLException {
		
		return stockExchangeService.insertStockExchange(stockExchange);
	}
	
	
	@GetMapping("/stock-exchange/all")
	public List<StockExchange> getStockExchanges() throws SQLException{
		
		return stockExchangeService.getStockExchangeList();
		
	}
	
	@DeleteMapping(value="/stock-exchange/delete/{stockExchangeId}")
	public ResponseEntity<String> deleteStockExchange(@PathVariable("stockExchangeId") int stockExchangeId){
		
		return stockExchangeService.deleteStockExchange(stockExchangeId);
		
	}
	
	@PutMapping("/stock-exchange/update/{stcokExchangeId}")
	public ResponseEntity<String> updateStockExchanges(@PathVariable("stockExchangeId") int stockExchangeId, @RequestBody StockExchange stockExchange) {
		
		return stockExchangeService.updateStockExchange(stockExchangeId,stockExchange);
	}
	
}
