package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	
	// this will throw error because /showForm is related to HelloWorldController class
	// so to avoid it we add requestmapping to the class of HelloWorldController
	// and to the main-menu.jsp 
	@RequestMapping("/showForm")
	public String showForm() {
		return "Silly";
	}
}
