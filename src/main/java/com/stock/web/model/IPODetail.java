package com.stock.web.model;

public class IPODetail {
	
	private int ipoId;
	private String companyName;
	private String stockExchange;
	private double pricePerShare;
	private int totalNumberOfShare;
	private String openTimeDate;
	private String remarks;
	
	public int getId() {
		return ipoId;
	}
	public void setId(int ipoId) {
		this.ipoId = ipoId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
