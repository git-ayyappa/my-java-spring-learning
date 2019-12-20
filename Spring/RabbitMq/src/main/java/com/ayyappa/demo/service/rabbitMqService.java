package com.ayyappa.demo.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ayyappa.demo.rabbit.Rabbit;

@Service
public class rabbitMqService {
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	private String exchange="rabbitExchange";
	private String routingKey="hello";
	
	public void send(Rabbit rabbit) {
		rabbitTemplate.convertAndSend(exchange, routingKey, rabbit);
		System.out.println("Send msg = "+rabbit);
	}
}
