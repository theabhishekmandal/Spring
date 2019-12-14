package com.luv2code.springdemo.Demo7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Interface.Coach;

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
 */
public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext7.xml");
		
		// get the bean from the spring container
		 TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);
		
		// call method on the bean
		System.out.println(coach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(coach.getDailyFortune());
		
		// call method to display properties value
		System.out.println(coach.getEmail() + " " + coach.getTeam());

		// close the context
		context.close();
		
	}

}
