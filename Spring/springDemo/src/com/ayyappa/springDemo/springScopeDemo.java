package com.ayyappa.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanDemoApplicationContext.xml");

		Coach theCoach=context.getBean("TheCoach",Coach.class);
		Coach alphaCoach=context.getBean("TheCoach",Coach.class);
		boolean value=(theCoach==alphaCoach);
		System.out.println("beans are equal: "+value);
		System.out.println("memory of theCoach: "+theCoach);
		System.out.println("memory of alphaCoach:"+alphaCoach);
		context.close();
	}

}
