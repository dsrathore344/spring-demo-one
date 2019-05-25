package com.mylearning.spring;

public class BaseballCoach implements Coach {
	
	//define a private field for dependecy
	private FortuneService fortuneService; 
	
	//define constructor injection for dependency
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do 100 push ups Bro !!!";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
	
}
