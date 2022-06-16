package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class KayakCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// commented constructor to use setter injection instead
	/* public KayakCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	} */
	
	public KayakCoach() {
		System.out.println(">> KayakCoach default constructor");
	}
	
	// commented to make use of field injection instead
	/* @Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> KayakCoach : inside setFortuneService method");
		this.fortuneService = theFortuneService;
	} */

	@Override
	public String getDailyWorkout() {
		return "Row, row, row your boat !";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
