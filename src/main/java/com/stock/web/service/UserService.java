package com.stock.web.service;

import java.sql.SQLException;

import com.stock.web.model.User;

public interface UserService {

	public int userLogin(User user) throws SQLException;
	public int UserSignUp(User user) throws SQLException;
}
