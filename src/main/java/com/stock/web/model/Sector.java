package com.stock.web.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;





@Entity
@SequenceGenerator(name = "seq", initialValue = 3001, allocationSize = 1)
@Table(name="sectors")
public class Sector {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(name="sector_id")
	private int sectorId;
	
	@Column(name="sector_name")
	 private String sectorName;
	
	@Column(name="sector_brief")
	 private String brief;

	
	  public int getSectorId() {
		return sectorId;
	}


	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}


	public String getSectorName() {
		return sectorName;
	}


	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}


	public String getBrief() {
		return brief;
	}


	public void setBrief(String brief) {
		this.brief = brief;
	}


	public List<Company> getCompanies() {
		return companies;
	}


	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}


	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="sector") 
	  @Column(nullable = true)
	  @JsonManagedReference
	  private List<Company> companies;
	/*@Override
	public String toString() {
		return "Sector [id=" + id + ", name=" + name + ", brief=" + brief + "]";
	}*/
	 
}
