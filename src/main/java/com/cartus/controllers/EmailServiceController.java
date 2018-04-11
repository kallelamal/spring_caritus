package com.cartus.controllers;

import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailServiceController {
	@Autowired
	private JavaMailSender sender;

	@RequestMapping(value = "/simpleemail", method = RequestMethod.POST)
	@ResponseBody
	private String sendEmail(@RequestBody Map<String, Object> mail) throws Exception {
		try {
			String to;
			String text;
			String subject;
			to = (String) mail.get("to");
			text = (String) mail.get("text");
			subject = (String) mail.get("subject");

			MimeMessage message = sender.createMimeMessage();

			MimeMessageHelper helper = new MimeMessageHelper(message, true);

			helper.setTo(to);
			helper.setText(text, true);
			helper.setSubject(subject);
			sender.send(message);

			return "Email Sent!";
		} catch (Exception ex) {
			return "Error in sending email: " + ex;
		}
	}
}