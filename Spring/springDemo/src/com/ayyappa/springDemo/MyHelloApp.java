package com.ayyappa.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyHelloApp {

	public static void main(String[] args) {
		//Load The Spring COnfiguration File
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve Bean from spring COntainer
		Coach theCoach=context.getBean("TheCoach", Coach.class);
		//Call methods on bean
		System.out.println(theCoach.training());
		System.out.println(theCoach.fortune());
		//Close the context
		context.close();
	}
}
