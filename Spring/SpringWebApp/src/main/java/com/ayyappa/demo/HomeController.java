package com.ayyappa.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="home")
	public ModelAndView home(Aliens alienObj)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		mv.addObject("Aliens",alienObj);
		return mv;
	}
}
