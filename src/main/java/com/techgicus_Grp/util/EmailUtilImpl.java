package com.techgicus_Grp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class EmailUtilImpl implements EmailUtil {

	@Autowired
	private JavaMailSender emailSender;

	@Override
	public void sendEmail(String to, String sub, String emailBody) {

		 SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setFrom("chilharemohit2912gmail.com");
	        message.setTo(to); 
	        message.setSubject(sub); 
	        message.setText(emailBody);
	        emailSender.send(message);
	}

	@Override
	public void sendEmailClient(String to, String sub, String emailBody) {
		SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("chilharemohit2912gmail.com");
        message.setTo(to); 
        message.setSubject(sub); 
        message.setText(emailBody);
        emailSender.send(message);
	}
}
