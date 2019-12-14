package com.luv2code.springdemo.Demo5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Interface.Coach;

public class BeanLifeCycleDemoApp {
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach myCoach = context.getBean("myTrackCoach", Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		
		// close the context
		context.close();
		
	}
}
