package com.stock.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@SequenceGenerator(name = "seq", initialValue = 5001, allocationSize = 1)
@Table(name="stock_exchange")
public class StockExchange {
	
	@Id
	@Column(name="stock_exchange_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private int stockExchangeId;
	
	@NotNull(message="Enter required Value")
	@Pattern(regexp = "^[ A-Za-z]+$", message = "Company Name should not contain numbers")
	@Column(name="stock_exchange_name")
	private String stockExchangeName;
	
	@NotNull(message="Enter required Value")
	@Pattern(regexp = "^[ A-Za-z]+$", message = "Company Name should not contain numbers")
	@Column(name="brief")
	private String brief;
	
	@NotNull(message="Enter required Value")
	@Pattern(regexp = "^[ A-Za-z]+$", message = "Company Name should not contain numbers")
	@Column(name="contact_address")
	private String contactAddress;
	
	@NotNull(message="Enter required Value")
	@Pattern(regexp = "^[ A-Za-z]+$", message = "Company Name should not contain numbers")
	@Column(name="remarks")
	private String remarks;
	
	
	public int getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(int id) {
		this.stockExchangeId = id;
	}
	
	public String getStockExchangeName() {
		return stockExchangeName;
	}
	public void setStockExchangeName(String stockExchange) {
		this.stockExchangeName = stockExchange;
	}
	
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
