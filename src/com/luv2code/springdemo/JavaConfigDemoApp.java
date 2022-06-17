package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		Coach tennisCoach1 = context.getBean("tennisCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(tennisCoach1.getDailyWorkout());
		System.out.println(tennisCoach1.getDailyFortune());
		
		// close the context
		context.close();		

	}

}
