package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		// create a student object
		Student thestudent = new Student();
		
		// add student object to the model
		model.addAttribute("student", thestudent);
		
		System.out.println(
				"name: " + thestudent.getFirstName() + " " + thestudent.getLastName() + " country " + thestudent.getCountry()
				);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		// log the input data
		System.out.println("student : " + student.getFirstName() + " " + student.getLastName());
		return "student-confirmation";
	}
}
