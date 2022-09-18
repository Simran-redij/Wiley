package com.datetime;
import java.util.Date;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		
		DayOfWeek dayOfWeek = today.getDayOfWeek();
		System.out.println("Date of week : "+dayOfWeek);
		System.out.println("Date of Week : "+dayOfWeek.getValue());
		
		System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ITALY));
		System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
		
	}

}
