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
@SequenceGenerator(name = "seq", initialValue = 2001, allocationSize = 1)
@Table(name = "company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(name = "company_code")
	private int companyCode;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "turnover")
	private double turnover;
	
	@Column(name = "ceo")
	private String ceo;
	
	@Column(name = "board_of_directors")
	private String boardOfDirectors;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "stock_exchange_id")
	@Column(name = "stock_exchanges")
	private List<StockExchange> stockExchanges;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sector_id")
	@Column(name = "sector")
	private List<Sector> sector;
	
	@Column(name = "brief")
	private String brief;

	@Column(name="stock_code")
	private int stockCode;
	
	
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}



	public List<StockExchange> getStockExchanges() {
		return stockExchanges;
	}
	public void setStockExchanges(List<StockExchange> stockExchanges) {
		this.stockExchanges = stockExchanges;
	}
	public List<Sector> getSector() {
		return sector;
	}
	public void setSector(List<Sector> sector) {
		this.sector = sector;
	}
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}

	
}
