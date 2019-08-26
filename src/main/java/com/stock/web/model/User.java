package com.stock.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@SequenceGenerator(name = "seq", initialValue = 1001, allocationSize = 1)
@Table(name = "User")

public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(name = "Id")
	private int userId;
	
	public User( String username, String password, String usertype, String email, int mobileNumber,
			String confirmed) {
		super();
		this.username = username;
		this.password = password;
		this.usertype = usertype;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.confirmed = confirmed;
	}


	public User() {
		// TODO Auto-generated constructor stub
	}


	@Column(name = "Username")
	@NotNull(message = "Enter Required Value")
	private String username;
	

	@Column(name = "Password")
	@NotNull(message = "Enter Required Value")
	private String password;
	
	
	@Column(name = "Usertype")

	private String usertype;
	
    
	@Column(name = "Email")
	@NotNull(message = "Enter Required Value")
	private String email;
	

	@Column(name = "Mobile_Number")
	@NotNull(message = "Enter Required Value")
	private int mobileNumber;
	

	@Column(name = "Confirmed")

	private String confirmed;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}
	
	
}
