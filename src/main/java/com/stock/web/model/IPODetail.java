package com.stock.web.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "seq", initialValue = 4001, allocationSize = 1)
@Table(name="ipo_details")
public class IPODetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(name = "ipo_id")
	private int ipoId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "company_code")
	//@Column(name = "company")
	private  Company company;
	
	@Column(name = "stock_exchange")
	private String stockExchange;
	
	@Column(name="price_per_share")
	private double pricePerShare;
	
	@Column(name="total_share")
	private int totalNumberOfShare;
	
	@Column(name="open_time_date")
	private String openTimeDate;
	
	@Column(name="remarks")
	private String remarks;
	
	
	public int getIpoId() {
		return ipoId;
	}
	public void setIpoId(int ipoId) {
		this.ipoId = ipoId;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public double getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public int getTotalNumberOfShare() {
		return totalNumberOfShare;
	}
	public void setTotalNumberOfShare(int totalNumberOfShare) {
		this.totalNumberOfShare = totalNumberOfShare;
	}
	public String getOpenTimeDate() {
		return openTimeDate;
	}
	public void setOpenTimeDate(String openTimeDate) {
		this.openTimeDate = openTimeDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
