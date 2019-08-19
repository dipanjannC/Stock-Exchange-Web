package com.stock.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping(path="/adminView")
	public String index(){
		System.out.println("Admin view working");
		return "adminView";
	}
}
