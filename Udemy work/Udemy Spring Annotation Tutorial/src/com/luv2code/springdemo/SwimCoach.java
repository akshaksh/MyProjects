package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	@Value("${name}")
	private String name;
	@Value("${email}")
	private String email;
	
	private FortuneService fortuneService;
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "swim 1000 KM as warm up";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}
