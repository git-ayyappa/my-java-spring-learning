package com.ayyappa.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayyappa.demo.dao.MailRepository;

@Service
public class MailService {
	@Autowired
	private MailRepository mailRepository;
	
	public void run(String args)
	{
		mailRepository.run(args);
	}
	public void newMail(String mail) {
		mailRepository.newMail(mail);
	}

}
