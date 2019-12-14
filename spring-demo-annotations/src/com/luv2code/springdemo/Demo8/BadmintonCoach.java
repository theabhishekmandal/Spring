package com.luv2code.springdemo.Demo8;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Interface.Coach;
import com.luv2code.springdemo.Interface.FortuneService;

@Component
@Scope("prototype")
public class BadmintonCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public BadmintonCoach() {
		System.out.println(">> inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your smash";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

