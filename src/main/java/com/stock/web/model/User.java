package com.stock.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@SequenceGenerator(name = "seq", initialValue = 1001, allocationSize = 1)
@Table(name = "user")

public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "username")
	@NotNull(message = "Enter Required Value")
	private String username;
	

	@Column(name = "password")
	@NotNull(message = "Enter Required Value")
	@JsonIgnore
	private String password;
	
	
	@Column(name = "usertype")

	private String usertype;
	
    
	@Column(name = "email")
	@NotNull(message = "Enter Required Value")
	private String email;
	

	@Column(name = "mobile_number")
	@NotNull(message = "Enter Required Value")
	private long mobileNumber;
	

	@Column(name = "confirmed")

	private boolean confirmed;
	
	
	public User( String username, String password, String usertype, String email, long mobileNumber,
			boolean confirmed) {
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

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public boolean getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	
	
}
