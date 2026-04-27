package com.internshala.whatsapp_chatbot.Service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {
	
	public String answer(String mess) {
		
		if(mess.trim().isEmpty() || mess==null ) {
			return "Enter valid Message";
		}
		
		String input=mess.trim().toLowerCase();
		
		switch(input) {
		
		case "hii":
			return "hello";
		case "bye":
			return "Good bye";
		default:
			return "I didn't understand your message.";
		}
	}

}
