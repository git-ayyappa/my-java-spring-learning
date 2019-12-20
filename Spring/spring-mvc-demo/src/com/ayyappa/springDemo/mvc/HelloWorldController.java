package com.ayyappa.springDemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/hello-world")
	public ModelAndView helloWorld()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("hello-world");
		return mv;
	}
	@RequestMapping(value="/processForm")
	public ModelAndView processForm(@RequestParam("studentName") String student)
	{
		System.out.println(student);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("hello-world");
		return mv;
	}
}
