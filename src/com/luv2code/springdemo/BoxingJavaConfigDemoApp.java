package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoxingJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		BoxingCoach boxingCoach = context.getBean("boxingCoach", BoxingCoach.class);
		
		// call methods on the bean
		System.out.println(boxingCoach.getDailyWorkout());
		System.out.println(boxingCoach.getDailyFortune());
		System.out.println("email : " + boxingCoach.getEmail());
		System.out.println("team : " + boxingCoach.getTeam());
		
		// close the context
		context.close();
		

	}

}
