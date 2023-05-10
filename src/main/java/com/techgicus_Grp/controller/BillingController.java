package com.techgicus_Grp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techgicus_Grp.services.ClientService;

@Controller
public class BillingController {

	@Autowired
	private ClientService clientService;
	
	@RequestMapping("/payment")
	public String paymentPage() {
		return "billingPage";
	}
}
