package com.techgicus_Grp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component	//Its a stereotype.
			//Its an ordinary class and we want to make it special class so when we apply @component 
			//it will give us that option to generate this class object using @Autowired . 
			//So @Autowired will work when a class has this annotation.

public class EmailServiceImpl implements EmailService {
	
	//Inversion of control is the place where the logical code in spring is written which decides which object it should create Automatically.
	//It will automatically understand when we write JavaMailSender which java object to create and inject its address into it this logical thing is been done in 
	//Spring IOC. So the Dependency Injection is done in SpringIOC. During runtime which object to create and inject the add. into it.
	
	@Autowired
	private JavaMailSender emailSender;

	@Override
	public void sendSimpleEmailMessage(String to, String subject, String text) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("mohitchilhare007@gmail.com");
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		emailSender.send(message);
	}		
}
