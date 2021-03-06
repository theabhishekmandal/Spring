package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
	private String firstName;

	@NotNull(message="is Required")
	@Size(min=1, message="is Required")
	private String lastName;
	
	
	/*
	 * If string is passed in, then the custom error is thrown
	 * which is declared in message.properties, and we know
	 * this will work because we have the BindingResult object, which
	 * will show the errors generated. So, in that error list
	 * we are just overriding the error in our properties class
	 * for custom error message
	 */
	@NotNull(message="is Required")
	@Min(value=0, message="must be greater than or equal to 0")
	@Max(value=10, message="must be smaller or equal to 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	@CourseCode(value={"TOPS", "LUV"}, message="must start with LUV or TOPS")
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
