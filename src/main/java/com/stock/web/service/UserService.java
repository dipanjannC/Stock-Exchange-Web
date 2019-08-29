package com.stock.web.service;

import java.util.List;

import com.stock.web.model.UserPojo;
import com.stock.web.model.User;

public interface UserService {

	User save(UserPojo user);

	List<User> findAll();

	void delete(int id);

	User findOne(String username);

	User findById(int id);

	UserPojo update(UserPojo userPojo);
}
