package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Note our HomeController class is defined in com.luv2code.springdemo.mvc,
 * but in spring-mvc-demo-servlet.xml we are defining the base package as
 * com.luv2code.springdemo.
 * 
 * So how does component scan work in this case?
 * 
 * For the Spring attribute: base-package="com.luv2code.springdemo"
 * 
 * Spring will recursively scan for components starting at the base package
 * "com.luv2code.springdemo" 
 * 
 * Recursive means first it will look at the base package and scan all the 
 * sub packages.
 * 
 * The package com.luv2code.springdemo.mvc is a sub package because of 
 * naming structure, just like folders on a file system.
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu"; 
		// In background it will return 
		// /WEB-INF/view/main-menu.jsp (see spring-mvc-demo-servlet.xml)
	}
}
