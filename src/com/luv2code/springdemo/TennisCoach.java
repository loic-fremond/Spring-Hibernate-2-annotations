package com.luv2code.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach, DisposableBean {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
// commented constructor to demonstrate setter injection
/*	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	} */
	
	public TennisCoach() {
		System.out.println(">> TennisCoach : inside default constructor");
	}
	
	// define my init method
	// Code will execute after constructor and after injection of dependencies
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach : inside doMyStartupStuff");
	}
	
	// define my destroy method
	
	// commented to make use of custom bean processor for prototype scope beans
	/*@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach : inside doMyCleanupStuff");
	}*/
	
	// if scope of bean is "prototype", have to use custom bean processor (MyCustomBeanProcessor.java) to keep track of prototype beans and destroy them
	// so, predestroy is replaced by a special method implementing the DisposableBean destroy() method
	@Override
	public void destroy() throws Exception {
		System.out.println(">> TennisCoach : inside destroy()");
	}
	
	
	// setter method
	// commented to replicate this method below but with a completely different name just to demonstrate method injection
	/* @Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach : inside setFortuneService method");
		this.fortuneService = theFortuneService;
	} */
	
	// commented to make use of field injection directly
	/*@Autowired
	public void suchARandomNameButItWorks(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach : inside the crazy-named method");
		this.fortuneService = theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	

}
