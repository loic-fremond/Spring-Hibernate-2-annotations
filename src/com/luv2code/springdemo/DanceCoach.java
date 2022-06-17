package com.luv2code.springdemo;

public class DanceCoach implements Coach {
	
	private DanceFortuneService danceFortuneService;
	
	public DanceCoach(DanceFortuneService danceFortuneService) {
		this.danceFortuneService = danceFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your cha-cha moves.";
	}

	@Override
	public String getDailyFortune() {
		return this.danceFortuneService.getFortune();
	}

}
