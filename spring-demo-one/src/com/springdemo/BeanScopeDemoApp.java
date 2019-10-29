package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		
		Coach coach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = (coach == alphaCoach);
		
//		System.out.println(coach.getDailyFortune());
//		System.out.println(coach.getDailyWorkout());
//		System.out.println(coach.getClass());
		System.out.println(result);
		System.out.println("Memory location for coach :"+coach);
		System.out.println("Memory location for alphaCoach :"+alphaCoach);
		context.close();
	}

}
