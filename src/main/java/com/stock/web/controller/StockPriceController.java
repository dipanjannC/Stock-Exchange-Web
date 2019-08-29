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

import com.stock.web.model.StockPrice;
import com.stock.web.service.StockPriceService;

@RestController
@RequestMapping("/stock-prices")
public class StockPriceController {
 
	@Autowired
	public StockPriceService stockPriceService;
	
	
	@PostMapping("/stock-price/add")
	public StockPrice addStockPrice(@RequestBody StockPrice stockPrice) throws SQLException {
		
		return stockPriceService.insertStockPrice(stockPrice);
	}
	
	
	@GetMapping("/stock-price/all")
	public List<StockPrice> getStockPrice() throws SQLException{
		
		return stockPriceService.getStockPriceList();
		
	}
	
	@DeleteMapping(value="/stock-price/delete/{stockPriceId}")
	public ResponseEntity<String> deleteCompany(@PathVariable("stcokPriceId") int stockPriceId){
		
		return stockPriceService.deleteStcokPrice(stockPriceId);
		
	}
	
	@PutMapping("/stock-price/update/{stockPriceId}")
	public ResponseEntity<String> updateStockPrice(@PathVariable("stockPriceId") int stockPriceId, @RequestBody StockPrice stockPrice) {
		
		
		return stockPriceService.updateStockPrice(stockPriceId,stockPrice);
	}
}
