package com.stock.web.controller;


import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(path="/signUp",method =RequestMethod.POST)
	public String signUp(HttpServletRequest request,ModelMap map,@ModelAttribute("user") User user) {

		if (user.getPassword().equals(user.getConfirmPassword())) {
			int check = 0;
			try {
				check = userService.UserSignUp(user);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.addAttribute("user",user);
//			map.addAttribute("name", user.getUsername());
//	        map.addAttribute("id", user.getUserId());
//			request.setAttribute("success", "successs");
			return "register";
		}

		else {
//			request.setAttribute("passwordError", "passwordError");
//			return "PasswordError";
			return "Incorrect Password";
		}
		
	}
	
	@RequestMapping(path="/login",method =RequestMethod.POST)
	public String userLogin(HttpServletRequest request,@ModelAttribute("user") User user,ModelMap map){
		
		
		return null;
		
	}
	
}
