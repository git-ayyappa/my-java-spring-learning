package com.annotations.demo;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data= {
			"Diligence is the mothetr of good luck",
			"hard work can beat talent, if talent does'nt work hard",
			"keep calm and focus on your goal"
	};
	private Random random=new  Random();
	@Override
	public String getFortune() {
		int num=random.nextInt(data.length);
		String fortuneService=data[num];
		return fortuneService;
	}
	@PostConstruct
	public void initMethod() {
		System.out.println("-------Random fortune bean created------");
	}
	@PreDestroy
	public void destroyMethod() {
		System.out.println("-------Random fortune bean created------");
	}

}
