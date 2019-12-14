package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Interface.Coach;
import com.luv2code.springdemo.Interface.FortuneService;

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

	// init method
	@PostConstruct
	private void doInitialisation() {
		System.out.println("Initialisation code for TennisCoach Class");
	}
	
	// destroy method
	@PreDestroy
	private void doCleanup() {
		System.out.println("Cleanup code for TennisCoach Class");
	}
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
