package com.capstone.model;

public class EmailNotification {

	private String sendTo;
	private String subject;
	private String message;
	public EmailNotification(String sendTo, String subject, String message) {
		super();
		this.sendTo = sendTo;
		this.subject = subject;
		this.message = message;
	}
	public EmailNotification() {
		super();
	}
	/**
	 * @return the sendTo
	 */
	public String getSendTo() {
		return sendTo;
	}
	/**
	 * @param sendTo the sendTo to set
	 */
	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
