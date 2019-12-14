package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Interface.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from the spring container
		// Coach coach = context.getBean("thatSillyCoach", Coach.class);
		// using default bean id
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		// call method on the bean
		System.out.println(coach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(coach.getDailyFortune());
		
		TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
		// call class specific methods
		
		System.out.println(tennisCoach.getCoachName());
		System.out.println(tennisCoach.getTeam());

		// close the context
		context.close();
		
	}

}
