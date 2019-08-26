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
@SequenceGenerator(name = "seq", initialValue = 4001, allocationSize = 1)
@Table(name = "ipo_details")
public class IPODetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(name = "ipo_id")
	private int ipoId;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "stock_exchange_id")
	private int stockExchangeId;

	@Column(name = "price_per_share")
	private float pricePerShare;

	@Column(name = "total_number_of_shares")
	private int totalNumberOfShares;

	@Column(name = "open_date_time")
	private Date openDateTime;

	@Column(name = "ipo_remarks")
	private String ipoRemarks;

	public int getIpoId() {
		return ipoId;
	}

	public void setIpoId(int ipoId) {
		this.ipoId = ipoId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public float getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(float pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public int getTotalNumberOfShares() {
		return totalNumberOfShares;
	}

	public void setTotalNumberOfShares(int totalNumberOfShares) {
		this.totalNumberOfShares = totalNumberOfShares;
	}

	public Date getOpenDateTime() {
		return openDateTime;
	}

	public void setOpenDateTime(Date openDateTime) {
		this.openDateTime = openDateTime;
	}

	public String getIpoRemarks() {
		return ipoRemarks;
	}

	public void setIpoRemarks(String ipoRemarks) {
		this.ipoRemarks = ipoRemarks;
	}

}
