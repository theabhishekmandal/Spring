package com.luv2code.springdemo.Demo3;

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
 */
public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		// get the bean from the spring container
		 Coach coach = context.getBean("tennisCoach", Coach.class);
		
		// call method on the bean
		System.out.println(coach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(coach.getDailyFortune());

		// close the context
		context.close();
		
	}

}
