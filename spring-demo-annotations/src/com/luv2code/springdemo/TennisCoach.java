package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// thatSillyCoach is the Explicit bean id
//@Component("thatSillyCoach")

// implicit bean id will be "tennisCoach" 
@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.coachName}")
	private String coachName;

	@Value("${foo.team}")
	private String team;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}

	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	 define a setter method
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getCoachName() {
		return coachName;
	}

	public String getTeam() {
		return team;
	}

}
