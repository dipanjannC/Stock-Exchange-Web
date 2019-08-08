package com.stock.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(path="/index")
	public String index(){
		System.out.println("index working");
		return "index";
	}
	
	@RequestMapping(path="/register")
	public String register(){
		System.out.println("register working");
		return "register";
	}
}
