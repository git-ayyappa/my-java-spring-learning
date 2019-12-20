package com.ayyappa.springDemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView homePage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		return mv;
		
		//return "home";
	}
}
