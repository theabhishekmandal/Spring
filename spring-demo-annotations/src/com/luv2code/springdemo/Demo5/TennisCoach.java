package com.luv2code.springdemo.Demo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Interface.Coach;
import com.luv2code.springdemo.Interface.FortuneService;


@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	// define default constructor
	public TennisCoach() {System.out.println("Inside default constructor");}
	
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
