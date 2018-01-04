package com.javamultiplex.datetime;

import java.time.LocalDate;

//Demo of LocalDate class methods.
public class Example2 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Current Date : " + date);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.println(dd + "/" + mm + "/" + yyyy);
		System.out.printf("%d-%d-%d\n", dd, mm, yyyy);

	}
}
