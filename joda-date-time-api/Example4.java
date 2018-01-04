package com.javamultiplex.datetime;

import java.time.LocalDateTime;

//Demo of LocalDateTime class methods.
public class Example4 {
	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		System.out.println("Day of Month : " + localDateTime.getDayOfMonth());
		System.out.println("Month : " + localDateTime.getMonthValue());
		System.out.println("Year : " + localDateTime.getYear());
		System.out.println("Hour : " + localDateTime.getHour());
		System.out.println("Minute : " + localDateTime.getMinute());
		System.out.println("Second : " + localDateTime.getSecond());
		System.out.println("Nanosecond : " + localDateTime.getNano());
	}
}
