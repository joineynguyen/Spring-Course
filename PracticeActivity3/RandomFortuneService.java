package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService 
{
	private String[] fortunes = 
		{
				"You will have the best day.",
				"You will have horrible day.",
				"Your mindset will make your day"
		};
	
	Random rand = new Random();
	
	@Override
	public String getFortune() 
	{
		int rand_int = rand.nextInt(3);
		String fortune = fortunes[rand_int];
		
		return fortune;
	}

}
