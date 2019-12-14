package com.luv2code.springdemo.Demo2;

import java.util.Random;

import com.luv2code.springdemo.Interface.FortuneService;

public class RandomFortuneService implements FortuneService{

	private String[] fortuneArray = {"good Morning, have a nice day", "All the best for today", "Give your 100 percent"};
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		Random random = new Random();
		return fortuneArray[random.nextInt(fortuneArray.length)];
	}

}
