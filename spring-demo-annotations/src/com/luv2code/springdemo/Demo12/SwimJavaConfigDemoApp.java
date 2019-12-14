package com.luv2code.springdemo.Demo12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 *  Here we are creating beans manually by using @Bean and not using @Component and @ComponentScan
 *  
 *  Using @PropertySource to inject properties
 */

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		// swimCoach bean id is the method name in SportConfig class
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		// call method on the bean
		System.out.println(coach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(coach.getDailyFortune());
		
		// call our new swim coach methods... has the props value injected
		System.out.println("email: " + coach.getEmail());
		System.out.println("team: " + coach.getTeam());
		
		// close the context
		context.close();
		
	}

}
