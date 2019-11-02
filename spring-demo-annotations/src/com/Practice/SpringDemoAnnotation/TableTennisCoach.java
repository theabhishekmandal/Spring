package com.Practice.SpringDemoAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "practice your top spin";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
