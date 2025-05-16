package com.om.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	String index() {
		return "index";
	}
	
	@GetMapping("/register")
	String register() {
		return "register";
	}
	
	@GetMapping("/login")
	String login() {
		return "login";
	}
	
	@GetMapping("/about")
	String about() {
		return "about";
	}
	
}