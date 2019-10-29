package com.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String data[]= {"Fortune 1","Fortune 2","Fortune 3"};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int idx = myRandom.nextInt(data.length);
		
		return data[idx];
	}

}
