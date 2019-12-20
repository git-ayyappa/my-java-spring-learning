package com.ayyappa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ayyappa.demo.alien.alien;
import com.ayyappa.demo.alienRepo.AlienDao;

@Controller
public class BasicController {
	
	@Autowired
	@Qualifier("repo")
	AlienDao repo;
	
	@RequestMapping(value="/")
	public ModelAndView home() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value="/index")
	public ModelAndView index(alien a)
	{
		System.out.println(a);
		repo.save(a);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value="/fetch")
	public ModelAndView fetch(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView();
		alien obj=repo.findById(aid).orElse(new alien());
		System.out.println(obj);
		System.out.println(repo.findByAname("ayyappa"));
		mv.addObject(obj);
		mv.setViewName("value");
		return mv;
	}
	@RequestMapping(value="/allValues")
	public void allValues()
	{
		System.out.println(repo.myQuery());
	}
}
