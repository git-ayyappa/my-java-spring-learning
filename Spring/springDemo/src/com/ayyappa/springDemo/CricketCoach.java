package com.ayyappa.springDemo;

public class CricketCoach implements Coach {
	private String coachName;
	private String role;
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		System.out.println("Currently setting the name\n....\n.....\n......\n........");
		this.coachName = coachName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		System.out.println("Currently setting the Role\n....\n.....\n......\n........");
		this.role = role;
	}

	HappyFortuneService fortuneService=new HappyFortuneService();
	public CricketCoach() {
		System.out.println("inside the cricket class");
	}
	public void setFortuneService(HappyFortuneService fortuneService)
	{
		System.out.println("inside the setter injection method");
		this.fortuneService=fortuneService;
	}
	@Override
	public String training() {
		return "Practice bowling with single stump";
	}

	@Override
	public String fortune() {
		return this.fortuneService.getFortune();
	}

}
