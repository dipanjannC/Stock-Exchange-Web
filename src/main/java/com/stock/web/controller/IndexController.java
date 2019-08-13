package com.stock.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.web.model.User;
import com.stock.web.service.UserService;

@Controller
public class IndexController {

	@Autowired
	public UserService userService;
	
	@RequestMapping(path="/index")
	public String index(){
		System.out.println("index working");
		return "index";
	}
	
	@RequestMapping(path="/register")
	public String register(ModelMap map){
		System.out.println("in register controller");
		map.addAttribute("user", new User());
		System.out.println("new User created");
		return "register";
	}
}
