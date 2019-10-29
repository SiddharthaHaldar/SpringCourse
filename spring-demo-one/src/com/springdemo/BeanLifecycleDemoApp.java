package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("BeanLifecycle-applicationContext.xml");
		
		Coach coach = context.getBean("myCoach",Coach.class);
		
		System.out.println("Memory location for coach :"+coach);
		//System.out.println("Memory location for alphaCoach :"+alphaCoach);
		context.close();
	}

}
