package com.internshala.whatsapp_chatbot.model;

public class Response {
	
	private String reply;

	public Response() {
		super();
	}

	public Response(String reply) {
		super();
		this.reply = reply;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	@Override
	public String toString() {
		return "Response [reply=" + reply + "]";
	}
	
	
	

}
