package com.internshala.whatsapp_chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internshala.whatsapp_chatbot.Service.ChatService;
import com.internshala.whatsapp_chatbot.model.Request;
import com.internshala.whatsapp_chatbot.model.Response;

@RestController
@RequestMapping("/webhook")
public class WebhookController {
	
	@Autowired
	private ChatService chatService;
	
	@PostMapping
	public ResponseEntity<Response> receivemess(@RequestBody Request request){
		
		String ans=chatService.answer(request.getMessage());
		
		return ResponseEntity.ok(new Response(ans));
	}
	

}
