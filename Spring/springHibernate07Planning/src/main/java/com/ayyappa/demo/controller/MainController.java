package com.ayyappa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ayyappa.demo.dao.BankAccountDao;
import com.ayyappa.demo.exception.BankTransactionException;
import com.ayyappa.demo.form.SendMoneyForm;
import com.ayyappa.demo.model.BankAccountInfo;

@Controller
public class MainController {
	
	@Autowired
	private BankAccountDao bankAccountDAO;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String showBankAccounts(Model model) {
		List<BankAccountInfo> list=bankAccountDAO.listBankAccountInfo();
		model.addAttribute("accountInfos", list);
		return "accountsPage";
	}
	
	@RequestMapping(value="/sendMoney",method=RequestMethod.GET)
	public String viewSendMoney(Model model) {
	SendMoneyForm form=new SendMoneyForm(1L,2L,200d);
	model.addAttribute("sendMoneyForm", form);
	return "sendMoneyPage";
	}
	
	@RequestMapping(value = "/sendMoney", method = RequestMethod.POST)
	public String processSendMoney(Model model,SendMoneyForm sendMoneyForm) {
		System.out.println("SendMoney::"+sendMoneyForm.getAmount());
		try {
			bankAccountDAO.sendMoney(sendMoneyForm.getFromAccountId(), sendMoneyForm.getToAccountId(), sendMoneyForm.getAmount());
		}catch(BankTransactionException e) {
			model.addAttribute("error message", "Error: "+e.getMessage());
			return "/sendMoneyPage";
		}
		return "redirect:/";
	}
}
