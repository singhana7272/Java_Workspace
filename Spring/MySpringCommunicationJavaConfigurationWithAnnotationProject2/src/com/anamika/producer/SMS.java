package com.anamika.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sms")
public class SMS implements Message{
	
	private long senderNo;
	private long receiverNo;
	
    
	public SMS(@Value("7887244267") long senderNo,@Value("7652092293") long receiverNo) {
		super();
		this.senderNo = senderNo;
		this.receiverNo = receiverNo;
	}


	@Override
	public void send() {
		System.out.println("My sender email "+ senderNo + " My receiver email "+ receiverNo);
	}

}
