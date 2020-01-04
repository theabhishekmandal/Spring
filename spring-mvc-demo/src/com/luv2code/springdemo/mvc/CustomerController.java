package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	/*
	 * add an initbinder... to convert trim input Strings
	 * remove leading and trailing whitespaces
	 * resolve issue for our validation
	 */
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		// this removes leading and trailing whitespaces, true signifies if it is empty string
		// then convert it to null
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	
	// Spring will store the results of the validation in BindingResult object
	// @Valid signifies that the given object needs to be valiated using Validation rules
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		
		if(theBindingResult.hasErrors()) return "customer-form";
		return "customer-confirmation";
	}
}
