package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
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
