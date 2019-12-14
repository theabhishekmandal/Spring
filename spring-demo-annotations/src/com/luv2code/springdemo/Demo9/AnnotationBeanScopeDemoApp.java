package com.luv2code.springdemo.Demo9;

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
 * 
 * 	Adding @PostConstruct and @PreDestroy methods
 * 	@PreDestroy methods are not called for prototype objects 
 */

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext9.xml");
		
		// retrieve the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		// close the context
		context.close();
	}
}
