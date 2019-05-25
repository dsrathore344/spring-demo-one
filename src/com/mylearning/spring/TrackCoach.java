package com.mylearning.spring;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5 km!!!";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it:"+ fortuneService.getFortune();
	}

}
