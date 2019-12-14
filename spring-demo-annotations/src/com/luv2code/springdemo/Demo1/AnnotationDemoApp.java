package com.luv2code.springdemo.Demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Interface.Coach;

/*
 *  Here through @Component Scan and using explicit bean id 
 */
public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		
		// get the bean from the spring container
		 Coach coach = context.getBean("thatSillyCoach", Coach.class);
		
		// call method on the bean
		System.out.println(coach.getDailyWorkout());

		// close the context
		context.close();
		
	}

}
