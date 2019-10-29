package com.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		//System.out.println("Inside Baseball Class");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Baseball Daily Workout";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
}
