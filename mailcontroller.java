package com.example.demo.controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Demo1Application;



@RestController
public class mailcontroller {

@Autowired
Demo1Application sendingEmailApplication;


  @RequestMapping(value ="sendemail")
  public String send() throws AddressException, MessagingException, IOException {
   //sendEmail();
	sendingEmailApplication.sendEmail();
	
   return "Email sent successfully";   
}





@RequestMapping(value ="sendemailatt")
public String sendA() throws AddressException, MessagingException, IOException {
   //sendEmail();
	//sendingEmailApplication.sendEmail();
	sendingEmailApplication.sendEmailWithAttachment();
   return "Email sent successfully";   
}
}