package com.ayyappa.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ayyappa.demo.dao.ALiensRepo;
import com.ayyappa.demo.model.Aliens;

@Controller
public class SpringController {
	@Autowired
	ALiensRepo alienrepo;
	
	@RequestMapping(value="/")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		System.out.println("Working FIne");
		return mv;
		//return "home.jsp";
	}
	@RequestMapping(value="/addAlien")
	public ModelAndView addAlien(Aliens alien)
	{
		alienrepo.save(alien);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
		
	}
}
