package com.ayyappa.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach=context.getBean("cricketCoach", CricketCoach.class);
		System.out.println(theCoach.training());
		System.out.println(theCoach.fortune());
		System.out.println(theCoach.getCoachName());
		System.out.println(theCoach.getRole());
		context.close();
	}
}
