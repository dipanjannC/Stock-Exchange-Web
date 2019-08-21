package com.stock.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "seq", initialValue = 6001, allocationSize = 1)
@Table(name = "stock_exchange")
public class StockExchange {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(name = "stock_exchange_id")
	private int stockExchangeId;
	
	@Column(name = "stock_exchange")
	private String stockExchange;
	
	@Column(name = "brief")
	private String brief;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "remarks")
	private String remarks;
	
	public int getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(int stockexchangeId) {
		this.stockExchangeId = stockexchangeId;
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

