package com.luv2code.springdemo;

import com.luv2code.springdemo.Interface.FortuneService;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
