package com.ayyappa.demo.MainController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayyappa.demo.Course.Course;
import com.ayyappa.demo.Course.Student;
import com.ayyappa.demo.CourseRepo.CourseRepo;
import com.ayyappa.demo.StudentRepo.StudentRepo;

@Service
public class MainService {
	@Autowired
	private CourseRepo crepo;
	@Autowired
	private StudentRepo srepo;
	
	public void Nothing() {
		Course course=new Course("go");
		
		Student st1=new Student("mansoor","shaik","mansoor@shaik.com");
		
		//Student st2=new Student("keshav","maharaj","keshav@maharaj.com");
		
		course.addStudent(st1);
		
		srepo.save(st1);
		
		crepo.save(course);
		
		//srepo.save(st2);
		
		
		
		//st1.addCourse(course);
		
		//course.addStudent(st2);
		
	}
}
