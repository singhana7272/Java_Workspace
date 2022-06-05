package com.anamika.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mail")
public class Mail implements Message{
	
	private String senderEmail;
	private String receiverEmail;
	
	@Value("preeti@gmail.com")
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	

    @Value("piyu@gmail.com")
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	@Override
	public void send() {
		
	System.out.println("My sender no "+ senderEmail + ", My receiver no "+receiverEmail);	
	}

}
