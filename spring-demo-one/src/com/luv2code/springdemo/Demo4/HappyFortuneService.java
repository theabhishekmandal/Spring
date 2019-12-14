package com.luv2code.springdemo.Demo4;

import com.luv2code.springdemo.Interface.FortuneService;

public class HappyFortuneService implements FortuneService{
	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
}