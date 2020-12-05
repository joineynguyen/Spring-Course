package com.luv2code.springdemo;

public class FootballCoach implements Coach 
{
	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService thefortuneService)
	{
		this.fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() 
	{
		return "RUN SUICIDE LAPSSSS, BOYYYYY!";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

}
