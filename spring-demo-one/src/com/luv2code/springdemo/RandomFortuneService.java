package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

	private String[] fortuneArray = {"good Morning, have a nice day", "All the best for today", "Give your 100 percent"};
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		Random random = new Random();
		return fortuneArray[random.nextInt(fortuneArray.length)];
	}

}
