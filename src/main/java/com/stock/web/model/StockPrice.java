package com.stock.web.model;

import java.util.Date;

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

	@Column(name = "stock_exchange_id")
	private int stockExchangeId;

	@Column(name = "current_price")
	private float price;

	@Column(name = "date")
	private Date date;

	public StockPrice(int stockPriceId, int companyCode, int stockExchangeId, float price, Date date, Date time) {
		super();
		this.stockPriceId = stockPriceId;
		this.companyCode = companyCode;
		this.stockExchangeId = stockExchangeId;
		this.price = price;
		this.date = date;
		this.time = time;
	}

	@Column(name = "time")
	private Date time;

	
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

	public int getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
