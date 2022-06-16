package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from the spring container
		Coach tennisCoach1 = context.getBean("tennisCoach", Coach.class);
		Coach kayakCoach1 = context.getBean("kayakCoach", Coach.class);
		SwimCoach swimCoach1 = context.getBean("swimCoach", SwimCoach.class);
		
		// call methods on the bean
		System.out.println(tennisCoach1.getDailyWorkout());
		System.out.println(tennisCoach1.getDailyFortune());
		System.out.println(kayakCoach1.getDailyWorkout());
		System.out.println(kayakCoach1.getDailyFortune());
		System.out.println(swimCoach1.getDailyWorkout());
		System.out.println(swimCoach1.getDailyFortune());
		System.out.println(swimCoach1.getEmail());
		System.out.println(swimCoach1.getTeam());
		
		// close the context
		context.close();
		

	}

}
