package com.stock.web.model;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@SequenceGenerator(name = "seq", initialValue = 2001, allocationSize = 1)
@Table(name = "Company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(name = "company_id")
	private int companyCode;
	

	@NotNull(message = "Enter Required Value")
	@Column(name = "company_name")
	private String companyName;
	
	
	@NotNull(message = "Enter Required Value")
	@Column(name = "turnover")
	private BigInteger turnOver;
	

	@NotNull(message = "Enter Required Value")
	@Column(name = "CEO")
	private String ceo;
	

	public Company() {
		super();
	}

	public Company(@NotNull(message = "Enter Required Value") String companyName,
			@NotNull(message = "Enter Required Value") BigInteger turnOver,
			@NotNull(message = "Enter Required Value") String ceo,
			@NotNull(message = "Enter Required Value") String boardOfDirectors,
			@NotNull(message = "Enter Required Value") Sector sector,
			@NotNull(message = "Enter Required Value") String brief,
			@NotNull(message = "Enter Required Value") String stockCode) {
		super();
		this.companyName = companyName;
		this.turnOver = turnOver;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.sector = sector;
		this.brief = brief;
		this.stockCode = stockCode;
	}

	@NotNull(message = "Enter Required Value")
	@Column(name = "Board_Of_Directors")
	private String boardOfDirectors;
	

	@JoinColumn(name = "sector_id")
	@NotNull(message = "Enter Required Value")
	@ManyToOne(fetch = FetchType.EAGER , cascade=CascadeType.ALL)
	@JsonBackReference
	private Sector sector;
	

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	@NotNull(message = "Enter Required Value")
	@Column(name = "Brief_Writeup")private String brief;
	

	@NotNull(message = "Enter Required Value")
	@Column(name = "stock_code")
	private String stockCode;

	


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

	

	public BigInteger getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(BigInteger turnOver) {
		this.turnOver = turnOver;
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



	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
}
