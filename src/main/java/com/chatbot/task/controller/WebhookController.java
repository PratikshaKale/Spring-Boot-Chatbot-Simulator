package com.chatbot.task.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatbot.task.model.ChatMessage;

@RestController
@RequestMapping("/webhook")
public class WebhookController {
	
	
	//Logger to log incoming messages and responses
		private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);
		
		@PostMapping
		public String handleIncomingMessage(@RequestBody ChatMessage message) {
			logger.info("Received message from {}: {}", message.getSender(), message.getText());
			
			String input = message.getText().toLowerCase().trim();
			
			// Process the message and generate a response
			if (input.equals("hi")) {
	            return "Hello";
	        } else if (input.equals("bye")) {
	            return "Goodbye";
	        } else {
	            return "I only understand 'Hi' or 'Bye'.";
	        }
		}
		
}
