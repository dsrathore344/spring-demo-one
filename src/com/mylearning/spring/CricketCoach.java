package com.mylearning.spring;

public class CricketCoach implements Coach {

	private FortuneService fortuneServive;
	
	//create no-arg constructor 
	public CricketCoach() {
		System.out.println("Cricket Coach: inside no-arg constructor");
	}
	
	public FortuneService getFortuneServive() {
		return fortuneServive;
	}
	
	//our setter method  
	public void setFortuneServive(FortuneService fortuneServive) {
		System.out.println("Cricket Coach: inside setter method - setFortuneService");
		this.fortuneServive = fortuneServive;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 min today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneServive.getFortune();
	}

}
