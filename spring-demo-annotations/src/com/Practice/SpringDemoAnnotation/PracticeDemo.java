package com.Practice.SpringDemoAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("practiceApplicationContext2.xml");
		
		Coach coach = context.getBean("tableTennisCoach", Coach.class);

		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		context.close();

	}

}
