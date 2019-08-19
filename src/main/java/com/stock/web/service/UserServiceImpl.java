package com.stock.web.service;

import com.stock.web.model.User;
import com.stock.web.dao.UserDao;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserDao userDao;
	
	@Override
	public int userLogin(User user) throws SQLException {
		// TODO Auto-generated method stub
		int checkValid=userDao.userLogin(user);
		return checkValid;
	}

	@Override
	public int UserSignUp(User user) throws SQLException {
		// TODO Auto-generated method stub
		int checkSignUp = userDao.userSignUp(user);
		return checkSignUp;
	}

}
