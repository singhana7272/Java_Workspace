package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CustomerCard {
	private String cardId;
	private int customerId;
	private int noOfBooksIssued;
}
