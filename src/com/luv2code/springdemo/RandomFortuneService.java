package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings
	private String[] fortunes = {"Everything is possible !", "Nothing is impossible !", "Yes you can."};

	@Override
	public String getFortune() {
		// pick a random string from the array
		int random = new Random().nextInt(fortunes.length);
		return fortunes[random];
	}

}
