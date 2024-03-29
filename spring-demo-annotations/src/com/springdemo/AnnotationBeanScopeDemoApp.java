package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphacoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(coach == alphacoach);
		
		context.close();
	}

}
