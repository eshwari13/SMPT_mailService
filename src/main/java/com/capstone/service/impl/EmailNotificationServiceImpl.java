package com.capstone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.capstone.service.EmailNotificationService;

@Service
public class EmailNotificationServiceImpl implements EmailNotificationService {

	

	    @Autowired
	    private  final JavaMailSender mailSender;
	    
	    
	    public EmailNotificationServiceImpl(JavaMailSender mailSender) {
			super();
			this.mailSender = mailSender;
		}


		@Override
	    public void sendEmail(String sendTo, String subject, String body) {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setFrom("<enter email id>");
	        message.setTo(sendTo);
	        message.setSubject(subject);
	        message.setText(body);

	        mailSender.send(message);
	    }
	
}
