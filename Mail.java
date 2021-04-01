package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name= "Mail",catalog = "jardin")
public class Mail {

	@Id
	 @GeneratedValue(strategy= GenerationType.AUTO)

	private String sendTo;
	private String subject;
	private String body;
	public Mail(String sendTo, String subject, String body) {
		super();
		this.sendTo = sendTo;
		this.subject = subject;
		this.body = body;
	}
	public Mail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSendTo() {
		return sendTo;
	}
	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	
	
}
