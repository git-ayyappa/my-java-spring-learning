package com.annotations.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	FortuneService service;
	
	 
	@Override
	public String getDailyWorkouts() {
		return "practise back hand ralley on 1 hour";
	}
	@Override
	public String getFortune() {
		return this.service.getFortune();
	}
	@PostConstruct
	public void initMethod() {
		System.out.println("*****you are created a bean*****");
	}
	@PreDestroy
	public void destroyMethod() {
		System.out.println("*****you are created a bean*****");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getInstituteName() {
		// TODO Auto-generated method stub
		return null;
	}
}
