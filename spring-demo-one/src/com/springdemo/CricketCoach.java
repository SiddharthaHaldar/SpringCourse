package com.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	private String team;
	private String emailAddress;
	
	public CricketCoach()
	{
		System.out.println("Inside Cricket Class");
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket Daily Workout";
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}
	
	
}
