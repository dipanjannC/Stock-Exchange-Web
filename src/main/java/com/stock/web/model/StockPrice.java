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
@Table(name = "stock_price")
public class StockPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(name = "stock_price_id")
	private int stockPriceId;

	@Column(name = "company_id")
	private int companyCode;

	@Column(name = "stock_exchange_Name")
	private String stockExchangeName;

	@Column(name = "current_price")
	private float price;

	@Column(name = "date")
	private String date;

	@Column(name = "time")
	private String time;
	
	public StockPrice(int stockPriceId, int companyCode, String stockExchangeName, float price, String date, String time) {
		super();
		this.stockPriceId = stockPriceId;
		this.companyCode = companyCode;
		this.stockExchangeName = stockExchangeName;
		this.price = price;
		this.date = date;
		this.time = time;
	}

	public StockPrice() {

	}
	
	public int getStockPriceId() {
		return stockPriceId;
	}

	public void setStockPriceId(int stockPriceId) {
		this.stockPriceId = stockPriceId;
	}

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
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
	
	@Override
	public String toString() {
		return "StockPrice [stockPriceId=" + stockPriceId + ", companyCode=" + companyCode + ", stockExchangeName="
				+ stockExchangeName + ", price=" + price + ", date=" + date + ", time=" + time + "]";
	}

}
