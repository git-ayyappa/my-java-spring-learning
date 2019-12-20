package com.ayyappa.demo.MainController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseStudentController {
	@Autowired
	public MainService mainService;
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public void Nothing() {
		System.out.println("in controller");
		this.mainService.Nothing();
	}
}
