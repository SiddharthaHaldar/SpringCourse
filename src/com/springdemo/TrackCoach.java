package com.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		//System.out.println("Inside Track Class");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Track Daily Workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void doMyStartUpStuff()
	{
		System.out.println("TrackCoach : inside doMyStartUpStuff");
	}
	
	public void doMyDestroyStuff()
	{
		System.out.println("TrackCoach : inside doMyDestroyStuff");
	}

}
