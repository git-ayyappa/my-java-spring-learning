package com.ayyappa.springDemo;

public class RunningCoach implements Coach {
	private HappyFortuneService fortuneservice;
	public RunningCoach(HappyFortuneService fortuneservice) {
		this.fortuneservice=fortuneservice;
	}

	@Override
	public String training() {
		return "RUn 15k Hard Sprint";
	}

	@Override
	public String fortune() {
		return "you can do it "+this.fortuneservice.getFortune();
	}

	@Override
	public String getCoachName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}
	public void initMethod()
	{
		System.out.println("Init Method (bean started) Started..........");
	}
	public void destroyMethod()
	{
		System.out.println("Destroy Method Started...........");
	}
}















