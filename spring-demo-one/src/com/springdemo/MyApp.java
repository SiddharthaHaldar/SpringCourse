package com.springdemo;

public class MyApp {
	public static void main(String[]args)
	{
		Coach coach = new BaseballCoach(new HappyFortuneService());
		
		Coach coach2 = new TrackCoach(new HappyFortuneService());
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach2.getDailyWorkout());
	}
}

