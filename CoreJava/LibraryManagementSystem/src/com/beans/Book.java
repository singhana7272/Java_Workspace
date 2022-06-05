package com.beans;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Book {
	
	@Getter
	@Setter
	private String typeOfBook;
	
	@Getter
	@Setter
	private String bookId;
	
	@Getter
	@Setter
	private ArrayList<Customer> customers=new ArrayList<>();
	
	@Getter
	@Setter
	private int lateFeeRate;

	@Override
	public String toString() {
		return "Book [typeOfBook=" + typeOfBook + ", bookId=" + bookId + ", lateFeeRate=" + lateFeeRate + "]";
	}

	
	
	
	
}
