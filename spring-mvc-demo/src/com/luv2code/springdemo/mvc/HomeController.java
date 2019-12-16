package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu"; 
		// In background it will return 
		// /WEB-INF/view/main-menu.jsp (see spring-mvc-demo-servlet.xml)
	}
}
