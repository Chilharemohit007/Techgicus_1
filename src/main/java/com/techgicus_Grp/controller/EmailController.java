package com.techgicus_Grp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techgicus_Grp.util.EmailUtil;

@Controller
public class EmailController {

	@Autowired
	private EmailUtil emailUtil;
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("email") String email, ModelMap modelMap) {
		modelMap.addAttribute("email", email);
		
		return "composeEmail";
	}
	
	@RequestMapping("/sendEmailClient")
	public String sendEmailClient(@RequestParam("email") String email,ModelMap modelMap) {
		modelMap.addAttribute("email", email);
		
		return "composeEmail2";
	}
	
	@RequestMapping("/send")
	public String sendEmail(@RequestParam("toEmail") String to, @RequestParam("subject") String sub, @RequestParam("emailBody") String emailBody,  ModelMap modelMap) {
	emailUtil.sendEmail(to, sub, emailBody);	
	modelMap.addAttribute("msg", "Email has Sent...!!!");
	return "composeEmail";
	}
	
	@RequestMapping("/sendMail")
	public String sendEmailClient(@RequestParam("toEmail") String to, @RequestParam("subject") String sub, @RequestParam("emailBody") String emailBody,  ModelMap modelMap) {
	emailUtil.sendEmailClient(to, sub, emailBody);	
	modelMap.addAttribute("msg", "Email has Sent...!!!");
	return "composeEmail2";
	}
	
}
