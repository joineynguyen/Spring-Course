package com.luv2code.springdemo;

public class FootballCoach implements Coach 
{
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

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
