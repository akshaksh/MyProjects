package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	//define bean for Sad Fortune Service and swim coach and DI
	@Bean
	public FortuneService getSadFortuneService(){
		return new SadFortuneService();
	}
	@Bean
	public Coach getSwimCoach(){
		return new SwimCoach(getSadFortuneService()); //Internally here also dependency injection is working
	}
}
