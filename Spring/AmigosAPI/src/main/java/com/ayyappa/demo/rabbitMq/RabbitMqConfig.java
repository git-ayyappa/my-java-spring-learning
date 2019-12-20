package com.ayyappa.demo.rabbitMq;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {
	@Value("")
	String queuename;
	@Value("")
	String exchange;
	@Value("")
	private String routingkey;
	@Bean
	Queue queue() {
		
	}
}
