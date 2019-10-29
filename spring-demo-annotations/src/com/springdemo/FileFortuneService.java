package com.springdemo;

import java.io.*;
import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	private  List<String> fortunes;
	private String filePath = "F:\\eclipse-workspace\\spring-demo-annotations\\src\\fortunes.txt";
	
	public FileFortuneService()
	{
		System.out.println("FileFortuneService : Inside default constructor");
	}
	
	@PostConstruct
	public void readFortunes()
	{
		System.out.println("FileFortuneService : Inside readFortunes");
		fortunes = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			
			String strCurrentLine;

			   while ((strCurrentLine = br.readLine()) != null) {
			    fortunes.add(strCurrentLine);
			   }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortunes.get((int)(Math.random()*fortunes.size()));
	}

}
