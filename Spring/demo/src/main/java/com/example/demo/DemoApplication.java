package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		
		Mojo obj=context.getBean(Mojo.class);
		obj.show();
		obj.setId(123);
		obj.setName("ayyappa");
		obj.setCourse("cse");
		System.out.println(obj.toString());
		
		Mojo obj1=context.getBean(Mojo.class);
		obj1.show();
		obj1.setId(456);
		obj1.setName("kumar");
		obj1.setCourse("mech");
		System.out.println(obj1.toString());
	}

}
