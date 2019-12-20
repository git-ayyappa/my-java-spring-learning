package com.annotations.demo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	FortuneService fortuneService;
	@Value("${ayyappa.coachName}")
	private String name;
	
	@Value("${ayyappa.instituteName}")
	private String InstituteName;
	public SwimCoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkouts() {
		return "Practice bufferfly dive for one hour";
	}

	@Override
	public String getFortune() {
		return this.fortuneService.getFortune();
	}
	public String getName() {
		return name;
	}
	public String getInstituteName() {
		return InstituteName;
	}
}
