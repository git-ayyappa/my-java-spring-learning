package com.ayyappa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ayyappa.demo.rabbit.Rabbit;
import com.ayyappa.demo.service.rabbitMqService;

@RestController
public class rabbitController {
	@Autowired
	rabbitMqService rabbitService;
	
	@PostMapping("/rabbit/")
	public void hello(@RequestBody Rabbit rabbit) {
		this.rabbitService.send(rabbit);
	}
}
