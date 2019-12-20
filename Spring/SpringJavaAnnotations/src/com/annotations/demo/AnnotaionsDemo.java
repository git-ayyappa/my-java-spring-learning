package com.annotations.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionsDemo {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Coach theCoach=context.getBean("swimCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkouts());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getInstituteName());
		context.close();
	}

}
