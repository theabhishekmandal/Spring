package com.luv2code.springdemo.Demo10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
 * Here instead of reading configuration from xml we are reading from Java class
 */

import com.luv2code.springdemo.Interface.Coach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		// using default bean id i.e Class name in camel case
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		// call method on the bean
		System.out.println(coach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(coach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}
