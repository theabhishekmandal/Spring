package com.Practice.SpringDemoAnnotation2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Abhishek implements Student {

	@Autowired
	@Qualifier("english")
	private Subject subject;
	
	@Value("${age}")
	private Integer age;
	
	@Value("${rollno}")
	private Long rollNumber;
	
	public Abhishek() {}

	@Override
	public String getStudentName() {
		return this.getClass().getCanonicalName();
	}

	@Override
	public String getSubjectAndBookName() {
		return "[" + subject.getBookName() + ", " + subject.getSubjectName() + "]";
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public Long getRollNo() {
		return this.rollNumber;
	}
	
	@PostConstruct
	public void before() {
		System.out.println("Starting Abhishek class");
	}
	
	@PreDestroy
	public void after() {
		System.out.println("Stopping Abhishek class");
	}
	
}
