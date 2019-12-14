package com.luv2code.springdemo.Demo2;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Interface.Coach;

/*
 * If no name is provided like above then default name is used which is
 * tennisCoach (notice the first letter is in lower case)
 */
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
