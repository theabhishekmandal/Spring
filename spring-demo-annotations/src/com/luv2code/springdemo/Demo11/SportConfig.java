package com.luv2code.springdemo.Demo11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.luv2code.springdemo.Interface.Coach;
import com.luv2code.springdemo.Interface.FortuneService;

@Configuration
public class SportConfig {
	
	// define bean for sad fortune service
	// here the method name is the bean id
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	// define a bean for our swim coach AND inject dependency
	@Bean
	// here the method name is the bean id
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
