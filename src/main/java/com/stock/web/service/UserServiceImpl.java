package com.stock.web.service;

import com.stock.web.model.User;
import com.stock.web.dao.UserRepository;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	@Override
	public User userLogin(User user) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User userSignUp(User user) throws SQLException {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
