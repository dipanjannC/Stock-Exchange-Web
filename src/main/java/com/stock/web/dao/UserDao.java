package com.stock.web.dao;

import java.sql.SQLException;

import com.stock.web.model.User;

public interface UserDao {

	public User userLogin(User user) throws SQLException;
	public int userSignUp(User user) throws SQLException;
}
