package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	public FortuneService fortuneService;
	
	public TennisCoach()
	{
		System.out.println("TennisCoach : Inside default constructor");
	}
	
	@PostConstruct
	public void doStartUpStuff()
	{
		System.out.println("TennisCoach : Inside doStartUpStuff");
	}
	
	@PreDestroy
	public void doCleanUpStuff()
	{
		System.out.println("TennisCoach : Inside doCleanUpStuff");
	}
	
//	@Autowired
//	public TennisCoach(@Qualifier("fileFortuneService")
//	FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//		System.out.println("TennisCoach : Inside parameterised constructor");
//	}
//	
//	@Autowired
//	@Qualifier("fileFortuneService")
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println("TennisCoach : Inside setter method");
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice back hand volley";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

}
