package com.javamultiplex.datetime;

import java.time.LocalTime;

//Demo of LocalTime class methods.
public class Example3 {
	public static void main(String[] args) {

		LocalTime time = LocalTime.now();
		System.out.println("Current Time : " + time);
		int hh = time.getHour();
		int mm = time.getMinute();
		int ss = time.getSecond();
		int nn = time.getNano();
		System.out.printf("%d/%d/%d/%d", hh, mm, ss, nn);
	}
}
