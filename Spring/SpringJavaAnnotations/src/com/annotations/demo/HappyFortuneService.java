package com.annotations.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "From HappyFortuneService:May GOD Bless You";
	}
	@PostConstruct
	public void initMethod() {
		System.out.println("_______fortune bean created______");
	}
	@PreDestroy
	public void destroyMethod() {
		System.out.println("_______fortune bean created______");
	}

}
