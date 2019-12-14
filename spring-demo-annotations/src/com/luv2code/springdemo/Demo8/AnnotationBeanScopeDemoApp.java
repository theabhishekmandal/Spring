package com.luv2code.springdemo.Demo8;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 *  Here through @Component Scan and using default bean id 
 *  and using Dependency injection using @Autowired
 *  
 *  an @Autowired annotation on such a constructor is no longer necessary 
 *  if the target bean only defines one constructor to begin with. However, 
 *  if several constructors are available, at least one must be annotated to
 *  teach the container which one to use
 *  
 *  Using field injection instead of setter injection and constructor injection
 *  
 *  Using @Qualifier to decide which dependency to use out of multiple dependencies
 *  
 * 	Injecting properties file 
 * 
 * 	Adding @Scope("Singleton") in TennisCoach class and @Scope("Prototype") in BadmintonCoach class
 */

import com.luv2code.springdemo.Interface.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext8.xml");
		
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
