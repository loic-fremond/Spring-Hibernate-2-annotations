package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DanceDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DanceConfig.class);
		
		// retrieve bean from spring container
		Coach danceCoach = context.getBean("danceCoach", Coach.class);
		
		// call methods on bean
		System.out.println(danceCoach.getDailyFortune());
		System.out.println(danceCoach.getDailyWorkout());
		
		// do not forget to close context
		context.close();

	}

}
