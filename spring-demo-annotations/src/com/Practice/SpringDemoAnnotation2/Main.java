package com.Practice.SpringDemoAnnotation2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(Config.class);
		
		Student student = config.getBean("abhishek", Student.class);
		
		System.out.println(student.getStudentName());
		System.out.println(student.getRollNo());
		System.out.println(student.getAge());
		System.out.println(student.getSubjectAndBookName());
		
		config.close();
		
	}
}
