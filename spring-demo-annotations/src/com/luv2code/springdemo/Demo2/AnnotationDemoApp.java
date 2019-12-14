package com.luv2code.springdemo.Demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Interface.Coach;

/*
 *  Here through @Component Scan and using default bean id 
 */
public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// get the bean from the spring container
		 Coach coach = context.getBean("tennisCoach", Coach.class);
		
		// call method on the bean
		System.out.println(coach.getDailyWorkout());

		// close the context
		context.close();
		
	}

}
