package com.ayyappa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ayyappa.demo.dao.daoInterface;
import com.ayyappa.demo.model.person;

@Controller
public class personController {
	@Autowired
	@Qualifier("postgresql")
	daoInterface repo;

	@RequestMapping(value="/")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		System.out.println("hello");
		return mv;
	}
	
	@RequestMapping(value="/addPerson")
	public ModelAndView addPerson(person psn)
	{
		System.out.println("how are you");
		System.out.println(psn);
		repo.save(psn);
		System.out.println(psn);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		mv.addObject(psn);
		return mv;
	}
	/*@RequestMapping(value="/error")
	public ModelAndView errorHandler()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("error");
		return mv;
	}*/
	
	@RequestMapping(value="/getAll")
	public List<person> getAll()
	{
		System.out.println(repo.getAll());
		return repo.getAll();
	}
}
