package com.luv2code.springdemo.Demo5;

import com.luv2code.springdemo.Interface.Coach;
import com.luv2code.springdemo.Interface.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theNewFortuneService) {
		this.fortuneService = theNewFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : Inside method doMyStartupStuff");
	}

	// add an destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach : Inside method doMyCleanUpStuff");
	}
	
}
