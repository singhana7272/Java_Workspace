package com.anamika.producer;

public class SMS implements Message{
	
	private long senderNo;
	private long receiverNo;


	public SMS(long senderNo, long receiverNo) {
		super();
		this.senderNo = senderNo;
		this.receiverNo = receiverNo;
	}


	@Override
	public void send() {
		System.out.println("My sender email "+ senderNo + " My receiver email "+ receiverNo);
	}

}
