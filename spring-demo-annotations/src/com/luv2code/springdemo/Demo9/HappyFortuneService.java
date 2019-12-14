package com.luv2code.springdemo.Demo9;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Interface.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
