package com.datetime;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime instance = LocalDateTime.now();
		System.out.println(instance);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm");
		
		String formatDateTime = formatter.format(instance);
		System.out.println(formatDateTime);
		
	}

}
