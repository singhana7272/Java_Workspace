package com.anamika;

import java.text.SimpleDateFormat;
import java.util.Date;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentDate=new Date();
		SimpleDateFormat currentDateForm=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(currentDateForm.format(currentDate));

	}

}
