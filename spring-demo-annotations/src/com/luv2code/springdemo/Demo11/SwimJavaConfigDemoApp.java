package com.luv2code.springdemo.Demo11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.Interface.Coach;

/*
 *  Here we are creating beans manually by using @Bean and not using @Component and @ComponentScan
 */

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		// swimCoach bean id is the method name in SportConfig class
		Coach coach = context.getBean("swimCoach", Coach.class);
		
		// call method on the bean
		System.out.println(coach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(coach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}
