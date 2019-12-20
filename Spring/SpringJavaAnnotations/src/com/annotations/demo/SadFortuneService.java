package com.annotations.demo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Better luck next time, you have more time and use it wisely";
	}

}
