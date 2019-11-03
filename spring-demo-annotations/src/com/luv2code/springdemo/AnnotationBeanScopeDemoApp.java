package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach badmintonCoach = context.getBean("badmintonCoach", Coach.class);
		Coach alphaBadmintonCoach = context.getBean("badmintonCoach", Coach.class);
		
		// check if they are same
		boolean result = coach == alphaCoach;
		
		// print out the results
		System.out.println("Pointing to the same object " + result);
		System.out.println("Memory location of coach " + coach);
		System.out.println("Memory location of alphaCoach " + alphaCoach);

		// check if the result is same
		result = badmintonCoach == alphaBadmintonCoach;
		System.out.println();

		System.out.println("Pointing to the same object " + result);
		System.out.println("Memory location of badmintonCoach " + badmintonCoach);
		System.out.println("Memory location of alphaBadmintonCoach " + alphaBadmintonCoach);
		
		// close the context
		context.close();
	}
}
