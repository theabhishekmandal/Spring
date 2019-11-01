package com.Practice.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the SpringConfiguration file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("PracticeApplicationContext.xml");
		
		// get the beans
		Santro santro = context.getBean("santro", Santro.class);
		Santro santro2 = context.getBean("santro", Santro.class);
		Ferrari fer	= context.getBean("ferrari", Ferrari.class);
		Ferrari fer2 = context.getBean("ferrari", Ferrari.class);
		
		// call the class methods
		System.out.println(santro.getCarDetails() + "\n" + santro.getCarClass());
		System.out.println(fer.getCarDetails() + "\n" + fer.getCarClass());
		
		// Check if both are same
		System.out.println("pointing to the same object : " + (santro == santro2));
		System.out.println("pointing to the same object : " + (fer == fer2));
		
		// close the context
		context.close();
	}

}
