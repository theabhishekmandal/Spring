package com.luv2code.springdemo.Demo10;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Interface.Coach;
import com.luv2code.springdemo.Interface.FortuneService;


@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
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

}
