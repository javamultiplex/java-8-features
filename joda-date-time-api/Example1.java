package com.javamultiplex.datetime;

import java.time.LocalDate;
import java.time.LocalTime;

//How to print current date and time?
public class Example1 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Current Date : " + date);
		LocalTime time = LocalTime.now();
		System.out.println("Current Time : " + time);

	}
}
