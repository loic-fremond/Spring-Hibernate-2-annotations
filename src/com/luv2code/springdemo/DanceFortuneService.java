package com.luv2code.springdemo;

public class DanceFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Dance cause today is your lucky day !";
	}

}
