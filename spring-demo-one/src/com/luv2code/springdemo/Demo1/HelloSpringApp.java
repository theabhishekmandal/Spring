package com.luv2code.springdemo.Demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Interface.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext1.xml");
		
		// retrieve bean from the spring container
		// first parm is bean id and second is the interface
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theTrackCoach = context.getBean("myTrackCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theTrackCoach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theTrackCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}
