package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Coach coach = context.getBean("myCoach2",Coach.class);
		Coach cricketCoach = context.getBean("myCricketCoach",Coach.class);
		//BaseballCoach bCoach = context.getBean("myCoach",BaseballCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		//System.out.println(bCoach.getDailyFortune());
		context.close();
		
	}

}
