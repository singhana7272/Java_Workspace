package com.anamika.producer;

public class Mail implements Message{
	
	private String senderEmail;
	private String receiverEmail;
	
	
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	


	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	@Override
	public void send() {
		
	System.out.println("My sender no "+ senderEmail + ", My receiver no "+receiverEmail);	
	}

}
