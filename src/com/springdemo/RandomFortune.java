package com.springdemo;

public class RandomFortune implements FortuneService {
	
	String fortunes[]= {"Fortune 1","Fortune 2","Fortune 3"};
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortunes[(int)(Math.random()*3)];
	}

}
