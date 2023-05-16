package com.capstone.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.model.EmailNotification;
import com.capstone.service.EmailNotificationService;

@RestController
public class EmailNotificationController {
	private final EmailNotificationService emailService;
	
	public EmailNotificationController(EmailNotificationService emailService) {
		super();
		this.emailService = emailService;
	}



	@PostMapping(value="/email-notification")
	public ResponseEntity sendEmail(@RequestBody EmailNotification email) {
		this.emailService.sendEmail(email.getSendTo(), email.getSubject(), email.getMessage());
		return ResponseEntity.ok("Sucessful");
	}
	
	
}
