package com.cartus.controllers;


import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmailServiceController {
	    @Autowired
	    private JavaMailSender sender;

	    @RequestMapping("/simpleemail")
	    @ResponseBody
	    private String sendEmail(String to,String text,String subject) throws Exception {
	    	try {
	        MimeMessage message = sender.createMimeMessage();

	        MimeMessageHelper helper = new MimeMessageHelper(message, true);

	        helper.setTo(to);
	        helper.setText(text, true);
	        helper.setSubject(subject);
	        sender.send(message);
	        
	        return "Email Sent!";
	        } 
	    	catch (Exception ex) 
	    	{
	        return "Error in sending email: " + ex;
	        }
	    }
	}