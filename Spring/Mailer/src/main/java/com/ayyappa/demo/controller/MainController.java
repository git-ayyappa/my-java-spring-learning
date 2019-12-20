package com.ayyappa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ayyappa.demo.mailer.Mailer;
import com.ayyappa.demo.service.MailService;

@Controller
public class MainController {
	@Autowired
	MailService mailService;
	
	public String send()
	{
		System.out.println("in controller");
		mailService.run(" ");
		return("done");
	}
	@RequestMapping(path="/home")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.html");
		return mv;
	}
	@RequestMapping(path="/adduser",method=RequestMethod.GET)
	public ModelAndView addUser(@RequestParam String mail) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.html");
		System.out.println(mail);
		mailService.newMail(mail);
		return mv;
	}
}
