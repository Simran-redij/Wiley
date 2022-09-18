package com.datetime;
import java.time.Duration;
import java.time.LocalTime;
import java.time.Instant;

// duration between two times

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalTime start = LocalTime.of(10, 2, 10);
		LocalTime end = LocalTime.of(11, 2, 8);
		
		Duration d = Duration.between(start, end);
		System.out.println(d);
		
		long duration = Duration.between(start, end).toMillis();
		System.out.println(duration);
		
		Instant startInstant = Instant.now();
		System.out.println(startInstant);
	}

}
