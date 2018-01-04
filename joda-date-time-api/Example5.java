package com.javamultiplex.datetime;

import java.time.LocalDateTime;
import java.time.Month;

//How to create custom date using LocalDateTime class.
public class Example5 {
	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.of(1995, Month.MAY, 28, 12, 45);
		System.out.println(localDateTime);
		System.out.println("After six months : " + localDateTime.plusMonths(6));
		System.out.println("Before six months : " + localDateTime.minusMonths(6));
	}
}
