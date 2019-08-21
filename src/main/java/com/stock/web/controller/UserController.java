package com.stock.web.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.web.model.User;
import com.stock.web.service.UserService;

@RestController
public class UserController {

	@Autowired
	public UserService userService;
	
	
	@PostMapping("/user/signUp")
	public User addUser(@RequestBody User user) throws SQLException {
		
		return userService.userSignUp(user);
	}
	
	
	@PostMapping("/login")
	public User userLogin(@RequestBody User user) throws SQLException {
		
		return null;
	}
	
}
