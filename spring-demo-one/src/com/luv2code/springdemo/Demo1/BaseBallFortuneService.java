package com.luv2code.springdemo.Demo1;

import com.luv2code.springdemo.Interface.FortuneService;

public class BaseBallFortuneService implements FortuneService{
	@Override
	public String getFortune() {
		return "today you will score home run";
	}
}
