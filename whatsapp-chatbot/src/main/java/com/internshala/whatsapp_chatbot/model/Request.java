package com.internshala.whatsapp_chatbot.model;

public class Request {
	
	private String message;

	public Request() {
		super();
	}

	public Request(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Request [message=" + message + "]";
	}
	
	
	
}
