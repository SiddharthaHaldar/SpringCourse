package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[]args)
	{
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach footballCoach = context.getBean("footballCoach",Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		
		System.out.println(tennisCoach.getDailyFortune());
		
		System.out.println(footballCoach.getDailyWorkout());
		
		context.close();
	}
}
