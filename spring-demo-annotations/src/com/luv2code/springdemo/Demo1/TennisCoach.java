package com.luv2code.springdemo.Demo1;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Interface.Coach;

// explicit bean id
@Component("thatSillyCoach")
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
