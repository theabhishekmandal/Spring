package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from the spring container
		// first parm is bean id and second is the Class name
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		
		// new methods for the fortune
		System.out.println(theCoach.getDailyWorkout());
		
		// call our new methods to get the literal values
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		// close the context
		context.close();
				
	}

}
