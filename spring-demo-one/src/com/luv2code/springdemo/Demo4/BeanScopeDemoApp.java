package com.luv2code.springdemo.Demo4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Interface.Coach;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach myCoach = context.getBean("myTrackCoach", Coach.class);
		Coach alphaCoach = context.getBean("myTrackCoach", Coach.class);
		
		// check if they are same
		boolean result = (myCoach == alphaCoach);
		System.out.println("\nPointing to the same object : " + result);
		System.out.println("\nMemory location for theCoach : " + myCoach);
		System.out.println("\nMemory location for alphaCoach : " + alphaCoach);
		
		// close the context
		context.close();
	}
}
