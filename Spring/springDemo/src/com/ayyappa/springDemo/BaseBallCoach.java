package com.ayyappa.springDemo;

public class BaseBallCoach implements Coach {
	private  FortuneService fortuneService;
	
	

	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String training() {
		return "Practise on Batting for 1 hour";
	}

	@Override
	public String fortune() {
		return fortuneService.getFortune();
	}

}
