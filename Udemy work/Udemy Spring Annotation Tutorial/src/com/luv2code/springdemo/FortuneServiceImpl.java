package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FortuneService{

	@Override
	public String getFortune() {
		return "Your Fortune";
	}

}
