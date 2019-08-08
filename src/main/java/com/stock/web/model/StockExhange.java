package com.stock.web.model;

public class StockExhange {

	private int stockexchangeId;
	private String stockExchange;
	private String brief;
	private String address;
	private String remarks;
	
	public int getStockexchangeId() {
		return stockexchangeId;
	}
	public void setStockexchangeId(int stockexchangeId) {
		this.stockexchangeId = stockexchangeId;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}

