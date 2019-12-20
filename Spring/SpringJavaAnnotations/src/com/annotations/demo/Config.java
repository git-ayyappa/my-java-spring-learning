package com.annotations.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.annotations.demo")
@PropertySource("classpath:swim.properties")
public class Config {
	
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	@Bean
	public Coach swimCoach(FortuneService fortuneService)
	{
		return new SwimCoach(sadFortuneService());
	}
	

}
