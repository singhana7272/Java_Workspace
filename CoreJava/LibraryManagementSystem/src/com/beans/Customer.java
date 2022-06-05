package com.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
public class Customer {
	
	@Getter
	@Setter
	private int cardId;
	
	@Getter
	@Setter
	private String customerName;
	
	@Getter
	@Setter
	private String bookName;
	
	@Getter
	@Setter
	private String bookIssueDate;
	
	@Getter
	@Setter
	private ArrayList<Book> books=new ArrayList<>();

	@Override
	public String toString() {
		return "Customer [cardId=" + cardId + ", customerName=" + customerName + ", bookName=" + bookName
				+ ", bookIssueDate=" + bookIssueDate + "]";
	}
}
