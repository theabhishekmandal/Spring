package com.Practice.SpringDemoAnnotation2;

import org.springframework.stereotype.Component;

@Component
public class Maths implements Subject{

	public Maths() {
		
	}
	
	public String getBookName() {
		return "RD sharma";
	}
	
	public String getSubjectName() {
		return "Math";
	}
}
