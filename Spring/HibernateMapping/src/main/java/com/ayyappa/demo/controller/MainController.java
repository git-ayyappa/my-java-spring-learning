package com.ayyappa.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ayyappa.demo.instructorEntity.Instructor;
import com.ayyappa.demo.service.MainService;

@RestController
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public void hello(@RequestParam String firstName,String lastName,String email,String title) {
		this.mainService.hello(firstName,lastName,email,title);
	}
	
	@RequestMapping(path="/values/")
	public List<Instructor> helloBody() {
		return this.mainService.findAll();
	}
	
	@RequestMapping(path="getall/",method=RequestMethod.GET)
	public Optional<Instructor> getALL(@RequestParam long id)
	{
		return this.mainService.findById(id);
	}
	
	@DeleteMapping(path="/")
	public Optional<Instructor> delete(@RequestParam long id){
		Optional<Instructor> hi=this.mainService.findById(id);
		this.mainService.deleteById(id);
		return hi;
	}
	@RequestMapping(path="/getid")
	public Optional<Instructor> getInstructorDetail(@RequestParam long id){
		return this.mainService.findByIdInstructorDetail(id);
	}
	@RequestMapping(path="/addcourse")
	public Instructor addCourse(@RequestParam long id,String title) {
		return this.mainService.addCourses(id, title);		
	}
}
