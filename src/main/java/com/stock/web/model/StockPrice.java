package com.stock.web.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "seq", initialValue = 5001, allocationSize = 1)
@Table(name = "stock_price")
public class StockPrice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private int stockPriceId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "company_code")
	@Column(name = "company_name")
	private List<Company> company;
	
	@Column(name = "stock_exchange")
	private String stockExchange;
	
	@Column(name ="price")
	private double price;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "time")
	private String time;
	
	
	public int getStockPriceId() {
		return stockPriceId;
	}
	public void setStockPriceId(int stockPriceId) {
		this.stockPriceId = stockPriceId;
	}

	public List<Company> getCompany() {
		return company;
	}
	public void setCompany(List<Company> company) {
		this.company = company;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
