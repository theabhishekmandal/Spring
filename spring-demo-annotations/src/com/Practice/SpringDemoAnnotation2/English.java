package com.Practice.SpringDemoAnnotation2;

import org.springframework.stereotype.Component;

@Component
public class English implements Subject{
	
	public English() {
		
	}
	
	public String getSubjectName() {
		return "English";
	}
	
	public String getBookName() {
		return "wren and martin";
	}

}
