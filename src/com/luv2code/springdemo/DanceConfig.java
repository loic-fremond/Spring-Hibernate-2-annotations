package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DanceConfig {
	
	// create bean for fortune service
	@Bean
	public DanceFortuneService danceFortuneService() {
		return new DanceFortuneService();
	}
	
	// define for dance coach and inject fortune service dependency
	@Bean
	public DanceCoach danceCoach() {
		return new DanceCoach(danceFortuneService());
	}

}
