package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach tennisCoach2 = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		boolean result = (tennisCoach == tennisCoach2);
		
		// print out the results
		System.out.println("\nPointing to the same object : " + result);
		System.out.println("\nMemory location for first tennis coach : " + tennisCoach);
		System.out.println("\nMemory location for second tennis coach : " + tennisCoach2);
		
		// close context
		context.close();

	}

}
