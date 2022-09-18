package com.datetime;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;




public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 Old : before java 8 
//		Date date  = new Date();
//		System.out.println(date);
//		
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(date);
//		
//		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//		System.out.println(calendar.get(Calendar.YEAR));
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDate jan1 = LocalDate.of(2022, Month.FEBRUARY, 1);
		System.out.println(jan1);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		LocalDate ld = LocalDate.parse("29-Mar-2022", formatter);
		System.out.println(ld);
		
	}

}
