package com.luv2code.springdemo.Demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Interface.Coach;
import com.luv2code.springdemo.Interface.FortuneService;


/*
 * If no name is provided like above then default name is used which is
 * tennisCoach (notice the first letter is in lower case)
 */
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	// Configure dependency injection with @Autowired Annotation
	// there is single implementation of fortuneService so no need to add @Qualifier
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
