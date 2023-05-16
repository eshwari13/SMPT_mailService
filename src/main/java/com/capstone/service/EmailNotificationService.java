package com.capstone.service;

public interface EmailNotificationService {

	void sendEmail(String sendTo, String subject, String message);
}
